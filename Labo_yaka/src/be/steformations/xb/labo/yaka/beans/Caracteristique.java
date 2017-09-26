package be.steformations.xb.labo.yaka.beans;

public class Caracteristique {

	private int id;
	private Produit produit;
	private Propriete propriete;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	public Propriete getPropriete() {
		return propriete;
	}
	public void setPropriete(Propriete propriete) {
		this.propriete = propriete;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((produit == null) ? 0 : produit.hashCode());
		result = prime * result + ((propriete == null) ? 0 : propriete.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Caracteristique other = (Caracteristique) obj;
		if (id != other.id)
			return false;
		if (produit == null) {
			if (other.produit != null)
				return false;
		} else if (!produit.equals(other.produit))
			return false;
		if (propriete == null) {
			if (other.propriete != null)
				return false;
		} else if (!propriete.equals(other.propriete))
			return false;
		return true;
	}
	
	
}
