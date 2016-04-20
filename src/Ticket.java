import java.util.*;
import java.awt.*;
import javax.swing.*;


public class Ticket extends JFrame {
	private int Numero;
	private Reservation Res;
	private Contenu c = new Contenu(this);
	JLabel label = new JLabel("Tana Gospel Choir");
	
	
	public Ticket(){
		this.setTitle("Ticket de caisse ");
		this.setSize(800,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setContentPane(c);
		this.setLayout(new BorderLayout());
		
		this.getContentPane().add(new JButton(""), BorderLayout.WEST);
		this.add(label);
		
		this.setVisible(true);
	}
	
	public int getNumero(){
		return Numero;
	}
	
	public Reservation getReservation(){
		return Res;
	}
}
