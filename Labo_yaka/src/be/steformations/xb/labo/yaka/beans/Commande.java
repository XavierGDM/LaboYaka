package be.steformations.xb.labo.yaka.beans;

public class Commande {

	private int id;
	private java.util.Date date;
	private boolean facture;
	private java.util.List<Article> articles;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public java.util.Date getDate() {
		return date;
	}
	public void setDate(java.util.Date date) {
		this.date = date;
	}
	public boolean isFacture() {
		return facture;
	}
	public void setFacture(boolean facture) {
		this.facture = facture;
	}
	public java.util.List<Article> getArticles() {
		return articles;
	}
	public void setArticles(java.util.List<Article> articles) {
		this.articles = articles;
	}

	
	
	
	
}
