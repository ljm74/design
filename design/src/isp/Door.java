package isp;

interface Door extends TimerClient {
	public void lock();
	public void unLock();
	public boolean isDoorOpen();
}
