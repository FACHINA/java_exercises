import java.util.Scanner;

class arbre{
	private String code;
	private String type;
	private int taille;
	
	public arbre (String c, String t, int ta){
		code = c;
		type = t;
		taille = ta;
	}
	
	public String getType(){
		return type;
	}
	
	public int getTaille(){
		return taille;
	}
	
	public void setTaille(int new_taille){
		taille = new_taille;
	}
	
	public int calculMontant(char typ,int tail){
		int montant = 0;
		switch(typ){
			case 'A':
			montant = 4000 * tail;
			break;
			case 'T':
			montant = 3000 * tail;
			break;
			case 'K':
			montant = 3500 * tail;
			break;
			case 'C':
			montant = 2500 * tail;
			break;
			default :
			System.out.println("Arbre invalide");
			break;
		}
		return montant;
	}
	
	public void afficher(){
		System.out.println("---Facture d'achats---");
		System.out.println("Code : " + code);
		System.out.println("Type : " + type);
		System.out.println("Taille: " + taille);
		
	}
}

public class test_class_arbre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
		String code,type = "";
		char type_arbre;
		int taille_arbre,prix = 0;
		
		System.out.println("Entrer le code de l'arbre");
		code = clavier.next();
		
		System.out.println("Entrer le type de l'arbre");
		System.out.println("[A] - Abzeria (4000 f)");
		System.out.println("[T] - Teck (3000 f)");
		System.out.println("[K] - Kosso (3500 f)");
		System.out.println("[C] - Cadjou (2500 f)");
		type_arbre = clavier.next().charAt(0);
		
		System.out.println("Entrer la taille de l'arbre");
		taille_arbre = clavier.nextInt();
		
		switch(type_arbre){
			case 'A':
				type = "Abzeria";
				prix = 4000;
			break;
			case 'T':
				type = "Teck";
				prix = 3000;
			break;
			case 'K':
				type = "Kosso";
				prix = 3500;
			break;
			case 'C':
				type = "Cadjou";
				prix = 2500;
			break;
			default :
			System.out.println("Arbre inconnu");
			break;
		}
		
		arbre p1 = new arbre(code,type,taille_arbre);
		
		p1.afficher();
		System.out.println("Prix : " + prix);
		System.out.println("Montant : " + p1.calculMontant(type_arbre,taille_arbre) );
		

	}

}
