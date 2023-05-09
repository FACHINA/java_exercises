import java.util.Scanner;

class ordinateur {
	
	private String serie;
	private String marque;
	private int disque;
	private int ram;
	private String processeur;
	
	public ordinateur(String s,String m, int d, int r, String p){
		serie = s;
		marque = m;
		disque = d;
		ram = r;
		processeur = p;
	}
	
	public int getDisque(){
		return disque;
	}
	
	public int getRam(){
		return ram;
	}
	
	public String getProcesseur(){
		return processeur;
	}
	
	public void setRam(int ra){
		ram = ra;
	}
	
	public void afficher(){
		System.out.println("Serie : " + serie);
		System.out.println("Marque : " + marque);
		System.out.println("Disque : " + disque + "GB");		
		System.out.println("Ram : " + ram + "GB");
		System.out.println("Processeur : " + processeur);
	}
	
}

public class test_oridinateur {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);	
		
		String se,se2,mark,mark2,process,process2;
		int disk,mem_ram,disk2,mem_ram2;
		
		System.out.println("Numero de serie de l'ordinateur");
		se = clavier.next();
		System.out.println("Marque de l'ordinateur");
		mark = clavier.next();
		System.out.println("Capacite du disque dur de l'ordinateur en GB");
		disk = clavier.nextInt();
		System.out.println("Taille de la memoire ram de l'ordinateur en GB");
		mem_ram = clavier.nextInt();
		System.out.println("Processeur de l'ordinateur");
		process = clavier.next();
		
		System.out.println("Numero de serie de l'ordinateur 2");
		se2 = clavier.next();
		System.out.println("Marque de l'ordinateur 2");
		mark2 = clavier.next();
		System.out.println("Capacite du disque dur de l'ordinateur 2 en GB");
		disk2 = clavier.nextInt();
		System.out.println("Taille de la memoire ram de l'ordinateur 2 en GB");
		mem_ram2 = clavier.nextInt();
		System.out.println("Processeur de l'ordinateur 2");
		process2 = clavier.next();
		
		ordinateur od1 = new ordinateur(se,mark,disk,mem_ram,process);
		ordinateur od2 = new ordinateur(se2,mark2,disk2,mem_ram2,process2);
		
		if(od1.getRam() > od2.getRam()){
			System.out.println("L'ordinateur 1 est plus performant en terme de memoire ram que le 2");
			System.out.println("--- Ordinateur 1 ---");
			od1.afficher();
			System.out.println("--- Ordinateur 2 ---");
			od2.afficher();
		}else{
			System.out.println("L'ordinateur 2 est plus performant en terme de memoire ram que le 1");
			System.out.println("--- Ordinateur 2 ---");
			od2.afficher();
			System.out.println("--- Ordinateur 1 ---");
			od1.afficher();
			
		}

	}

}
