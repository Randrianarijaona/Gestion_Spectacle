import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.text.*;


public class Admin {
	ArrayList<Film> listeFilm = new ArrayList<Film> (); 

	public Admin( ) {
		this.Spectacle();


	}
	// crée un tableau de spectacles

	public void creer_Spectacle(){
		Scanner in = new Scanner(System.in);

		boolean bissextile;
		boolean J;			// mois ayant 31 jours

		System.out.println("Saisir le nom du Spectacle");
		String Name = in.nextLine();
		System.out.println("Saisir le nom de l'auteur");
		String Autor = in.nextLine();
		System.out.println("Saisir le prix du spectacle");
		double price = in.nextDouble();
		System.out.println("Saisir la date de sortie de la forme jj/mm/aaaa");
		String sortie = in.nextLine();
		/*System.out.println("Année:	");
		int annee = in.nextInt();

		if ((annee % 4 == 0)&&(annee % 100 != 0)){
			bissextile = true;
		}
		else if (annee % 400 == 0){
			bissextile = true;
		}
		else{
			bissextile = false;
		}

		System.out.println("moi:	");
		int moi = in.nextInt();

		if((moi == 4)||(moi == 6)||(moi == 9)||(moi == 11)){
			J = false;
		}
		else if((moi == 1)||(moi == 3)||(moi == 5)||(moi == 7)||(moi == 8)||(moi == 10)||(moi == 12)){
			J = true;
		}

		System.out.println("jour	");

		if(J == false){
			int jour = in.nextInt();
			while((jour<1)||(jour>30)){
				System.out.println("erreur de saisie, veullez recommencer");
				jour = in.nextInt();
			}
		}
		 */




		/*
		//Defini le format d'affichage de la date
		final DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		//initialisation de la date à null
		date = null;
		while(date == null){
			System.out.println("Saisir la date de sortie dans le format dd/mm/yy");
			String sortie = in.next();

			try{
				date = format.parse(sortie);
			}
			catch(ParseException e){
				System.out.println("Erreur de saisie");
			}
		}
		 */
	}

