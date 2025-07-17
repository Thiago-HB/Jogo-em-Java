package graficos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import entidades.Player;

public class GamePanel extends JPanel {

	private static final long serialVersionUID = -2000358829650396993L;
	private Image imagem = new ImageIcon("C:/Users/thiag/Desktop/KuririnRebaixado.jpg").getImage();
	Player p;
	public Rectangle bound = new Rectangle(-1,-1,721, 541);

	public GamePanel(Player p) {this.p=p; setPreferredSize(new Dimension (720, 540)); setBackground(Color.black); setVisible(true); 
	setMaximumSize(getPreferredSize()); setFocusable(true);}
	
	public void paintComponent(Graphics g){ super.paintComponent(g);g.drawImage(imagem, p.getX(), p.getY(), this); }
}


