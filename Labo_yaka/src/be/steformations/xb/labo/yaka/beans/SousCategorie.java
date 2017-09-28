package be.steformations.xb.labo.yaka.beans;

public class SousCategorie {
	private int id;
	private String nom;
	private Categorie categorie;
	private int scat_stat;
//	private java.util.List<Produit> produits;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public int getScat_stat() {
		return scat_stat;
	}
	public void setScat_stat(int scat_stat) {
		this.scat_stat = scat_stat;
	}
//	public java.util.List<Produit> getProduits() {
//		return produits;
//	}
//	public void setProduits(java.util.List<Produit> produits) {
//		this.produits = produits;
//	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((categorie == null) ? 0 : categorie.hashCode());
//		result = prime * result + id;
//		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
//		result = prime * result + ((produits == null) ? 0 : produits.hashCode());
//		result = prime * result + scat_stat;
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		SousCategorie other = (SousCategorie) obj;
//		if (categorie == null) {
//			if (other.categorie != null)
//				return false;
//		} else if (!categorie.equals(other.categorie))
//			return false;
//		if (id != other.id)
//			return false;
//		if (nom == null) {
//			if (other.nom != null)
//				return false;
//		} else if (!nom.equals(other.nom))
//			return false;
//		if (produits == null) {
//			if (other.produits != null)
//				return false;
//		} else if (!produits.equals(other.produits))
//			return false;
//		if (scat_stat != other.scat_stat)
//			return false;
//		return true;
//	} 
	
	
	
}
