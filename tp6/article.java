package tp6;

public class article extends document{
	private String auteur;
	public article(String titre,int num,int nbpages,String auteur) {
		super(titre,num,nbpages);
		this.auteur=auteur;
	}
	
	public String getauteur() {
		return auteur;
	}
	public void setauteur(String auteur) {
		this.auteur=auteur;
	}
	@Override
	public String gettype() {
		return "article";
	}
	@Override
	public void edition() {
		super.edition();
		System.out.println("auteur : "+auteur);
	}
}
