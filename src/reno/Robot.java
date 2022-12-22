package reno;

public class Robot {

	private String nombre;
	private int puntosVida;
	private int ataque;
	private int defensa;
	
	public Robot(String nombre) {
		
		this.nombre = nombre;
		puntosVida = 1000;
		ataque = (int) (Math.random()*21+0);
		defensa = (int) (Math.random()*101+0);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntosVida() {
		return puntosVida;
	}

	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}

	public int getAtaque() {
		
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	@Override
	public String toString() {
		return "Robot [nombre=" + nombre + ", puntosVida=" + puntosVida + ", ataque=" + ataque + ", defensa=" + defensa
				+ "]";
	}

}
