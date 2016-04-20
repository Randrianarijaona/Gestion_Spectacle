import java.awt.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.*;

public class ImagePan extends JPanel{
	
	private String adresse;
	
	public ImagePan(String ad){
		this.adresse = ad;
	}
	
	public void paintComponent(Graphics g){
		Admin admin = new Admin();
		try{
			// Creation de l'image
			String adr = this.getAd();
			FileInputStream input = new FileInputStream(adr);
			Image img = ImageIO.read(input);
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			this.setVisible(true);
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public String getAd(){
		return this.adresse;
	}
}
