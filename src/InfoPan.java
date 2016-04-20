import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

@SuppressWarnings("serial")
public class InfoPan extends JPanel{
	private Film film;
	JPanel panel = new JPanel();
	private JButton button = new JButton("Voir séances");

	InfoPan(Film f){
		panel.setPreferredSize(new Dimension(400,100));
		this.film = f;
		BoxLayout boxLayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
		this.add(panel);
		JLabel JTitle = new JLabel("Titre:    " + film.getTitre());
		panel.setBackground(Color.YELLOW);
		panel.setAlignmentX(Component.LEFT_ALIGNMENT);
		JLabel JRealisator = new JLabel("Realisateur:    " + film.getRealisateur());
		JLabel JSortie = new JLabel("Date de sortie:    " + film.getSortie());
		JTextArea JSynopsis = new JTextArea("Synopsis:    " + film.getSynopsis(), 5, 10);
		JSynopsis.setPreferredSize(new Dimension(400, 150));
        JScrollPane scrollPane = new JScrollPane(JSynopsis,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        JSynopsis.setLineWrap(true);
		JLabel jprice = new JLabel("Prix de la séance:    " + film.getPrix() + " €");
		
		panel.add(JTitle);
		panel.add(JRealisator);
		panel.add(JSortie);
		this.add(JSynopsis);
		panel.add(jprice);
		panel.setLayout(boxLayout);			// les élements du panel sont affichés de haut en bas
		this.add(button);
		this.setVisible(true);
	}

	public void paintComponent(Graphics g){
		Admin admin = new Admin();
		try{

		}
		catch(Exception e){
			String error = "Probleme d'affichage";

		}
	}

	public Film getFilm(){
		return this.film;
	}
	
	public JButton getButton(){
		return button;
	}
	/*
	 * 
	 */
	/*public void paragraphe(Film f){
		String str = f.getSynopsis();
		int i = 0;
		int lineLength = 150;
		while (i<f.getSynopsis().length()){
			int j = 0;
			int x = i + lineLength;
			if(f.getSynopsis().charAt(x) != ' '){						// si le i + 150 eme charactere n'est pas un espace
				while(f.getSynopsis().charAt(x-j) != ' '){				// on cherche l'indice du dernier espace
					j++;
				}
				JLabel line = new JLabel(str.substring(i, x-j));		// on créer un nouveau String commençant du ieme charactere à l'indice du derniere espace
				this.panel.add(line);									// on ajoute le JLabel contenant le string a InfoPan
				i = x-j+1;												// on met l'indice i à l'indice du dernier espace + 1
			}
			else{
				JLabel line = new JLabel(str.substring(i, x));			// on créer un nouveau String commençant du ieme charactere au i + 150eme charactere
				this.panel.add(line);									// on ajoute le JLabel contenant le string a InfoPan
				i += lineLength + 1;									// on met l'indice i à l'indice du dernier espace + 1
			}
		}
	}*/
}
