package tp6;

public class test {
	public static void main(String[]args) {
		bibliotheque b = new bibliotheque(10);
		document d1=new document("introduction java",10,100);
		article a1=new article("POO en java",5,20,"ahmed");
		livre l1=new livre("base de donnes",3,250,"ali","eyrolles");
		periodique p1=new periodique("science magazine",8,60,"mensuelle");
		
		b.ajout_doc(d1);
		b.ajout_doc(a1);
		b.ajout_doc(l1);
		b.ajout_doc(p1);
		
		b.inventaire_doc();
		
		System.out.println("\n---livres---");
		b.liste_article().inventaire_doc();
		
		System.out.println("\n---documents simples---");
		b.liste_docsimples().inventaire_doc();
		
		System.out.println("\n---periodiques---");
		b.liste_periodique().inventaire_doc();
		
		System.out.println("\n---suppression---");
		b.supprim_doc(5);
		
		b.inventaire_doc();
		
		System.out.println("capacite : "+b.getcapacite());
		System.out.println("nombre : "+b.getnbr_document());
		
	}
}
