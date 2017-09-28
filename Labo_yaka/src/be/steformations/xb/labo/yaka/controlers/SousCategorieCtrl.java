package be.steformations.xb.labo.yaka.controlers;

import be.steformations.xb.labo.yaka.dao.jpa.GestionnaireYaka;

@org.springframework.stereotype.Controller
@org.springframework.context.annotation.Scope("request")
public class SousCategorieCtrl {
	
	@org.springframework.beans.factory.annotation.Autowired
	private GestionnaireYaka gestionnaireYaka;
	
	public SousCategorieCtrl() {
		super();
		System.out.println("SousCategorieCtrl.SousCategorieCtrl()");
	}
	
	@org.springframework.web.bind.annotation.RequestMapping("sousCategorie")
	public String showSousCategoriesById(@org.springframework.web.bind.annotation.RequestParam("categ") String id,java.util.Map<String, Object> attributs){
		System.out.println("SousCategorieCtrl.ShowAllSousCategories()");
		int idconverti = Integer.parseInt(id);
		attributs.put("sousCategories", this.gestionnaireYaka.getSousCategoriesById(idconverti));
		return "/sousCategories.jsp";
	}
}
