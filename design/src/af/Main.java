package af;

class Main {

	public static void main(String[] args) {

		// [Abstract Factory Pattern]
		IFactory factory = new XpFactory();
		factory.createEdit();
		factory.createButton();

		factory = new LinuxFactory();
		factory.createEdit();
		factory.createButton();

		// 여기서 발생할 수 있는 이슈(Issue)는 
		// 너무 많은 factory 객체가 생성될 수 있다는 것이다.
		// 그렇다면 [Enum Abstract Factory Pattern]을 생각해 볼 수 있다.
		
	}

}
