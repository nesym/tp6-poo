package tp6;

public class periodique extends document{
	private String frequence;
	public periodique(String titre,int num,int nbpages,String frequence) {
		super(titre,num,nbpages);
		this.frequence=frequence;
	}
	public String getfrequence() {
		return frequence;
	}
	public void setfrequence(String frequence) {
		this.frequence=frequence;
	}
	@Override
	public String gettype() {
		return "periodique";
	}
	@Override
	public void edition() {
		super.edition();
		System.out.println("frequence : "+frequence);
	}

}
