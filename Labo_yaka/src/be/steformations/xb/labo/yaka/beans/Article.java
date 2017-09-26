package be.steformations.xb.labo.yaka.beans;

public class Article {
	
	private int id;
	private float prixHtva;
	private Commande commande;
	private java.util.List<Caracteristique> caracteristiques;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getPrixHtva() {
		return prixHtva;
	}
	public void setPrixHtva(float prixHtva) {
		this.prixHtva = prixHtva;
	}
	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	public java.util.List<Caracteristique> getCaracteristiques() {
		return caracteristiques;
	}
	public void setCaracteristiques(java.util.List<Caracteristique> caracteristiques) {
		this.caracteristiques = caracteristiques;
	}
	
	
}
