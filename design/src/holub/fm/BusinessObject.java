package holub.fm;

class BusinessObject { // Creator
	
	public void doSomething() {
		Element e = createDefaultElement();
		System.out.println(e.getClass());
		// ...
		
	}
	
	protected Element createDefaultElement() {
		return new Element();
	}
	
}
