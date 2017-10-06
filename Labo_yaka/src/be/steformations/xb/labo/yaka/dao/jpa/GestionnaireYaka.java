package be.steformations.xb.labo.yaka.dao.jpa;

import java.util.List;

import be.steformations.xb.labo.yaka.beans.Caracteristique;
import be.steformations.xb.labo.yaka.beans.CaracteristiquesProduit;
import be.steformations.xb.labo.yaka.beans.Categorie;
import be.steformations.xb.labo.yaka.beans.Produit;
import be.steformations.xb.labo.yaka.beans.Propriete;
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
//		return this.em.createNamedQuery("getProduitByHisId", Produit.class).setParameter("id", id).getResultList();
	}

	public java.util.List<Caracteristique> getCaracteristiquesByProduit(int id, int idProp) {
		return this.em.createNamedQuery("getCaracteristiquesByProduit", Caracteristique.class).setParameter("id", id).setParameter("idProp", idProp).getResultList();
	}

	public java.util.List<Propriete> getProprieteByProduit(int idProp) {
		return this.em.createNamedQuery("getProprieteByProduit", Propriete.class).setParameter("idProp", idProp).getResultList();
	}

//	public Object getCaracteristiqueByIdProduit(int id) {
//		return this.em.createNamedQuery("getCaracteristiqueByIdProduit", Caracteristique.class).setParameter("id", id).getResultList();
//	}

	
	
	
	
}
