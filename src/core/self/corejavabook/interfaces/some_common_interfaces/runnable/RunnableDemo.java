package core.self.corejavabook.interfaces.some_common_interfaces.runnable;

public class RunnableDemo {
    public static void main(String[] args) {
        Runnable task = new HelloTask();
        Thread thread = new Thread(task);
        thread.start();
        System.out.println(Thread.currentThread().getName() + " Thread started");
    }
}

class HelloTask implements Runnable {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000 - i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " Hello, World!");
        }
    }
}