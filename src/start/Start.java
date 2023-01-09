package start;

import reno.Gimnasio;
import reno.Robot;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Robot juanjo = new Robot("Juanjo");
		Robot marcos = new Robot("Marcos");
		
		System.out.println(juanjo);
		System.out.println(marcos);
		
		Robot ganador = Gimnasio.lucha(juanjo, marcos);
		System.out.println(ganador);
		
	}

}
