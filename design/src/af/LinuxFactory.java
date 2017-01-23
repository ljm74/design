package af;

class LinuxFactory implements IFactory {

	@Override
	public IEdit createEdit() {
		return new LinuxEdit();
	}

	@Override
	public IButton createButton() {
		return new LinuxButton();
	}

}
