import java.util.Scanner;


public class vftoons2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String titres1,titres2,Link;
		String imgs,vfname,vfid;
		int i;
		Scanner clavier = new Scanner(System.in);		

		System.out.println("Entrer le nom du vf-toons");
		vfname = clavier.next();
		System.out.println("Entrer l'id du vf-toons");
		vfid = clavier.next();
		System.out.println("Entrer le numero chapitre de debut");
		int db = clavier.nextInt();
		System.out.println("Entrer le numero de chapitre de fin");
		int fn = clavier.nextInt();
		System.out.println("Entrer lien de l'image");
		imgs = clavier.next();
		
		
		//new
		System.out.println("<div class='p-3 col-xl-2 col-lg-3 col-md-4 col-6'>");
		System.out.println("<div class='card bg-webtoons border-0 rounded-3'>");
		System.out.println("<div class='card-header p-1 border-0 bg-webtoons-50 m-0 p-0'><span class=' badge text-white p-2 bg-webtoons'>Chapitre"+db+"a"+fn+"</span></div>");
		System.out.println(" <div class='d-flex justify-content-end bg-webtoons card-footer border-0'>");
		System.out.println("<button class='btn text-white border-0 px-3 rounded icon-card'"+ "data-icon=" + '"');
		
		
		System.out.println("<b>");
		System.out.print("<b>"+vfname+" </b>");
		System.out.println("<i>Chapitre "+ db +" a "+fn+" </i>");
		//System.out.print("<a href="+'"'+Link+'"'+">.</a>");
		System.out.print("<a href='#'");
		System.out.println(">TÉLÉCHARGER DIRECTEMENT SUR TELEGRAM</a>");
		System.out.println("<b>"+vfid+"</b>");
		System.out.println("<b>Don't block me please</b>");
		
		System.out.print("<b>😁</b>");
		System.out.print("<a href='#'> </a>");
		System.out.print("<b>😁</b>");
		System.out.print("<a href='#'> </a>");
		System.out.print("<b>😁</b>");
		System.out.print("<a href='"+imgs+"'> </a>");
		System.out.print("<b>😁</b>");
		System.out.print("<a href='#'> </a>");
		System.out.print("<b>😁</b>");
		System.out.print("<a href='#'> </a>");
		System.out.println("<b>😁</b>");
		System.out.println("</b>");
		
		//new
		System.out.println('"'+">Copier <i class='fas fa-copy'></i></button></div></div></div>");
		
		for(i=db;i<=fn;i++){
		System.out.println("Entrer le lien du chapitre");
		Link=clavier.next();
		
		//new
		System.out.println("<div class='p-3 col-xl-2 col-lg-3 col-md-4 col-6'>");
		System.out.println("<div class='card bg-webtoons border-0 rounded-3'>");
		System.out.println("<div class='card-header p-1 border-0 bg-webtoons-50 m-0 p-0'><span class=' badge text-white p-2 bg-webtoons'>Chapitre"+i+"</span></div>");
		System.out.println(" <div class='d-flex justify-content-end bg-webtoons card-footer border-0'>");
		System.out.println("<button class='btn text-white border-0 px-3 rounded icon-card'"+ "data-icon=" + '"');
		System.out.println("<b>");
		System.out.print("<b>"+vfname+" </b>");
		System.out.println("<i>Chapitre "+ i +" </i>");
		//System.out.print("<a href="+'"'+Link+'"'+">.</a>");
		System.out.print("<a href='#'");
		System.out.println(">TÉLÉCHARGER DIRECTEMENT SUR TELEGRAM</a>");
		System.out.println("<b>"+vfid+"</b>");
		System.out.println("<b>Don't block me please</b>");
		System.out.print("<b>😁</b>");
		System.out.print("<a href='#'> </a>");
		System.out.print("<b>😁</b>");
		System.out.print("<a href='#'> </a>");
		System.out.print("<b>😁</b>");
		System.out.print("<a href='"+Link+"'> </a>");
		System.out.print("<b>😁</b>");
		System.out.print("<a href='#'> </a>");
		System.out.print("<b>😁</b>");
		System.out.print("<a href='#'> </a>");
		System.out.println("<b>😁</b>");
		System.out.println("</b>");
		//new
		System.out.println('"'+">Copier <i class='fas fa-copy'></i></button></div></div></div>");
		}
	
	}

}
