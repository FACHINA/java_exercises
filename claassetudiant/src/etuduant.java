
public class etuduant {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		class Etudiant {
			//Déclaration des attributs
			private int Matricule;
			private String Nom;
			private String Prenom;
			private char sexe;
			private int AnneeNais;
			//Methode Etudiant
			//Creation du constructeur etudiant
			public Etudiant( int M,String N, String P, char S, int A){
				Matricule=M;
				Nom=N;
				Prenom=P;
				sexe=S;
				AnneeNais=A;
			}
		}
		//methode pour modifier le nom de l'etudiant ("void" ne retourne rien)
		public void ModifierNom (String no){
			Nom=no;
		}
		//methode pour calculer l'age avec l'annee de naissance
		public int CalculAge(){
			void (){
				int a = CalculAge();
				System.out.println("Matricule"+Matricule);
				System.out.println("Nom"+Nom);
				System.out.println("Prenom"+Prenom);
				System.out.println("Sexe"+sexe);
				System.out.println("Age"+a)
			}
		}
	}

}
