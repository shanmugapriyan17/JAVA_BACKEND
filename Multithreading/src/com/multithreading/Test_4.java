package com.multithreading;

public class Test_4 extends Thread{
	@Override
	public void run() {
		System.out.println("Priority of Thread running run() method "+"-> "+Thread.currentThread().getName()+"  "+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		System.out.println("Priority of Thread running main() method "+"-> "+Thread.currentThread().getName()+"  "+Thread.currentThread().getPriority());
		Test_4 th = new Test_4();
		th.setPriority(Thread.MAX_PRIORITY);
		th.start();
		
		

	}

}
