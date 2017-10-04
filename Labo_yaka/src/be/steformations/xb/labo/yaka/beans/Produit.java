package be.steformations.xb.labo.yaka.beans;

public class Produit {

	private int id;
	private String nom;
	private String vignette;
	private String image;
	private String desc_courte;
	private String desc_longue;
	private int prod_stat;
	private SousCategorie sousCategorie;
	private java.util.List<Produit> sousProduit;
//	private java.util.List<Caracteristique> caracteristiques;
	
	
	public int getId() {
		return id;
	}
	public java.util.List<Produit> getSousProduit() {
		return sousProduit;
	}
	public void setSousProduit(java.util.List<Produit> sousProduit) {
		this.sousProduit = sousProduit;
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
	public String getVignette() {
		return vignette;
	}
	public void setVignette(String vignette) {
		this.vignette = vignette;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDesc_courte() {
		return desc_courte;
	}
	public void setDesc_courte(String desc_courte) {
		this.desc_courte = desc_courte;
	}
	public String getDesc_longue() {
		return desc_longue;
	}
	public void setDesc_longue(String desc_longue) {
		this.desc_longue = desc_longue;
	}
	public int getProd_stat() {
		return prod_stat;
	}
	public void setProd_stat(int prod_stat) {
		this.prod_stat = prod_stat;
	}
	public SousCategorie getSousCategorie() {
		return sousCategorie;
	}
	public void setSousCategorie(SousCategorie sousCategorie) {
		this.sousCategorie = sousCategorie;
	}
//	public java.util.List<Caracteristique> getCaracteristiques() {
//		return caracteristiques;
//	}
//	public void setCaracteristiques(java.util.List<Caracteristique> caracteristiques) {
//		this.caracteristiques = caracteristiques;
//	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((caracteristiques == null) ? 0 : caracteristiques.hashCode());
//		result = prime * result + ((desc_courte == null) ? 0 : desc_courte.hashCode());
//		result = prime * result + ((desc_longue == null) ? 0 : desc_longue.hashCode());
//		result = prime * result + id;
//		result = prime * result + ((image == null) ? 0 : image.hashCode());
//		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
//		result = prime * result + prod_stat;
//		result = prime * result + ((sousCategorie == null) ? 0 : sousCategorie.hashCode());
//		result = prime * result + ((vignette == null) ? 0 : vignette.hashCode());
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
//		Produit other = (Produit) obj;
//		if (caracteristiques == null) {
//			if (other.caracteristiques != null)
//				return false;
//		} else if (!caracteristiques.equals(other.caracteristiques))
//			return false;
//		if (desc_courte == null) {
//			if (other.desc_courte != null)
//				return false;
//		} else if (!desc_courte.equals(other.desc_courte))
//			return false;
//		if (desc_longue == null) {
//			if (other.desc_longue != null)
//				return false;
//		} else if (!desc_longue.equals(other.desc_longue))
//			return false;
//		if (id != other.id)
//			return false;
//		if (image == null) {
//			if (other.image != null)
//				return false;
//		} else if (!image.equals(other.image))
//			return false;
//		if (nom == null) {
//			if (other.nom != null)
//				return false;
//		} else if (!nom.equals(other.nom))
//			return false;
//		if (prod_stat != other.prod_stat)
//			return false;
//		if (sousCategorie == null) {
//			if (other.sousCategorie != null)
//				return false;
//		} else if (!sousCategorie.equals(other.sousCategorie))
//			return false;
//		if (vignette == null) {
//			if (other.vignette != null)
//				return false;
//		} else if (!vignette.equals(other.vignette))
//			return false;
//		return true;
//	}
	
	
}
