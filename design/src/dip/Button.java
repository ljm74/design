package dip;

class Button {

	private ButtonServer itsButtonServer;
	public Button(ButtonServer itsButtonServer) {
		this.itsButtonServer = itsButtonServer;
	}

	public void poll() {

		if (true) {/* some condition */
			this.itsButtonServer.turnOn();
		}

	}
}
