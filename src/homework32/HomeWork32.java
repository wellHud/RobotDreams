package homework32;

public class HomeWork32 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new PrintNumbers("Thread 1"));
        Thread thread2 = new Thread(new PrintNumbers("Thread 2"));
        thread1.start();
        thread2.start();
    }
}

class PrintNumbers implements Runnable {
    private String threadName;

    public PrintNumbers(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(threadName + ": " + i);
        }
    }
}