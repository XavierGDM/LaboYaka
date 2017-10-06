package be.steformations.xb.labo.yaka.controlers;

import java.util.ArrayList;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import be.steformations.xb.labo.yaka.beans.Caracteristique;
import be.steformations.xb.labo.yaka.beans.CaracteristiquesProduit;
import be.steformations.xb.labo.yaka.beans.Propriete;
import be.steformations.xb.labo.yaka.dao.jpa.GestionnaireYaka;

@org.springframework.stereotype.Controller
@org.springframework.context.annotation.Scope("request")
public class ProduitCtrl {

	@org.springframework.beans.factory.annotation.Autowired
	private GestionnaireYaka gestionnaireYaka;
	
	public ProduitCtrl() {
		super();
		System.out.println("ProduitCtrl.ProduitCtrl()");
	}
	
	@org.springframework.web.bind.annotation.RequestMapping("produits")
	public String showProduitsById(@org.springframework.web.bind.annotation.RequestParam("scateg") String id,java.util.Map<String, Object> attributs){
		System.out.println("ProduitCtrl.showSousCategoriesById()");
		int idconverti = Integer.parseInt(id);
		attributs.put("produits", this.gestionnaireYaka.getProduitsById(idconverti));
		return "/produits.jsp";
	}
	
	@org.springframework.web.bind.annotation.RequestMapping("infosProduit")
	public String showProduitsByHisId(@org.springframework.web.bind.annotation.RequestParam("produit") String id, java.util.Map<String, Object> attributs){
		System.out.println("ProduitCtrl.showProduitsByHisId()");
		int idconverti = Integer.parseInt(id);
		attributs.put("infosProduit", this.gestionnaireYaka.getProduitByHisId(idconverti));
		attributs.put("caracteristiques", this.listeCaracteristiques(idconverti, idconverti));
		return "/infosProduit.jsp";
	}
	
	public String showSousProduit(@org.springframework.web.bind.annotation.RequestParam("produit") String id, java.util.Map<String, Object> attributs){
		System.out.println("ProduitCtrl.showSousProduit()");
		int idconverti = Integer.parseInt(id);
		attributs.put("sousProduit", this.gestionnaireYaka.getProduitByHisId(idconverti));
		return "/infosProduit.jsp";
	}
//	@org.springframework.web.bind.annotation.RequestMapping("caracteristiquesProduit")
	public List<CaracteristiquesProduit> showCaracteristiques(@org.springframework.web.bind.annotation.RequestParam("produit") String id,
			@org.springframework.web.bind.annotation.RequestParam("propriete") String idProp
			, java.util.Map<String, Object> attributs){
		System.out.println("ProduitCtrl.showCaracteristiques()");
		List<CaracteristiquesProduit> listeProp = new ArrayList<>();
		int idconverti = Integer.parseInt(id);
		int idPropConv = Integer.parseInt(idProp);
		attributs.put("caracteristiques", this.gestionnaireYaka.getCaracteristiquesByProduit(idconverti, idPropConv));
		return listeProp;
	}
	
	//essai affichage categories
	@org.springframework.web.bind.annotation.RequestMapping("caracteristiquesProduit")
	public List<CaracteristiquesProduit> listeCaracteristiques(int idProp, int id){
		System.out.println("ProduitCtrl.listeCaracteristiques()");
		List<CaracteristiquesProduit> caracteristiquesProduit = new ArrayList<>();
		System.out.println("idProp == " + idProp);
		System.out.println("==============================" + gestionnaireYaka.getProprieteByProduit(idProp).size());
		//afficher caracteristique d'abord puis ensuite propriete (chaque carac contient des proprietes) a partir de la carac on y a accès
		
		for(Caracteristique carac : gestionnaireYaka.getCaracteristiquesByProduit(id, idProp)){
			System.out.println("ProduitCtrl.listeCaracteristiques()");
			CaracteristiquesProduit cp = new CaracteristiquesProduit();
			List<Caracteristique> listCar = new ArrayList<>();
			listCar = gestionnaireYaka.getCaracteristiquesByProduit(carac.getId(), idProp);
			//cp.setCaracteristiques(????);
			cp.setCaracteristiques(listCar);
			caracteristiquesProduit.add(cp);
		}
		System.out.println("ProduitCtrl.listeCaracteristiques() == ");
		System.out.println(caracteristiquesProduit.size());
		return caracteristiquesProduit;
	}
	
