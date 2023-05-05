import java.util.Scanner;
public class test_operation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     int l=1;
	     
	    
			while (l==1){
			
		int i;
		Scanner clav = new Scanner(System.in);
		System.out.println("*****************MENU******************");
		System.out.println("1-adddition");
		System.out.println("2-soustration");
		System.out.println("3-produits");
		System.out.println("4-division");
		System.out.println("5-comparaison");
		
		i=clav.nextInt();
		

		int choix=i;
		switch(choix){
			case 1:
				int e,d;
				Scanner clavier = new Scanner(System.in);
			    System.out.println("Entrer le nombre 'a' ");
				e=clavier.nextInt();
				System.out.println("Entrer le nombre 'b' ");
				d=clavier.nextInt();
				System.out.println("Resuiltats "+e+ "+" +d+" = "+ e+d);
			break;
			case 2:
				int m,n;
				Scanner clavier1 = new Scanner(System.in);
			    System.out.println("Entrer le nombre 'a' ");
				m=clavier1.nextInt();
				System.out.println("Entrer le nombre 'b' ");
				n=clavier1.nextInt();
				System.out.println("Resuiltats "+m+ "-" +n+" = "+( m-n));
			break;
			case 3:
				int g,h;
				Scanner clavier2 = new Scanner(System.in);
			    System.out.println("Entrer le nombre 'a' ");
				g=clavier2.nextInt();
				System.out.println("Entrer le nombre 'b' ");
				h=clavier2.nextInt();
				System.out.println("Resuiltats "+g+ "*" +h+ "=" + g*h);
			break;
			case 4:
				int f,j;
				Scanner clavier3 = new Scanner(System.in);
			    System.out.println("Entrer le nombre 'a' ");
				j=clavier3.nextInt();
				System.out.println("Entrer le nombre 'b' ");
				f=clavier3.nextInt();
				System.out.println(j+f);
			break;
				case 5:
			int a,b,c;
			Scanner clavie = new Scanner(System.in);
			System.out.println("Entrer le nombre 'a' ");
			a=clavie.nextInt();
			System.out.println("Entrer le nombre 'b' ");
			b=clavie.nextInt();
			System.out.println("Entrer le nombre 'c' ");
			c=clavie.nextInt();
			
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
	}}
		Scanner cla = new Scanner(System.in);
		System.out.println("entrer 1 pour faire un autre choix");
		l=cla.nextInt();} } 
	

	}
	