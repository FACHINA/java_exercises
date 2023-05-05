import java.util.Scanner;


public class multi2_9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,m,prod;
		Scanner clavier = new Scanner(System.in);
		do{	
		System.out.println("Entrer un nombre entre 2 et 9 pour afficher sa table de multiplication ");
		x=clavier.nextInt();
	}while((x<2)||(x>9));
		
			 for (m=1;m<13;m=m+1){
             prod=x*m;
             System.out.println(x+"*"+m+"="+prod);
		}
	}
	
	}

