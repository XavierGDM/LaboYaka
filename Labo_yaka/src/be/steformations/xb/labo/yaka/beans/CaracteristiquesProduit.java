package be.steformations.xb.labo.yaka.beans;

public class CaracteristiquesProduit {

	
	//TABLE INTERMEDIAIRE
	private Propriete propriete;
	private java.util.List<Caracteristique> caracteristiques;
	
	public Propriete getPropriete() {
		return propriete;
	}
	public void setPropriete(Propriete propriete) {
		this.propriete = propriete;
	}
	public java.util.List<Caracteristique> getCaracteristiques() {
		return caracteristiques;
	}
	public void setCaracteristiques(java.util.List<Caracteristique> caracteristiques) {
		this.caracteristiques = caracteristiques;
	}
	
	
	
}
