package funcoes;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controles implements KeyListener {
boolean cima, baixo, esquerda, direita, menu, ok;
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
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

}
