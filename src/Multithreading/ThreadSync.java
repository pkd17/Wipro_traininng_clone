package Multithreading;

public class ThreadSync {
	private int c=0;
	
	public synchronized void inc() {
		c++;
	}
	public synchronized int get() {
		return c;
	}

}
