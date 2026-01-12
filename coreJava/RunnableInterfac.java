package com.csm.coreJava;

class ThreadClassA implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}

}

class ThreadClassB implements Runnable {

	@Override
	public void run() {
		for (int i = 6; i <= 10; i++) {
			System.out.println(i);
		}
	}

}

public class RunnableInterfac {
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new ThreadClassA());
		Thread thread1 = new Thread(new ThreadClassB());

		thread.start();

		thread.join();// जब आप thread.join(); का उपयोग करते हैं, तो मुख्य थ्रेड
						// केवल तब तक आगे बढ़ नहीं सकता जब तक thread.start(); पूरा नहीं होता।

		thread1.start();
	}

}
