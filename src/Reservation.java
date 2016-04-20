import java.util.Date;
import java.awt.*;
import javax.swing.*;

public class Reservation {
	private int Id;
	private Date Date_res;
	private Representation Rep;
	private int nbPlace;
	Ticket listTicket[] = new Ticket[nbPlace];
	
	Reservation(int id, Date d, Representation r, int place){
		this.Id = id;
		this.Date_res = d;
		this.Rep = r;
		this.nbPlace = place;
	}

	public Representation getRepresentation(){
		return Rep;
	}
	
	public Date getDate(){
		return Date_res;
	}

	public int getId(){
		return Id;
	}
	
	public int getNbPlace(){
		return nbPlace;
	}
	
	public Ticket[] List_Ticket(){
		return listTicket;
	}
}