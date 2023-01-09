package reno;

public class Gimnasio {

	public static Robot lucha(Robot robot0, Robot robot1) {

		int turno = (int) (Math.random() * 2);

		while ((robot0.puntosVida > 0) && (robot1.puntosVida > 0)) {

			int golpe = (int) (Math.random()) * 101;

			if (turno == 0) {

				// el golpe lo da this
				if (robot1.defensa < golpe) {

					robot1.puntosVida -= robot0.ataque;
					// robot1.setPuntosVida(robot1.getPuntosVida()-robot1.getAtaque());
				}
			}

			else if (turno == 1) {

				// el golpe lo da otro
				if (robot0.defensa < golpe) {

					robot0.puntosVida -= robot1.ataque;
				}
			}

			turno = (turno == 0) ? 1 : 0;
		}

		if (robot0.puntosVida < 0) {
			return robot1;
		} else
			return robot0;
	}

}
