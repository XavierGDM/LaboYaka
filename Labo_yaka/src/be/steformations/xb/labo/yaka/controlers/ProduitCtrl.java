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
	
	
}
