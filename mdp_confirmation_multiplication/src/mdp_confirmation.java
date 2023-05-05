import java.util.Scanner;
public class mdp_confirmation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
		char mdp,mdp_conf;
		
		System.out.println("Entrez votre mot de passe");
		mdp = clavier.next().charAt(0);
		
		System.out.println("Entrer la confirmation du mot de passe");
		mdp_conf = clavier.next().charAt(0);
		
		

	}

}
