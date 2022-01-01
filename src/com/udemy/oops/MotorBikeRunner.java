package com.udemy.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();

		ducati.start();
		honda.start();

		ducati.setSpeed(50);

		ducati.increaseSpeed(250);
		honda.increaseSpeed(100);

		ducati.decreaseSpeed(150);
		honda.decreaseSpeed(50);

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());

		// honda.setSpeed(80);
		// System.out.println(honda.getSpeed());

		//		ducati.setSpeed(20);
		//		honda.setSpeed(0);

		ducati.stop();
	}

}
