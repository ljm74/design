package enumaf;

enum EnumAbstractFactory implements IFactory {
	Xp {
		@Override
		public IEdit createEdit() {
			return new XpEdit();
		}

		@Override
		public IButton createButton() {
			return new XpButton();
		}

	},
	Linux {

		@Override
		public IEdit createEdit() {
			return new LinuxEdit();
		}

		@Override
		public IButton createButton() {
			return new LinuxButton();
		}
		
	};

}
