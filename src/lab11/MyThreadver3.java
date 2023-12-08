package lab11;

public class MyThreadver3 implements Runnable {
    Thread thread;

    MyThreadver3(String name) {
        thread = new Thread(this, name);
    }

    public static MyThreadver3 createAndStart(String name) {
        MyThreadver3 myThreadver3 = new MyThreadver3(name);
        myThreadver3.thread.start();
        return myThreadver3;
    }

    public void run() {
        System.out.println(thread.getName() + " starts to operate");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(100);
                System.out.println(thread.getName() + " is executed, the counter value: " + count);
            }
        } catch (InterruptedException e) {
            System.out.println(thread.getName() + " has been interrupted");
        }
        System.out.println(thread.getName() + " finishes running.");
    }
}

class MoreThreads2 {
    public static void main(String[] args) {
        System.out.println("The main thread starts running,");

        MyThreadver3 myThread1 = MyThreadver3.createAndStart("Child thread : 1");
        MyThreadver3 myThread2 = MyThreadver3.createAndStart("Child thread : 2");
        MyThreadver3 myThread3 = MyThreadver3.createAndStart("Child thread : 3");

        try {
            myThread1.thread.join();
            myThread2.thread.join();
            myThread3.thread.join();
        } catch (InterruptedException e) {
            System.out.println("The main thread has been interrupted");
        }

        System.out.println("The main thread is exiting");
    }
}