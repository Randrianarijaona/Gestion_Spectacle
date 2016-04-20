import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Fenetre extends JFrame {				// = Accueil
	JPanel filmPanel = new JPanel();				// La page affichant les films
	
	JPanel Films = new JPanel();					// onglet Films
	JPanel Seances = new JPanel();					// onglet Seance
	JPanel Contacts = new JPanel();
	
	private JTabbedPane onglets = new JTabbedPane(SwingConstants.TOP);		// le Panneau contenant l'ensemble des onglets
	
	Admin admi ;
	public Fenetre(){
		admi = new Admin();
		ImagePan header = new ImagePan("Cinema.jpeg");
		header.setLayout(new BorderLayout());
		header.setPreferredSize(new Dimension(this.getWidth(),200));
		this.getContentPane().add(header, BorderLayout.NORTH);
		this.getContentPane().setBackground(Color.red);
		

		Films.setPreferredSize(new Dimension(650,400));					// defini la taille de l'onglet
		onglets.addTab("Film",new JScrollPane(filmPanel));				// ajout du JScrollPane dans le Paneau formant l'onglet
		Seances.setPreferredSize(new Dimension(650,400));				// defini la taille de l'onglet
		onglets.addTab("Seances", Seances);								// ajout de l'onglet Films dans le grand Panneau onglet
		Contacts.setPreferredSize(new Dimension(650,400));				// defini la taille de l'onglet
		onglets.addTab("Contacts", Contacts);							// ajout de l'onglet Contacts dans le grand Panneau onglet
		this.getContentPane().add(onglets);
		
		affiche();
		this.setTitle("Accueil");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000, 700);
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setVisible(true);
		//this.add(new JScrollPane(filmPanel));
		this.setVisible(true);

	}

	public void affiche(){
		int i;
		BoxLayout boxLayout = new BoxLayout(filmPanel, BoxLayout.Y_AXIS);
		filmPanel.setLayout(boxLayout);
		for(i=0;i<admi.getFilm().size();i++){
			String ad = admi.getFilm().get(i).getAdresse();
			Film f = admi.getFilm().get(i);
			ImagePan img = new ImagePan(ad);
			InfoPan inf = new InfoPan(f);
			Panneau pan = new Panneau(img, inf);
			filmPanel.add(pan);
			inf.getButton().addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					onglets.("Seance");
				}
			});
		}
	}
	
	
}
