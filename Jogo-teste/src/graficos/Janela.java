package graficos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.KeyListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import entidades.Player;
import funcoes.Controles;
public class Janela extends JFrame {
	private static final long serialVersionUID = -29159965109590597L;
	
	JPanel contentPane = (JPanel)getContentPane();
	 Player p;
	 
	 JPanel conteiner = new JPanel(new FlowLayout());

	public GamePanel tela;
	 public Janela(Player p, KeyListener k) {super(); this.p=p;
	 tela = new GamePanel(this.p);
	 tela.addKeyListener(k);
	setSize(900, 700);
	conteiner.setSize(getWidth(), getHeight()); 
	conteiner.setVisible(true); 
	add(conteiner, BorderLayout.CENTER); 
	conteiner.add(tela); 
	contentPane.setBorder(new EmptyBorder(30, 30, 30, 30)); 
	 setLocationRelativeTo(null); setVisible(true); 
	 setDefaultCloseOperation(EXIT_ON_CLOSE); 
      }
	 
}

