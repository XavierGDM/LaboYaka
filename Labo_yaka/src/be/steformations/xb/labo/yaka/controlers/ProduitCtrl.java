package be.steformations.xb.labo.yaka.controlers;

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
		return "/infosProduit.jsp";
	}
	
	@org.springframework.web.bind.annotation.RequestMapping("caracteristique")
	public String showCaracteristiquesByIdProduit(@org.springframework.web.bind.annotation.RequestParam("produit") String id, java.util.Map<String, Object> attributs){
		System.out.println("CaracteristiqueCtrl.showCaracteristiquesByIdProduit()");
		int idconverti = Integer.parseInt(id);
		attributs.put("caracteristique", this.gestionnaireYaka.getCaracteristiqueByIdProduit(idconverti));
		return "/produit.jsp";
	}
	
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
//        gestionnaire.addStatProduit(idp);
//        List<CaracByProprietes> carByProp = new ArrayList<>();
//        for (ProprieteImpl prop : gestionnaire.getProprietesbyProduitId(idp)){
//            System.out.println("ProduitCtrl propId= " + gestionnaire.getProprietesbyProduitId(idp));
//            CaracByProprietes cbp = new CaracByProprietes();
//            List<CaracteristiqueImpl> listCar = new ArrayList<>();
//            listCar = gestionnaire.getCaracteristiquesbyProprieteId(prop.getId(), idp);
//            for (CaracteristiqueImpl car : listCar){
//                System.out.println("ProduitCtrl liste Caracteristiques: " + car.getArticle().size());
//                System.out.println("ProduitCtrl liste Caracteristiques: " + car.getArticle());
//                System.out.println("ProduitCtrl proprieteId: " + car.getProprieteId());
//                for(ArticleImpl art : car.getArticle()){
//                    System.out.println("ProduitCtrl prix: " + art.getPrixHtva());
//                }
//            }
//            cbp.setProp(prop);
//            cbp.setCarac(listCar);
//            carByProp.add(cbp);
//        }
//        return carByProp;
//    }
	
	
}
