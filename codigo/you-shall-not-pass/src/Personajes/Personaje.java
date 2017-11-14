package Personajes;

import javax.swing.ImageIcon;

import Logica.GameObject;
import Logica.Mapa;

public abstract class Personaje extends GameObject {
	
	protected Mapa mapa;
	protected int vida;
	protected int rango;
	protected int damage;
	
	public Personaje(Mapa m,int damage,int vida){
		mapa=m;
		this.damage=damage;
		this.vida=vida;
	}
	
	public int getVida(){
		return vida;
	}
	
	public void setVida(int v){
		vida=v;
	}
	
	public abstract int getVidaOriginal();
	
	public int getRango(){
		return rango;
	}
	
	public int getDamage(){
		return damage;
	}
	
	public void colisionar(GameObject p){
		p.accept(miVisitor);
	}
	
	public void setSprite (String s){
		sprite = new ImageIcon(this.getClass().getResource(s));
		grafico.setIcon(sprite);
		grafico.repaint();
		sprite.setImageObserver(grafico);
		this.getGrafico();
		grafico.setBackground(null);
	}
	
	public void recibirDamage(int d, Personaje p){}
	
	public void efecto(){}
	
	public abstract void eliminar(); 
	
	public void actualizar(){}
	
	
}
