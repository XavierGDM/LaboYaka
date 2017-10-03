package be.steformations.xb.labo.yaka.beans;

public class Caracteristique {

	private int id;
	private String valeur;
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
	public String getValeur() {
		return valeur;
	}
	public void setValeur(String valeur) {
		this.valeur = valeur;
	}
	
	
	
}
