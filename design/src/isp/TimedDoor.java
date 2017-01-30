package isp;

class TimedDoor implements Door {

	@Override
	public void lock() {
		System.out.println("TimedDoor lock");
	}

	@Override
	public void unLock() {
		System.out.println("TimedDoor unLock");

	}

	@Override
	public boolean isDoorOpen() {
		return false;
	}

	@Override
	public void timeout() {
		System.out.println("timeout");
		
	}

}
