import java.util.Scanner;

		
class Etudiant {
			//Déclaration_des_attributs
			private int Matricule;
			private String Nom;
			private String Prenom;
			private char sexe;
			private int AnneeNais;
			//Methode_Etudiant
			//Creation_du_constructeur_etudiant
			public Etudiant( int M,String N, String P, char S, int A){
				Matricule=M;
				Nom=N;
				Prenom=P;
				sexe=S;
				AnneeNais=A;
			}
		
		//methode_pour modifier le_nom_de l'etudiant ("void" ne_retourne_rien)
		public void ModifierNom (String no){
			Nom=no;
		}
		public int CalculAge(){
			int Res;
			Res=2022-AnneeNais;
			return Res;
		}
		//methode_pour_calculer_l'age_avec_l'annee_de_naissance
		public void Afficher(){
			
				int a = CalculAge();
				System.out.println("Matricule : "+Matricule);
				System.out.println("Nom : "+Nom);
				System.out.println("Prenom : "+Prenom);
				System.out.println("Sexe : "+sexe);
				System.out.println("Age : "+a);
			
		}
	}
	
public class testetudiant {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creation_d'une_instance_de_etudiant
		Scanner clavier = new Scanner(System.in);
		//Etudiant E1 = new Etudiant(4010,"AGOSSOU","Bruno",'M',2002);
		//E1.CalculAge();
		//E1.Afficher();
		//E1.ModifierNom("AGOSSOUVI");
		//E1.Afficher();
		System.out.println("Entrer les infos");
		int Ma = clavier.nextInt();
		String No = clavier.next();
		String Pr = clavier.next();
		char Se = clavier.next().charAt(0);
		int an = clavier.nextInt();
		Etudiant E1 = new Etudiant(Ma,No,Pr,Se,an);
		E1.CalculAge();
		E1.Afficher();
		System.out.println("Entrer le nouveau nom");
		String New = clavier.next();
		E1.ModifierNom(New);
		E1.Afficher();
		
	}

}
