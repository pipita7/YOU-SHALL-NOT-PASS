package Entidad;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Logica.Juego;
import Personajes.Enemigo;

public class Bomba extends ObjetoPrecioso{
	
	
	public Bomba(Juego j){
		super(j);
		sprite=new ImageIcon(this.getClass().getResource("/Imagenes/bomba.png"));
		grafico=new JLabel(sprite);
		grafico.setBackground(null);
	}
	
	public void efecto() {
		for(Enemigo a:miJuego.getEnemigos()){
			a.recibirDamage(40);
		}
		this.morir();
		miJuego.eliminarObjeto(this,this.x, this.y);
		this.grafico.setOpaque(false);
	}

}