package Personajes;

public class Normal extends EstadoEnemigo{
	
	public Normal(Enemigo e) {
		super(e);
		miEnemigo.setVida(e.getVidaOriginal());
		miEnemigo.setSprite("/Imagenes/"+e.getClass().getSimpleName()+".gif");

	}


	public void proteccion() {
		
	}

	public void relentizar() {
		
	}
	
	public void recibirDamage(int d, Personaje p){
				miEnemigo.setVida(miEnemigo.getVida()-d);
				if(miEnemigo.getVida() <= 0){ 
					miEnemigo.morir();
				}
	}
}
