import java.util.Scanner;

class type{
	private char id;
	private String libelle;
	private int prix;
	
	public type(char i, String l, int p){
		id = i;
		libelle = l;
		prix = p;
	}
	
	public char getId(){
		return id;
	}
	
	public String getLibelle(){
		return libelle;
	}
	
	public int getPrix(){
		return prix;
	}
	
	public void afficher(){
		System.out.println("---Type d'arbre---");
		System.out.println("Id : " + id);
		System.out.println("Libelle : " + libelle);
		System.out.println("Prix : " + prix);
	}
	
}

class arbre{
	private String code;
	private int taille;
	private type Type;
	
	public arbre (String c,int ta,type t){
		code = c;
		taille = ta;
		Type = t;
	}
	
	public int getTaille(){
		return taille;
	}
	
	public int calculMontant(int prix,int tail){
		int montant = prix * tail;
		return montant;
	}
	
	public void afficher(){
		System.out.println("---Facture d'achat---");
		System.out.println("Code : " + code);
		System.out.println("Type : " + Type.getLibelle());
		System.out.println("Prix : " + Type.getPrix());
		System.out.println("Taille: " + taille);
		
	}
}

public class test_multi_class {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
		String code,libelle = "";
		char type_arbre;
		int taille_arbre,prix = 0;
		
		System.out.println("Entrer le code de l'arbre");
		code = clavier.next();
		
		System.out.println("Choisissez le type de l'arbre");
		System.out.println("[A] - Abzeria (4000 f)");
		System.out.println("[T] - Teck (3000 f)");
		System.out.println("[K] - Kosso (3500 f)");
		System.out.println("[C] - Cadjou (2500 f)");
		type_arbre = clavier.next().charAt(0);
		
		System.out.println("Entrer la taille de l'arbre");
		taille_arbre = clavier.nextInt();
		
		type t1 = new type('A',"Abzeria",4000);
		type t2 = new type('T',"Teck",3000);
		type t3 = new type('K',"Kosso",3500);
		type t4 = new type('C',"Cadjou",2500);
			
		switch(type_arbre){
			case 'A':
				libelle = t1.getLibelle();
				prix = t1.getPrix();
			break;
			case 'T':
				libelle = t2.getLibelle();
				prix = t2.getPrix();
			break;
			case 'K':
				libelle = t3.getLibelle();
				prix = t3.getPrix();
			break;
			case 'C':
				libelle = t4.getLibelle();
				prix = t4.getPrix();
			break;
			default :
			System.out.println("Arbre inconnu");
			break;
		}
		
		type T = new type (type_arbre,libelle,prix);
		arbre p1 = new arbre(code,taille_arbre,T);
		
		//T.afficher();
		p1.afficher();
		System.out.println("Montant : " + p1.calculMontant(prix,taille_arbre) );
		


	}

}
