package tp6;

public class bibliotheque {
	private document[] listdoc;
	private int nbr_document;
	private int capacite;
	
	public bibliotheque(int capacite) {
		this.capacite=capacite;
		listdoc=new document[capacite];
		nbr_document=0;
	}
	public int getcapacite() {
		return capacite;
	}
	public int getnbr_document() {
		return nbr_document;
	}
	public void ajout_doc(document d) {
		if(nbr_document>=capacite) {
			System.out.println("bibliotheque pleine");
			return;
		}
		if(d==null) {
			System.out.println("document invalide");
			return;
		}
		int i=0;
		while(i<nbr_document && listdoc[i].getnum()<d.getnum()) {
			i++;
		}
		if (i<nbr_document && listdoc[i].getnum()==d.getnum()) {
			System.out.println("numero deja existant");
			return;
		}
		for(int j=nbr_document;j>i;j--) {
			listdoc[j]=listdoc[j-1];
		}
		listdoc[i]=d;
		nbr_document++;
	}
	public void supprim_doc(int num) {
		int i=0;
		while (i<nbr_document && listdoc[i].getnum()!=num) {
			i++;
		}
		if(i==nbr_document) {
			System.out.println("document introuvable");
			return;
		}
		for(int j=i;j<nbr_document-1;j++) {
			listdoc[j]=listdoc[j+1];
		}
		listdoc[nbr_document-1]=null;
		nbr_document--;
	}
	public void inventaire_doc() {
		System.out.println("\n ---inventaire---");
		for(int i=0;i<nbr_document;i++) {
			listdoc[i].edition();
			System.out.println("------------------");
		}
		System.out.println("nombre de documents : "+nbr_document);
	}
	public bibliotheque liste_livre() {
		bibliotheque b =new bibliotheque(capacite);
		for(int i=0;i<nbr_document;i++) {
			if(listdoc[i] instanceof livre) {
				b.ajout_doc(listdoc[i]);
			}
		}
		return b;
	}
	
	public bibliotheque liste_article() {
		bibliotheque b=new bibliotheque(capacite);
		for(int i=0;i<nbr_document;i++) {
			if(listdoc[i] instanceof article && !(listdoc[i] instanceof livre)) {
				b.ajout_doc(listdoc[i]);
			}
		}
		return b;
	}
	
	public bibliotheque liste_docsimples() {
		bibliotheque b =new bibliotheque(capacite);
		for(int i=0;i<nbr_document;i++) {
			if(listdoc[i].getClass()==document.class) {
				b.ajout_doc(listdoc[i]);
			}
		}
		return b;
	}
		
	public bibliotheque liste_periodique() {
		bibliotheque b = new bibliotheque(capacite);
		for(int i=0;i<nbr_document;i++) {
			if(listdoc[i] instanceof periodique) {
				b.ajout_doc(listdoc[i]);
			}
		}
		return b;
	}
	
	
	
	
	
	
	
	
}
