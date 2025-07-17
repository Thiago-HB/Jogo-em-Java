package entidades;

public abstract class Item {
protected int quantidade;
public String nome;
abstract void usar(Player p);
public void setQuantidade(int a){if(quantidade + a >= 0) {quantidade += a;}};
}
