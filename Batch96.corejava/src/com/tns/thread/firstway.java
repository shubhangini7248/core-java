package com.tns.thread;
public class firstway extends Thread {

	public void run() {
		System.out.println("creation of thread by extending thread class");
	}

	public static void main(String[]  args) {
		firstway ob=new firstway();  // thread is born new state		
		ob.start(); // runnable
		ob.stop();
		ob.start();
	}

}
