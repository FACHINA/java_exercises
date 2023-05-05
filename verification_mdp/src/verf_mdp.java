import java.util.Scanner;
public class verf_mdp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mdp,mdp2;
		int i=0;
		Scanner securitemdp = new Scanner(System.in);
		
		System.out.println("Entrer un mot de passe");
		mdp=securitemdp.next();
		System.out.println("Confirmer le mot de passe");
		mdp2=securitemdp.next();
	
		while(!mdp.equals(mdp2)){
			i=i+1;
			if(i==3)
				break;
			else{
			System.out.println("Veuillez re-confirmer le mot de passe");
			mdp2=securitemdp.next();
			}
		}
		if(i==3){
		
		System.out.println("Echec");
		}else{
			System.out.println("Bienvenue");
		}

	}

}
