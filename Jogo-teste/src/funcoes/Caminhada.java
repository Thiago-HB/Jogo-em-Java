package funcoes;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import entidades.Player;
import graficos.Janela;

public class Caminhada extends Thread implements KeyListener {
Player p = new Player();
	boolean cima, baixo, esquerda, direita, menu, ok;
	Janela janela = new Janela(p, this);
	public void run(){while(true) {
	p.setX(esquerda, direita, janela.tela.bound);
	p.setY(cima, baixo, janela.tela.bound);
	 janela.tela.repaint();
		try {
			sleep(1000/30);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
	}





public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
switch(e.getKeyCode()) {
case KeyEvent.VK_W:
cima = true;
break;
case KeyEvent.VK_A:
esquerda = true;
break;
case KeyEvent.VK_S:
baixo = true;
break;
case KeyEvent.VK_D:
direita = true;
break;}
}

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	switch(e.getKeyCode()) {
	case KeyEvent.VK_W:
		cima = false;
		break;
	case KeyEvent.VK_A:
		esquerda = false;
		break;
	case KeyEvent.VK_S:
		baixo = false;
		break;
	case KeyEvent.VK_D:
		direita = false;
		break;
	case KeyEvent.VK_M:
		if(menu = false) {menu = true;}else {menu = false;};
		break;
	case KeyEvent.VK_SPACE:
		break;
}}





@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

}
