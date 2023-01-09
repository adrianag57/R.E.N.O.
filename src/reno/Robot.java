package reno;

public class Robot {

	private String nombre;
	protected int puntosVida;
	protected int ataque;
	protected int defensa;

	public Robot(String nombre) {

		this.nombre = nombre;
		puntosVida = 100;
		ataque = 1 + (int) (Math.random() * 20);
		defensa = (int) (Math.random() * 101);
	}

	public Robot lucha(Robot otro) {

		int turno = (int) (Math.random() * 2);

		while ((this.puntosVida > 0) && (otro.puntosVida > 0)) {

			int golpe = (int) (Math.random()) * 101;

			if (turno == 0) {

				// el golpe lo da this
				if (otro.defensa < golpe) {

					otro.puntosVida -= this.ataque;
				}
			}

			else if (turno == 1) {

				// el golpe lo da otro
				if (this.defensa < golpe) {

					this.puntosVida -= otro.ataque;
				}
			}

			turno=(turno==0)?1:0;
		}

		if (this.puntosVida < 0) {
			return otro;
		} else
			return this;
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
