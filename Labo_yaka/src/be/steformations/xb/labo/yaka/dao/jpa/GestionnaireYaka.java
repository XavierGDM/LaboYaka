package be.steformations.xb.labo.yaka.dao.jpa;

import be.steformations.xb.labo.yaka.beans.Categorie;
import be.steformations.xb.labo.yaka.beans.Produit;
import be.steformations.xb.labo.yaka.beans.SousCategorie;

@org.springframework.stereotype.Service
@org.springframework.context.annotation.Scope("application")
public class GestionnaireYaka {

	private javax.persistence.EntityManager em;
		
	public GestionnaireYaka() {
		this.em = javax.persistence.Persistence.createEntityManagerFactory("postgresql_eclipselink").createEntityManager();
	}
	
	public java.util.List<Categorie> getAllCategories(){
		return this.em.createNamedQuery("getAllCategories", Categorie.class).getResultList();
	}

	public java.util.List<SousCategorie> getAllSousCategories() {
		return this.em.createNamedQuery("getAllSousCategories", SousCategorie.class).getResultList();
	}

	public Object getSousCategoriesById(int id) {
		return this.em.createNamedQuery("getSousCategoriesById", SousCategorie.class).setParameter("id", id).getResultList();
	}

	public Object getProduitsById(int id) {
		return this.em.createNamedQuery("getProduitsById", Produit.class).setParameter("id", id).getResultList();
	}
	
	public Object getProduitByHisId(int id) {
		return this.em.find(Produit.class, id); 
	}
}
