package Personajes;
import java.awt.Color;

import javax.swing.ImageIcon;
public class Humano extends Aliado {
	
	public Humano(){
		precioAliado=10;
		rango=1;
		vida=50;
		da�o=12;
		sprite=new ImageIcon("C:/Users/Tom�s/Pictures/ProyectoTDP/humano.png");
		color=Color.cyan;
	}
}
