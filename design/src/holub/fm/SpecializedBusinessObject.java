package holub.fm;

class SpecializedBusinessObject extends BusinessObject {

	@Override
	protected Element createDefaultElement() {
		return new SpecializedElement();
	}
}
