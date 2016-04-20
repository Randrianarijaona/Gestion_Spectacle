import java.util.Date;

public class Representation{

	private String date ;
	private String horaire;
	private Film film;
	private int placeDisponible;

	public Representation(String date, String h, Film f , int placeDisponible ){
		this.date = date;
		this.horaire = h;
		this.film = f;
		this.placeDisponible =placeDisponible ;
	}

	public String getDate(){
		return date;
	}

	public Film getFilm(){
		return this.film ;
	}

	public int getPlaceDisponible(){
		return placeDisponible;
	}
	
	public void setPlaceDisponible(int placeDisponible){
		this.placeDisponible = placeDisponible;
	}
}