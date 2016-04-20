import java.awt.*;

import javax.swing.*;

public class Contenu extends JPanel{
	// un contenu correspond à un ticket
	private Ticket ticket;
	
	public Contenu(Ticket t){
		this.ticket = t;
	}

	public void paintComponent(Graphics g){
		int id = this.getTicket().getNumero();
		//String nomSpectacle = this.getTicket().getReservation().getRepresentation().getSpectacle().getTitre();
		
		g.setColor(Color.blue);
		g.fillRect(this.getWidth()/3 , 0, this.getWidth(), (this.getHeight()*2) / 3);
		g.setColor(Color.green);
		g.fillRect(this.getWidth()/3 + 50, 25, this.getWidth()/3 - 50, 25);
		Font fonte = new Font(" TimesRoman", Font.BOLD, 30);
		g.setFont(fonte);
		g.setColor(Color.white);
		String str = "Robert Glaspert Experiment"; 
		g.drawString(str, this.getWidth()/3 + 50, 35);
	}
	
	
	public Ticket getTicket(){
		return ticket;
	}
}
