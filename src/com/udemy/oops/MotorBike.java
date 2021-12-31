package com.udemy.oops;

public class MotorBike {
	// state
	private int speed; // member variable

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	void start() {
		System.out.println("Bike started");
	};

	void stop() {
		System.out.println("Bike stopped");
	};
}
