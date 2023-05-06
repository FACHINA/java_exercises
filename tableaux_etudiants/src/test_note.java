import java.util.Scanner;
public class test_note {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
		int effectif,i ;
		
		System.out.println("Entrer l'effectif de la classe");
		effectif = clavier.nextInt();

		String etudiant[] = new String[effectif];
		int note[] = new int[effectif];

		for(i = 0 ;i < effectif; i++){
			System.out.println("Entrer le nom de l'etudiant numero " + (i+1));
			etudiant[i] = clavier.next();
			System.out.println("Entrer la note de l'etudiant " + etudiant[i] );
			note[i] = clavier.nextInt();
		}

		System.out.println("-----------------------------");
		System.out.println("Affichage des notes");
		System.out.println("-----------------------------");
		
		for(i = 0 ;i < effectif; i++){
			System.out.println(etudiant[i] + ":" + note[i]);
			System.out.println("-----------------------------");
		}

	}

}
