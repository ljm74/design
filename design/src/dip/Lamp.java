package dip;

class Lamp implements ButtonServer {
	public void turnOff() {
		System.out.println("Lamp turnOff");
	}
	
	public void turnOn() {
		System.out.println("Lamp turnOn");
	}
}
