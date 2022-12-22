package reno;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Robot robot1 = new Robot();
		robot1.setNombre("Carlos");
		robot1.setPuntosVida(3000);
		
		Robot robot2 = new Robot();
		robot2.setNombre("Adrián");
		robot2.setPuntosVida(5000);
		
		System.out.println(robot1);
		System.out.println(robot2);
		
	}

}