	public  void Spectacle() {
		Date d = new Date();

		ArrayList<Representation> rep1 = new ArrayList<Representation>();		// déclaration de la liste de Representation de f1
		String s1 = "Dans la petite ville de Jackson, Mississippi, durant les années 60, trois femmes que tout devait opposer vont nouer une incroyable amitié. Elles sont liées par un projet secret qui les met toutes en danger, l’écriture d’un livre qui remet en cause les conventions sociales les plus sensibles de leur époque. De cette alliance improbable va naître une solidarité extraordinaire. À travers leur engagement, chacune va trouver le courage de bouleverser l’ordre établi, et d’affronter tous les habitants de la ville qui refusent le vent du changement... ";
		Film f1 = new Film("La couleur des sentiments", "Tate Taylor", 5.80,"La couleur des sentiments.jpg", "26/10/2016", s1,rep1);
		// liste de representations
		for (int i = 0; i<7;i++){
			Representation r11 = new Representation((d.getDay()+i) + " / " + d.getMonth() + " / " + d.getMonth(),"10h30", f1,250);
			Representation r12 = new Representation((d.getDay()+i) + " / " + d.getMonth() + " / " + d.getMonth(),"13h30", f1,250);
			Representation r13 = new Representation((d.getDay()+i) + " / " + d.getMonth() + " / " + d.getMonth(),"16h30", f1,250);
			Representation r14 = new Representation((d.getDay()+i) + " / " + d.getMonth() + " / " + d.getMonth(),"18h30", f1,250);
			rep1.add(r11);
			rep1.add(r12);
			rep1.add(r13);
			rep1.add(r14);
		}
		listeFilm.add(f1);


		ArrayList<Representation> rep2 = new ArrayList<Representation>();		// déclaration de la liste de Representation de f2
		String s2 = "Craignant que Superman n'abuse de sa toute-puissance, le Chevalier noir décide de l'affronter : le monde a-t-il davantage besoin d'un super-héros aux pouvoirs sans limite ou d'un justicier à la force redoutable mais d'origine humaine ? Pendant ce temps-là, une terrible menace se profile à l'horizon… ";
		Film f2 = new Film("Batman Vs Superman", "Zack Snyder", 14.50,"batman_v_superman_dawn_of_justice___poster_10_by_camw1n-d8sxkuf.png","23/03/2016" , s2, rep2);
		// liste de representations
		for (int i = 0; i<7;i++){
			Representation r21 = new Representation((d.getDay()+i) + " / " + d.getMonth() + " / " + d.getMonth(),"10h30", f1,250);
			Representation r22 = new Representation((d.getDay()+i) + " / " + d.getMonth() + " / " + d.getMonth(),"13h30", f1,250);
			Representation r23 = new Representation((d.getDay()+i) + " / " + d.getMonth() + " / " + d.getMonth(),"16h30", f1,250);
			Representation r24 = new Representation((d.getDay()+i) + " / " + d.getMonth() + " / " + d.getMonth(),"18h30", f1,250);
			rep2.add(r21);
			rep2.add(r22);
			rep2.add(r23);
			rep2.add(r24);
		}
		listeFilm.add(f2);



		ArrayList<Representation> rep3 = new ArrayList<Representation>();		// déclaration de la liste de Representation de f3
		String s3 = "Dans la petite ville de Jackson, Mississippi, durant les années 60, trois femmes que tout devait opposer vont nouer une incroyable amitié. Elles sont liées par un projet secret qui les met toutes en danger, l’écriture d’un livre qui remet en cause les conventions sociales les plus sensibles de leur époque. De cette alliance improbable va naître une solidarité extraordinaire. À travers leur engagement, chacune va trouver le courage de bouleverser l’ordre établi, et d’affronter tous les habitants de la ville qui refusent le vent du changement... ";
		Film f3 = new Film("Le livre d'Eli", "Albert Hughes", 5.80,"Le livre d'Eli.jpg", "20/01/2010", s3, rep3);
		// liste de representations
		for (int i = 0; i<7;i++){
			Representation r31 = new Representation((d.getDay()+i) + " / " + d.getMonth() + " / " + d.getMonth(),"10h30", f1,250);
			Representation r32 = new Representation((d.getDay()+i) + " / " + d.getMonth() + " / " + d.getMonth(),"13h30", f1,250);
			Representation r33 = new Representation((d.getDay()+i) + " / " + d.getMonth() + " / " + d.getMonth(),"16h30", f1,250);
			Representation r34 = new Representation((d.getDay()+i) + " / " + d.getMonth() + " / " + d.getMonth(),"18h30", f1,250);
			rep3.add(r31);
			rep3.add(r32);
			rep3.add(r33);
			rep3.add(r34);
		}
		listeFilm.add(f3);


		ArrayList<Representation> rep4 = new ArrayList<Representation>();		// déclaration de la liste de Representation de f4
		String s4 = "Paul Edgecomb, pensionnaire centenaire d'une maison de retraite, est hanté par ses souvenirs. Gardien-chef du pénitencier de Cold Mountain en 1935, il était chargé de veiller au bon déroulement des exécutions capitales en s’efforçant d'adoucir les derniers moments des condamnés. Parmi eux se trouvait un colosse du nom de John Coffey, accusé du viol et du meurtre de deux fillettes. Intrigué par cet homme candide et timide aux dons magiques, Edgecomb va tisser avec lui des liens très forts. ";
		Film f4 = new Film("La ligne verte", "Franck Darabont", 7.80,"La ligne verte.jpg", "01/03/2000", s4, rep4);
		// liste de representations
		for (int i = 0; i<7;i++){
			Representation r41 = new Representation((d.getDay()+i) + " / " + d.getMonth() + " / " + d.getMonth(),"10h30", f1,250);
			Representation r42 = new Representation((d.getDay()+i) + " / " + d.getMonth() + " / " + d.getMonth(),"13h30", f1,250);
			Representation r43 = new Representation((d.getDay()+i) + " / " + d.getMonth() + " / " + d.getMonth(),"16h30", f1,250);
			Representation r44 = new Representation((d.getDay()+i) + " / " + d.getMonth() + " / " + d.getMonth(),"18h30", f1,250);
			rep1.add(r41);
			rep1.add(r42);
			rep1.add(r43);
			rep1.add(r44);
		}
		listeFilm.add(f4);


		ArrayList<Representation> rep5 = new ArrayList<Representation>();		// déclaration de la liste de Representation de f5
		String s5 = " Quand Batman, Superman, Wonder Woman, Green Lantern et d'autres super-héros s'unissent pour combattre le crime. ";
		Film f5 = new Film("Justice League", "Zack Snyder", 14.50,"Justice League.jpg", "15/11/2017", s5, rep5 );
		// liste de representations
		for (int i = 0; i<7;i++){
			Representation r51 = new Representation((d.getDay()+i) + " / " + d.getMonth() + " / " + d.getMonth(),"10h30", f1,250);
			Representation r52 = new Representation((d.getDay()+i) + " / " + d.getMonth() + " / " + d.getMonth(),"13h30", f1,250);
			Representation r53 = new Representation((d.getDay()+i) + " / " + d.getMonth() + " / " + d.getMonth(),"16h30", f1,250);
			Representation r54 = new Representation((d.getDay()+i) + " / " + d.getMonth() + " / " + d.getMonth(),"18h30", f1,250);
			rep1.add(r51);
			rep1.add(r52);
			rep1.add(r53);
			rep1.add(r54);
		}
		listeFilm.add(f5);


		ArrayList<Representation> rep6 = new ArrayList<Representation>();		// déclaration de la liste de Representation de f6
		String s6 = " Un conte qui se déroule à la Nouvelle-Orléans, dans le légendaire quartier français, où vit une jeune fille nommée Tiana. ";
		Film f6 = new Film("La princesse et la grenouille", "Ron Clement", 5.80,"La princesse et la grenouille.jpg", "27/01/2010", s6, rep6);
		// liste de representations
		for (int i = 0; i<7;i++){
			Representation r61 = new Representation((d.getDay()+i) + " / " + d.getMonth() + " / " + d.getMonth(),"10h30", f1,250);
			Representation r62 = new Representation((d.getDay()+i) + " / " + d.getMonth() + " / " + d.getMonth(),"13h30", f1,250);
			Representation r63 = new Representation((d.getDay()+i) + " / " + d.getMonth() + " / " + d.getMonth(),"16h30", f1,250);
			Representation r64 = new Representation((d.getDay()+i) + " / " + d.getMonth() + " / " + d.getMonth(),"18h30", f1,250);
			rep1.add(r61);
			rep1.add(r62);
			rep1.add(r63);
			rep1.add(r64);
		}
		listeFilm.add(f6);


		ArrayList<Representation> rep7 = new ArrayList<Representation>();		// déclaration de la liste de Representation de f7
		String s7 = "Jennifer, jeune et jolie écrivain, s’isole dans un chalet pour y écrire son nouveau roman. Elle qui s’attendait à une retraite tranquille, se retrouve violée et torturée par un groupe d’individus complètement tordus qui empestent la cruauté et la perversité. Abusée par chacun d’entre eux, laissée pour morte, elle se livrera à une vengeance sans pitié… ";
		Film f7 = new Film("I Spit on your Grave", "Steven R Monroe", 5.80,"I Spit on your Grave.jpg", "21/09/2011", s7, rep7);
		// liste de representations
		for (int i = 0; i<7;i++){
			Representation r71 = new Representation((d.getDay()+i) + " / " + d.getMonth() + " / " + d.getMonth(),"10h30", f1,250);
			Representation r72 = new Representation((d.getDay()+i) + " / " + d.getMonth() + " / " + d.getMonth(),"13h30", f1,250);
			Representation r73 = new Representation((d.getDay()+i) + " / " + d.getMonth() + " / " + d.getMonth(),"16h30", f1,250);
			Representation r74 = new Representation((d.getDay()+i) + " / " + d.getMonth() + " / " + d.getMonth(),"18h30", f1,250);
			rep1.add(r71);
			rep1.add(r72);
			rep1.add(r73);
			rep1.add(r74);
		}
		listeFilm.add(f7);


		ArrayList<Representation> rep8 = new ArrayList<Representation>();		// déclaration de la liste de Representation de f8
		String s8 = " Pour rester libre et éviter toute forme d’engagement, Danny a toujours prétendu être marié. Mais voilà qu’il tombe amoureux… Désirant se libérer de ce mensonge devenu trop encombrant, il demande à sa fidèle assistante, Katherine, de se faire passer pour son ex-femme. Le problème, c’est qu’à force d’empiler les bobards, Danny ne va pas pouvoir se contenter d’en rester là, et ce sont bientôt les enfants de son assistante qui se retrouvent à faire semblant d’être les siens… L’engrenage infernal est lancé et la situation va vite devenir intenable, d’autant que tout ce petit monde se retrouve pour un week-end mouvementé à Hawaï… ";
		Film f8 = new Film("Le Mytho", "Dennis", 5.80,"Le mytho.jpg", "23/03/2011", s8, rep8);
		// liste de representations
		for (int i = 0; i<7;i++){
			Representation r81 = new Representation((d.getDay()+i) + " / " + d.getMonth() + " / " + d.getMonth(),"10h30", f1,250);
			Representation r82 = new Representation((d.getDay()+i) + " / " + d.getMonth() + " / " + d.getMonth(),"13h30", f1,250);
			Representation r83 = new Representation((d.getDay()+i) + " / " + d.getMonth() + " / " + d.getMonth(),"16h30", f1,250);
			Representation r84 = new Representation((d.getDay()+i) + " / " + d.getMonth() + " / " + d.getMonth(),"18h30", f1,250);
			rep1.add(r81);
			rep1.add(r82);
			rep1.add(r83);
			rep1.add(r84);
		}
		listeFilm.add(f8);
	}

	public ArrayList<Film> getFilm(){
		return listeFilm;
	}

	public void AfficheRepresentations(Film f){

	}


}
