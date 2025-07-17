package entidades;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.ImageIcon;



public class Player extends Entidade {
Rectangle updatedArea = new Rectangle(x, y, 32, 32);
	Rectangle acao = new Rectangle();
	ArrayList<Integer> inventario = new ArrayList<>();
	ArrayList<Integer> habilidades = new ArrayList<>();
	
	public static void interact() {}
	
	public void setposicao(String posicao) {
		this.posicao = posicao;
		switch(this.posicao){
	case "cima":
		acao = new Rectangle(area.x, (area.y - 16), area.width, 16);
		break;
	case "baixo":
		acao = new Rectangle(area.x, (area.y + 32), area.width, 16);
		break;
	case "esquerda":
		acao = new Rectangle((area.x - 16), area.y , 16, area.height);
		break;
	case "direita":
		acao = new Rectangle((area.x + 32), area.y , 16, area.height);
		break;
	}
	
	}
	public int getX(){return this.x;}
	public int getY() {return this.y;}
	
	public void setY(boolean cima, boolean baixo, Rectangle r) {if(cima && !baixo  
			&& (updatedArea.y)-5>r.y) {y-=5; updatedArea.setLocation(x, y); setposicao("cima");}
	else if(baixo && !cima && (updatedArea.y+updatedArea.height-1)+4<r.height) {y+=5;updatedArea.setLocation(x, y);
	setposicao("baixo");}}
	
	public void setX(boolean esquerda, boolean direita, Rectangle r) {if(esquerda && !direita
		&& (updatedArea.x)-5>r.x) {x-=5;updatedArea.setLocation(x, y);setposicao("esquerda");}
	else if(direita  && !esquerda && (updatedArea.x+updatedArea.width-1)+6<r.width) 
	{ x+=5;updatedArea.setLocation(x, y);setposicao("direita");}}
	
	}


