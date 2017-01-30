package dip;

public class Main {

	public static void main(String[] args) {

		
		ButtonServer server = Factory.create();
		Button button = new Button(server);
		button.poll();

	}
	
	static class Factory { // enum 추상 팩토리 또한 가능하죠!
		public static ButtonServer create() {
			return new Lamp();
		}
	}

}
