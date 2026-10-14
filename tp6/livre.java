package tp6;

public class livre extends article{
	private String editeur;
	public livre(String titre,int num,int nbpages,String auteur,String editeur) {
		super(titre,num,nbpages,auteur);
		this.editeur=editeur;
	}
	
	public String getediteur() {
		return editeur;
		}
	public void setediteur(String editeur) {
		this.editeur=editeur;
	}
	@Override
	public String gettype() {
		return "livre";
	}
	@Override
	public void edition() {
		super.edition();
		System.out.println("editeur : "+editeur);
	}
}
