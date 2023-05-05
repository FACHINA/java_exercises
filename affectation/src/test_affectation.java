import java.util.Scanner;
public class test_affectation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("Entrer le premeier nombre 'a' ");
		a=clavier.nextInt();
		
		System.out.println("Entrer le  second  nombre 'b' ");
		b=clavier.nextInt();
		
		int c=a;
		a=b;
		b=c;
		System.out.println("a= "+a +" b= "+b);
	}

}
