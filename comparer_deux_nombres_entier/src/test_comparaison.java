import java.util.Scanner;
public class test_comparaison {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("Entrer le nombre 'a' ");
		a=clavier.nextInt();
		System.out.println("Entrer le nombre 'b' ");
		b=clavier.nextInt();
		System.out.println("Entrer le nombre 'c' ");
		c=clavier.nextInt();
	
	if (a>b){
		if (a>c){
			if (b>c){
			System.out.println(a + " > "+ b+" > " + c);
			}else {
				System.out.println(a + " > "+ c +" > "+ b);
			}
		}else{
			System.out.println(c + " > "+ a +" > "+ b);
		}
	}else{
		if (b>c){
			if(a>c){
				System.out.println(b + " > "+ a +" > "+ c);
			}else{
				System.out.println(b + " > "+ c +" > "+ a);
			}
		}else{
			System.out.println(c + " > "+ b +" > "+ a);
		}
	}
}
	}
	