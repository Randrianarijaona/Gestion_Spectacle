import java.awt.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.*;
import java.util.*;

public class Film {

	private String titre;
	private String realisateur;
	private double prix;
	private String adresse;
	private String sortie;
	private String Synopsis;
	// composition
	private ArrayList<Representation> liste_Rep;

	Film(String titre, String rea, double p, String ad, String so, String sy , ArrayList<Representation> rep){
		this.titre = titre;
		this.realisateur = rea;
		this.prix = p;
		this.adresse = ad;
		this.sortie = so;
		this.Synopsis = sy;
		liste_Rep = new ArrayList <Representation>();
		//this.liste_Rep = rep;
	}

	public void infoSpectacle(){
		System.out.println("titre : " + this.titre);
		System.out.println("auteur : " + this.realisateur);
	}

	public void ajouterRepresentation(Representation rep){
		liste_Rep.add(rep);
	}

	public String getTitre(){
		return titre;
	}

	public String getRealisateur(){
		return realisateur;
	}

	public ArrayList<Representation> getListe_Rep() {
		return liste_Rep;
	}

	public double getPrix(){
		return prix;
	}
	
	public String getAdresse(){
		return this.adresse;
	}
	
	public String getSortie(){
		return this.sortie;
	}
	
	public String getSynopsis(){
		return this.Synopsis;
	}

	public void affiche_liste_rep( ArrayList<Representation> l){
		for(int i=0; i< l.size();i++){

		}
	}
	
	/*public ImagePan getAffiche(){
		return this.Affiche;
	}*/

}