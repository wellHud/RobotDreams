package homework34;

import java.util.concurrent.*;

public class HomeWork34 {public static void main(String[] args) throws Exception {
    ExecutorService executorService = Executors.newFixedThreadPool(10);
    for (int i = 0; i < 10; i++) {
        Callable<Integer> callable = new RandomNumberGenerator();
        Future<Integer> future = executorService.submit(callable);
        System.out.println("Result: " + future.get());
    }
    executorService.shutdown();
}
}

class RandomNumberGenerator implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return (int) (Math.random() * 50 + 1);
    }
}