package com.tns.thread;

public class secondway implements Runnable {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			secondway t=new secondway();
			Thread th=new Thread(t);
			th.start();
//			th.start(); illegal thread state exception
			th.run();
			th.run();

		}
		public void run() {
			System.out.println("creation of thread using runnable interface");
		}
	}

