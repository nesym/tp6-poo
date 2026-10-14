package tp6;

public class document {
	private String titre;
	private int num;
	private int nbpages;


public document(String titre,int num,int nbpages) {
	this.titre=titre;
	this.num=num;
	this.nbpages=nbpages;
}

public String gettitre() {
	return titre;
}

public int getnum() {
	return num;
}

public int getnbpages() {
	return nbpages;
}

public void settitre(String titre) {
	this.titre=titre;
}

public void setnum(int num) {
	this.num=num;
}

public void setnbpages(int nbpages) {
	this.nbpages=nbpages;
}

public String gettype() {
	return "document simple";
}

public void edition() {
	System.out.println("type : "+gettype());
	System.out.println("titre : "+gettitre());
	System.out.println("nbre de pages : "+getnbpages());
	System.out.println("numero : "+getnum());
}
}






