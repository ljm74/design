package af;

class XpFactory implements IFactory {

	@Override
	public IEdit createEdit() {
		return new XpEdit();
	}

	@Override
	public IButton createButton() {
		return new XpButton();
	}

}
