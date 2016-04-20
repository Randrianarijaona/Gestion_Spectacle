import javax.swing.*;
import java.awt.*;

public class Panneau extends JPanel{				//	= PanelP
	//Créer le conteneur de l'image
	
	public Panneau(ImagePan img, InfoPan infos){
		this.setPreferredSize(new Dimension(800,500));
		this.setLayout(new GridBagLayout());
		
		// dimensionnement l'image de couverture du film
		img.setPreferredSize(new Dimension(300,480));
		
		// redimensionnement infos du film
		infos.setPreferredSize(new Dimension(500,480));
		
		// 
		GridBagConstraints gbc = new GridBagConstraints();

		gbc.gridx = 0;							//defini la colone
		gbc.gridy = 0;							//defini la ligne
		gbc.gridwidth = 1;						//defini le nombre de colone occupé
		gbc.gridheight = 1;						//defini le nombre de ligne occupé
		gbc.fill = GridBagConstraints.BOTH;		//toute l'espace disponible sera utilisé
		this.add(img, gbc);
		
		//---------------------------------------
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = GridBagConstraints.BOTH;
		this.add(infos,gbc);
	
		
		
		//this.add(img, BorderLayout.WEST);
		//this.add(inf ,BorderLayout.EAST);
		//this.add(img2, BorderLayout.EAST);
		this.setVisible(true);

	}
	
}
