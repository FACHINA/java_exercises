import java.util.Scanner;
public class test_multiple {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
		//Declaration de variable
		String mdp,confirm,reponse = "O" ;
		int compteur = 1, nombre = 0,i;
		
		//L'utilisateur entre le mot de passe
		System.out.println("Entrer le mot de passe");
		mdp = clavier.next();
		
		do{
			//L'utilisateur entre la confirmation tant qu'il n'est pas conforme 
			//au mot de passe et que le compteur est inferieur ou egal a 3
			System.out.println("Entrer la confirmation du mot de passe");
			confirm = clavier.next();
			compteur = compteur + 1 ;
			
		}while( !mdp.equals(confirm) && (compteur <= 3) );
		
		//On verifie si les mot de passe sont conformes
		if( mdp.equals(confirm) ){
			//Si les mots de passe sont conforme on continue
			System.out.println("Bienvenue !");
			
			while(reponse.equals("O")){
				while(nombre < 2 || nombre > 9){
					System.out.println("Entrer un conbre compris entre 2 et 9");
					nombre = clavier.nextInt();
				}
				//Table de multiplication du nombre saisi
				//Table de multiplication de 1 a 12
				for(i = 1 ; i < 13 ; i++){
					System.out.println( nombre + " * " + i + " = " + (nombre * i));
				}
				nombre = 0;
				System.out.println("Souhaitez vous recommencer ! [O] Oui / [N] Non");
				reponse = clavier.next();
				
			}		
		}else{
			//Si les mots de passe ne sont pas conforme on affiche une erreur
			System.out.println("Echec les mots de passe ne sont pas conforme");
		}

	}

}
