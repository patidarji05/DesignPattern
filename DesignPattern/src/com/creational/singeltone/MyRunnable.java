package com.creational.singeltone;

public class MyRunnable implements Runnable{
	
	private String myThread;
	
	public MyRunnable(String myThread) {
		this.myThread = myThread;
	}

	@Override
	public void run() {
	 
		Singletone s1 = Singletone.getInstance(myThread);
		System.out.println(Thread.currentThread().getName() + "   "+ s1.getData());
		
	}

}