	///CETTE VERSION DE LA FONCTION AFFICHE UNE SEULE DES CARACTERISTIQUE/PROPRIETE
//	@org.springframework.web.bind.annotation.RequestMapping("caracteristiquesProduit")
//	public List<CaracteristiquesProduit> listeCaracteristiques(int idProp){
//		System.out.println("ProduitCtrl.listeCaracteristiques()");
//		List<CaracteristiquesProduit> caracteristiquesProduit = new ArrayList<>();
//		System.out.println("idProp == " + idProp);
//		System.out.println("==============================" + gestionnaireYaka.getProprieteByProduit(idProp).size());
//		//afficher caracteristique d'abord puis ensuite propriete
//		
//		for(Propriete prop : gestionnaireYaka.getProprieteByProduit(idProp)){
//			System.out.println("ProduitCtrl.listeCaracteristiques()");
//			CaracteristiquesProduit cp = new CaracteristiquesProduit();
//			List<Caracteristique> listCar = new ArrayList<>();
//			listCar = gestionnaireYaka.getCaracteristiquesByProduit(prop.getId(), idProp);
//			cp.setPropriete(prop);
//			cp.setCaracteristiques(listCar);
//			caracteristiquesProduit.add(cp);
//		}
//		System.out.println("ProduitCtrl.listeCaracteristiques() == ");
//		System.out.println(caracteristiquesProduit.size());
//		return caracteristiquesProduit;
//	}
	
	
//	private List<CaracByProprietes> listeCaracteristiques(int idp){
//        System.out.println("ProduitCtrl.afficherProduit(" + idp + ")");
////        gestionnaire.addStatProduit(idp);
//        List<CaracByProprietes> carByProp = new ArrayList<>();
//        for (ProprieteImpl prop : gestionnaire.getProprietesbyProduitId(idp)){
//            System.out.println("ProduitCtrl propId= " + gestionnaire.getProprietesbyProduitId(idp));
//            CaracByProprietes cbp = new CaracByProprietes();
//            List<CaracteristiqueImpl> listCar = new ArrayList<>();
//            listCar = gestionnaire.getCaracteristiquesbyProprieteId(prop.getId(), idp);
//            cbp.setProp(prop);
//            cbp.setCarac(listCar);
//            carByProp.add(cbp);
//        }
//        return carByProp;
//    }
	
//	@org.springframework.web.bind.annotation.RequestMapping("caracteristique")
//	public String showCaracteristiquesByIdProduit(@org.springframework.web.bind.annotation.RequestParam("produit") String id, java.util.Map<String, Object> attributs){
//		System.out.println("CaracteristiqueCtrl.showCaracteristiquesByIdProduit()");
//		int idconverti = Integer.parseInt(id);
//		attributs.put("caracteristique", this.gestionnaireYaka.getCaracteristiqueByIdProduit(idconverti));
//		return "/produit.jsp";
//	}
	
//	@org.springframework.web.bind.annotation.RequestMapping("selectProduit")
//		public String afficherProduit(
//				@org.springframework.web.bind.annotation.RequestParam("produit") String id,
//				java.util.Map<String, Object> attributs
//				){
//		int idconverti = Integer.parseInt(id);
//		System.out.println("ProduitCtrl.afficherProduit(" + idconverti + ")");
//		
//		List<Caracteristique> carByProp = new ArrayList<>();
//		
//		attributs.put("afficherProduit", gestionnaireYaka.getProduitsById(idconverti));
//		attributs.put("afficherCaracteristiques", gestionnaireYaka.getCaracteristiqueByIdProduit(idconverti));
//		return "infosProduit.jsp";
//	}
//
//	
//	public String afficherCaracteristiques(int idp){
//		System.out.println("ProduitCtrl.afficherCaracteristiques()");
//		java.util.List<Caracteristique> listeCarac = new ArrayList<>();
//		
//		return "";
//	}
//	@org.springframework.web.bind.annotation.RequestMapping("selectProduit")
//    public String afficherProduit(
//            @org.springframework.web.bind.annotation.RequestParam("produitId") String id,
//            java.util.Map<String, Object> attributs
//            ){
//        int prodId = Integer.parseInt(id);
//        System.out.println("ProduitCtrl.afficherProduit(" + prodId + ")");
//
////        gestionnaire.addStatProduit(prodId);
//
//        List<CaracByProprietes> carByProp = new ArrayList<>();
//
//        attributs.put("afficheUnProduit", gestionnaire.getProduitbyId(prodId));
//        attributs.put("afficherProprietes", listeCaracteristiques(prodId));
//        return "/detailProduit.jsp";
//    }
	
	
//private List<CaracByProprietes> listeCaracteristiques(int idp){
//        System.out.println("ProduitCtrl.afficherProduit(" + idp + ")");
//        gestionnaire.addStatProduit(idp); ---->MonZbi
//        List<CaracByProprietes> carByProp = new ArrayList<>();
//        for (ProprieteImpl prop : gestionnaire.getProprietesbyProduitId(idp)){
//            System.out.println("ProduitCtrl propId= " + gestionnaire.getProprietesbyProduitId(idp));
//            CaracByProprietes cbp = new CaracByProprietes();---->MonZbi
//            List<CaracteristiqueImpl> listCar = new ArrayList<>();---->MonZbi
//            listCar = gestionnaire.getCaracteristiquesbyProprieteId(prop.getId(), idp);
//            for (CaracteristiqueImpl car : listCar){
//                System.out.println("ProduitCtrl liste Caracteristiques: " + car.getArticle().size());
//                System.out.println("ProduitCtrl liste Caracteristiques: " + car.getArticle());
//                System.out.println("ProduitCtrl proprieteId: " + car.getProprieteId());
//                for(ArticleImpl art : car.getArticle()){---->MonZbi
//                    System.out.println("ProduitCtrl prix: " + art.getPrixHtva());
//                }
//            }
//            cbp.setProp(prop);---->MonZbi
//            cbp.setCarac(listCar);
//            carByProp.add(cbp);---->MonZbi
//        }
//        return carByProp;
//    }
	
	
}
