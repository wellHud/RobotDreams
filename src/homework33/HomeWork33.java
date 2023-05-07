package homework33;

public class HomeWork33 {
    public static void main(String[] args) {
            Thread thread = new Thread(new GenerateNumbers());
            thread.start();
        }
    }

    class GenerateNumbers implements Runnable {
        @Override
        public void run() {
            int num = 0;
            while (true) {
                num = (int) (Math.random() * 10 + 1);
                System.out.println(num);
                if (num == 5) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }
    }

