package entidades;

import java.awt.Image;
import java.awt.Rectangle;

public abstract class Entidade {
	int hp, maxHp, maxMp, mp, x, y;
 Image imagem;
String nome, posicao;
Rectangle area = new Rectangle((x-4),(y-4), 40, 40);

}
