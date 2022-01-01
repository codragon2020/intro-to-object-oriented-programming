package com.udemy.oops;

public class MotorBike {
	// state
	private int speed; // member variable

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}
	}

	public void increaseSpeed(int howMuch) {
		this.speed = this.speed + howMuch;
	}

	void start() {
		System.out.println("Bike started");
	};

	void stop() {
		System.out.println("Bike stopped");
	};
}
