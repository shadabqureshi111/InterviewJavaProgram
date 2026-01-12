package com.csm.coreJava;

class MyThread1 extends Thread 
{
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println("Thread 1 is Running");
        }
    }
}

class MyThread2 extends Thread
{
	public void run()
	{
		for (int i = 6; i <= 10; i++) 
        {
            System.out.println("Thread 2 is Running" );
        }
	}
}

class MyThread3 extends Thread
{
	public void run()
	{
		for (int i = 11; i <= 15; i++) 
        {
            System.out.println("Thread 3 is Running" );
        }
	}
}

class MyThread4 extends Thread
{
	public void run()
	{
		for (int i = 16; i <= 20; i++) 
        {
            System.out.println("Thread 4 is Running" );
        }
	}
}
public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        MyThread3 t3 = new MyThread3();
        MyThread4 t4 = new MyThread4();
        
        System.out.println("Interrupt Thread = "+Thread.interrupted());
        System.out.println("Active  Thread = "+Thread.activeCount());
        System.out.println("Current Thread = "+Thread.currentThread().getName());

        t1.start();
//        t1.setDaemon(true);
       t1.join();
        System.out.println("Interrupt Thread = "+Thread.interrupted());
        System.out.println("Active  Thread = "+Thread.activeCount());
        System.out.println("Current Thread = "+Thread.currentThread().getName());
        t2.start();
        t2.join();
        
        System.out.println("Interrupt Thread = "+Thread.interrupted());
        System.out.println("Active  Thread = "+Thread.activeCount());
        System.out.println("Current Thread = "+Thread.currentThread().getName());
        t3.start();
        
        System.out.println("Interrupt Thread = "+Thread.interrupted());
        System.out.println("Active  Thread = "+Thread.activeCount());
        System.out.println("Current Thread = "+Thread.currentThread());
        t4.start();
        //Thread currentThread = Thread.currentThread();
        //int activeCount = Thread.activeCount();
        
        
        
    	
//		a.start();
//		System.out.println("Active count of a = "+ a.activeCount());
//		System.out.println("Active count of b = "+ b.activeCount());
//		System.out.println("Active count of c = "+ c.activeCount());
//		System.out.println("Active count of Thread = "+ Thread.activeCount());
////		a.join();
//		
//		b.start();
////		b.join();
//		System.out.println("Active count of a = "+ a.activeCount());
//		System.out.println("Active count of b = "+ b.activeCount());
//		System.out.println("Active count of c = "+ c.activeCount());
//		System.out.println("Active count of Thread = "+ Thread.activeCount());
//		
//		c.start();
////		c.join();
//		System.out.println("Active count of a = "+ a.activeCount());
//		System.out.println("Active count of b = "+ b.activeCount());
//		System.out.println("Active count of c = "+ c.activeCount());
//		System.out.println("Active count of Thread = "+ Thread.activeCount());
//	}
       
    }
}
