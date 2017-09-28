package be.steformations.xb.labo.yaka.controlers;

import be.steformations.xb.labo.yaka.dao.jpa.GestionnaireYaka;

@org.springframework.stereotype.Controller
@org.springframework.context.annotation.Scope("request")
public class CategorieCtrl {
	
	@org.springframework.beans.factory.annotation.Autowired
	private GestionnaireYaka gestionnaireYaka;

	public CategorieCtrl() {
		super();
		System.out.println("ControlerCategorie.ControlerCategorie()");
	}
	
	@org.springframework.web.bind.annotation.RequestMapping("categories")
	public String showAllCategories(java.util.Map<String, Object> attributs){
		System.out.println("CategorieCtrl.showAllCategories()");		
		attributs.put("categories", this.gestionnaireYaka.getAllCategories());
		return "/index.jsp";
	}
	
}
