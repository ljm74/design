package enumaf;

class Main {

	public static void main(String[] args) {

		IFactory factory = EnumAbstractFactory.Xp;
		factory.createEdit();
		factory.createButton();
		
		factory = EnumAbstractFactory.Linux;
		factory.createEdit();
		factory.createButton();
		
		
	}

}
