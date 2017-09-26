package be.steformations.xb.labo.yaka.dao.jpa;

import be.steformations.xb.labo.yaka.beans.Categorie;

@org.springframework.stereotype.Service
@org.springframework.context.annotation.Scope("application")
public class GestionnaireYaka {

	protected javax.persistence.EntityManager em;
	
	public GestionnaireYaka(javax.persistence.EntityManager em) {
		super();
		this.em = em;
	}
	
	public java.util.List<Categorie> getAllCategories(){
		return this.em.createNamedQuery("getAllCategories", Categorie.class).getResultList();
	}
	
	
}
