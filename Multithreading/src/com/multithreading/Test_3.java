package com.multithreading;



class Task1 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+"->"+i);
			
		}
	}
}

class Task2 extends Thread{
	public void run() {
		for(int i=11;i<=15;i++) {
			System.out.println(Thread.currentThread().getName()+"->"+i);
			
		}
	}
}
public class Test_3 {

	public static void main(String[] args) {
		Task1 th = new Task1();
		Task2 th1 = new Task2();
		
		th.start();
		th1.start();
	}

}
