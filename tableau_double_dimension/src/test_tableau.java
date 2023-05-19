import java.util.Scanner;
public class test_tableau {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
		int l = 3,c = 5,j,k;
		String nom;
		double moyenne,somme,note;
		
		String Noms[] = new String[c];
		double Notes[][] = new double[l][c];
		
		for(int i = 0; i < c; i++){
			System.out.println("Entrer le nom de l'etudiant numero : " + (i+1) + "/" + c );
			nom = clavier.next();
			Noms[i] = nom;
		}
		
		for(j = 0 ; j < c; j++){
			nom = Noms[j];
			for(k = 0 ; k < l ; k++){	
				System.out.println("Entrer la note " + (k+1) + "/" + l + " de l'etudiant : " +  nom );
				note = clavier.nextDouble();
				Notes[k][j] = note;
			}
		}
		
		for(j = 0 ; j < c; j++){
			somme = 0;
			moyenne = 0;
			System.out.println("Note de " + Noms[j] + ": ");
			for(k = 0 ; k < l ; k++){
				note = Notes[k][j];
				System.out.print(note + " ");
				somme = somme + note ;
			}
			moyenne = (somme / l);
			System.out.println(" - Moyenne de " + Noms[j] + ": " + moyenne);
		}

	}

}
