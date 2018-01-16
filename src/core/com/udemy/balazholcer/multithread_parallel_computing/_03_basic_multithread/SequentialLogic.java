package core.com.udemy.balazholcer.multithread_parallel_computing._03_basic_multithread;

class Runner1 {
    public void startRunning(){
        for (int i = 0; i < 1000; i++) {
            System.out.print(i + ",Runner1" + "\t");
        }
    }
}

class Runner2 {
    public void startRunning(){
        for (int i = 0; i < 1000; i++) {
            System.out.print(i + ",Runner2"+ "\t");
        }
    }
}
public class SequentialLogic {
    public static void main(String[] args) {
        Runner1 runner1 = new Runner1();
        Runner2 runner2 = new Runner2();

        long starttime = System.currentTimeMillis();
        runner1.startRunning();
        System.out.println();
        runner2.startRunning();
        long endtime = System.currentTimeMillis();
        System.out.println();
        System.out.println("Time taken = " + (endtime  -starttime));
    }
}
