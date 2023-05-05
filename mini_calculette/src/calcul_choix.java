import java.util.Scanner;
public class calcul_choix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		char x;
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("Entrer un nombre ");
		a = clavier.nextInt();
		
		System.out.println("Entrer l'operateur");
		x = clavier.next().charAt(0);
		
		System.out.println("Entrer le second nombre");
		b = clavier.nextInt();
		
		switch(x){
			case '+':
			System.out.println(a + " + " + b + " = " + (a+b));
			break;
			
			case '-':
			System.out.println(a + " - " + b + " = " + (a-b));
			break;
			
			case '*':
			System.out.println(a + " * " + b + " = " + (a*b));
			break;
			
			case '/':
				if(b != 0){
					System.out.println(a + " / " + b + " = " + (a/b));
				}else{
					System.out.println("La division est impossible \"b\" doit etre different de 0 ");
				}
			break;
			
			default:
			System.out.println("Veuillez saisir des donnees conforme");
				
		}
		

	}

}
