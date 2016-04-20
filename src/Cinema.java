import java.util.*;

public class Cinema {
	String Nom;
	String Adresse;
	String Tel;
	double Note;
	private ArrayList<Client> Lc;
	
	Cinema(String nom, String adresse, String tel, double note){
		this.Nom = nom;
		this.Adresse = adresse;
		this.Tel = tel;
		this.Note = note;
	}
}