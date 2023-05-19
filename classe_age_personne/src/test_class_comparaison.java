import java.util.Scanner;

class personne{
	private int numero;
	private String nom;
	private String prenom;
	private int annee_nais;
	
	public personne(int num,String n,String p,int an){
		numero = num;
		nom = n;
		prenom = p;
		annee_nais = an;
	}
	
	public int getNumero(){
		return numero;
	}
	
	public int calculAge(){
		int age = (2023 - annee_nais);
		return age;
	}
	
	public String getNom(){
		return nom;
	}
	
	public String getPrenom(){
		return prenom;
	}
	
	public void afficher(){
		int ag = calculAge();
		System.out.println("Numero : " + numero);
		System.out.println("Nom : " + nom);
		System.out.println("Prenom : " + prenom);
		System.out.println("Annee de naissance : " + annee_nais);
		System.out.println("Age : " + ag );
	}
}

public class test_class_comparaison {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner clavier = new Scanner(System.in);
		int num_1,num_2,an_1,an_2;
		String nom_1,nom_2,prenom_1,prenom_2;
		
		System.out.println("Numero de l'individu 1 ");
		num_1 = clavier.nextInt();
		System.out.println("Nom de l'individu 1 ");
		nom_1 = clavier.next();
		System.out.println("Prenom de l'individu 1 ");
		prenom_1 = clavier.next();
		System.out.println("Annee de naissance l'individu 1 ");
		an_1 = clavier.nextInt();
		
		personne p1 = new personne(num_1,nom_1,prenom_1,an_1);
		
		System.out.println("Numero de l'individu 2 ");
		num_2 = clavier.nextInt();
		System.out.println("Nom de l'individu 2 ");
		nom_2 = clavier.next();
		System.out.println("Prenom de l'individu 2 ");
		prenom_2 = clavier.next();
		System.out.println("Annee de naissance l'individu 2 ");
		an_2 = clavier.nextInt();
		
		personne p2 = new personne(num_2,nom_2,prenom_2,an_2);
		
		
		if(p1.calculAge() > p2.calculAge()){
			System.out.println("L'individu numero " + p1.getNumero() + " est le plus age");
			p1.afficher();
			System.out.print("Le moins age ");
			p2.afficher();
		}else{
			System.out.println("L'individu numero " + p2.getNumero() + " est le plus age");
			p2.afficher();
			System.out.print("Le moins age ");
			p1.afficher();
		}

	}

}
