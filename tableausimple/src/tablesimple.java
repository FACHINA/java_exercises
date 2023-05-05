import java.util.Scanner;
public class tablesimple {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//**************Remplissage du tableau******************
		int N,i,u,n;
		double m,p;
		
		Scanner tableau = new Scanner(System.in);
		System.out.println("Entrer l'effectif");
		N=tableau.nextInt();
		double [] Note=new double [N];
		
		for(i=0;i<N;i++){
			
			System.out.println("Entrer la note "+i);
			Note[i]=tableau.nextDouble();
		}
		//**************Affichage des notes*********************
		System.out.println("Affichage des notes");
		System.out.println("-------------------");
		for (u=0;u<N;u++){
		System.out.println(Note[u]+" *3 = "+Note[u]*3);
		System.out.println("-------------------");	
		
		}
		m=Note[0];
		p=Note[0];
		for(i=0;i<N;i++){
		if (Note[i]>m)
		{
			m=Note[i];
			
		} 
		if (Note[i]<p)
		{
			p=Note[i];
			
		}
		}
	System.out.println("La plus forte note est"+m);
		System.out.println("La plus faible note est"+p);
}	
}
