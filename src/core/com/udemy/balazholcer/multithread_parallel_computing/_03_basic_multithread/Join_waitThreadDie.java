package core.com.udemy.balazholcer.multithread_parallel_computing._03_basic_multithread;

class Runner7 extends Thread{
    public void startRunning(){
        for (int i = 0; i < 1000; i++) {
            System.out.print(i + ",Runner1" + "\t");
        }
    }

    @Override
    public void run() {
        startRunning();
    }
}

class Runner8 extends Thread{
    public void startRunning(){
        for (int i = 0; i < 1000; i++) {
            System.out.print(i + ",Runner2"+ "\t");
        }
    }

    @Override
    public void run() {
        startRunning();
    }
}

public class Join_waitThreadDie{
    public static void main(String[] args) {
        Thread t1 = new Runner7();
        Thread t2 = new Runner8();

        long starttime = System.currentTimeMillis();
        t1.run();
        System.out.println();
        t2.run();

        long endtime = System.currentTimeMillis();
        System.out.println("\nTime taken = " + (endtime  -starttime));
    }
}

