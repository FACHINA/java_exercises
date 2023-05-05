import java.util.Scanner;
public class mdp_conf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
		String mdp,mdp_conf;
		int n,essai = 1;
		
		System.out.println("Entrez votre mot de passe");
		mdp = clavier.next();
		
		
		do{
			System.out.println("Entrer la confirmation du mot de passe");
			mdp_conf = clavier.next();
			essai = essai + 1 ;
		}while( !mdp.equals(mdp_conf) || (essai == 3 ) );
		
		if(mdp.equals(mdp_conf)){
			System.out.println("Le mot de passe est conforme");
			
			do{
				System.out.println("Entrer un nombre entier compris entre 2 et 9");
				n = clavier.nextInt();
				
			}while( (n < 2) && (n > 9) );
			
		}else{
			System.out.println("Le mot de passe n'est pas conforme");
		}

	
	
		
		
	}

}
