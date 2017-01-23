package holub.fm;

class Main {

	public static void main(String[] args) {
		
		//BusinessObject businessObject = new BusinessObject();
		BusinessObject businessObject = new BusinessObject(){
			@Override
			protected Element createDefaultElement() {
				return new SpecializedElement();
			}
		};
		
		businessObject.doSomething();
		
		// 이러한 방식은 사용자가 상속을 통해 맞춤화를 하는 
		// 구현 상속(extends) 기반의 '프레임워크'를 만들 때 유용하다.

	}

}
