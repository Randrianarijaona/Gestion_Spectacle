import java.util.ArrayList;
import java.util.*;
import java.util.Date;

//gere la date
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;


public class Client {
	private int IdClient;
	private String Nom;
	private String Prenom;
	private String Adresse;
	private String NumTel;
	private ArrayList <Reservation> List_Res;
	private ArrayList<Date> ListDate;
	private Ticket ticket;

	Client(int idClient, String nom, String prenom, String adresse, String numTel){
		this.IdClient = idClient;
		this.Nom = nom;
		this.Prenom = prenom;
		this.Adresse = adresse;
		this.NumTel = numTel;
		this.List_Res = new ArrayList<Reservation>();
	}

	public void reserver( Representation rep){
		Scanner in = new Scanner(System.in);
		String titre = rep.getFilm().getTitre();
		System.out.println("Combien de places de " + titre + " voulez vous réserver ?");
		int nbPlace = in.nextInt();
		int placeDispo = rep.getPlaceDisponible();
		int idReservation = 1;
		
		if(placeDispo < nbPlace){
			System.out.println("Nombre de place insuffisant");
		}
		else{
			final Date aujourdhui = new Date();							// recupère la date du jour de la reservation et l'enregistre 
			DateFormat longDateFormat = DateFormat.getDateTimeInstance(	// determine le format d'afficage de
																		// la date
					DateFormat.LONG,
					DateFormat.LONG);
			Reservation res = new Reservation(idReservation , aujourdhui, rep, nbPlace);
			ListDate.add(aujourdhui);									// on enregiste la date dans un tableau de dates de reservations
			List_Res.add(res);											// on ajoute la reservation fait à la liste de reservation du client
			rep.setPlaceDisponible(placeDispo - nbPlace);				// MAJ du nombre de places disponibles pour la representation
			
			for(int i=0; i<nbPlace; i++){
				Ticket t = new Ticket();								// impression d'un ticket
			}
			
			
			System.out.println("Reservation OK");
		}
	}
	public void afficheReservations(ArrayList<Reservation> l){
		int i;
		for (i= 0; i<l.size();i++){

			l.get(i).getRepresentation().getFilm().getTitre();

		}
	}
	
	public void paiement(Reservation res){
		double prix = res.getRepresentation().getFilm().getPrix();
		System.out.println("le prix est de " + prix + " € .");
		System.out.println("saisir votre code de CB.");
	}

	public void ticket(Reservation res){
		
	}

	public String getNom(){
		return Nom;
	}

	public String getPrenom(){
		return Prenom;
	}

	public String getAdresse(){
		return Adresse;
	}

	public String getNumTel(){
		return NumTel;
	}

	public ArrayList <Reservation> getReservations(){
		return List_Res;
	}

}