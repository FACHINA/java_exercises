import java.util.Scanner;
public class test_note {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
		
		int effectif,note,i,n = 1;
		String nom;
		
		System.out.println("Entrer l'effectif de la classe");
		effectif = clavier.nextInt();
		
		String tableau_nom[] = new String[effectif];
		int tableau_note[] = new int[effectif];
		
		for(i = 0; i < effectif ;i++){ 
			
			System.out.println("Saisissez le nom de l'etudiant numero " + n);
			nom = clavier.next();
			System.out.println("Saisissez la note de l'etudiant " + nom);
			note = clavier.nextInt();
			
			tableau_nom[i] = nom;
			tableau_note[i] = note;
			
			n = n + 1;
				
		}
		
		System.out.println("Affichage des notes");
		System.out.println("********************");
		
		for(i = 0; i < effectif ; i++){
			
			nom = tableau_nom[i];
			note = tableau_note[i];
			
			System.out.println( nom + " : " + note );
			System.out.println("-------------------");
			
		}
		
		for(i = 0; i < effectif ; i++){
			
			nom = tableau_nom[i];
			note = tableau_note[i];
			
		}
		
		

	}

}
