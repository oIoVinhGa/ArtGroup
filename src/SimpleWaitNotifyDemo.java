
public class SimpleWaitNotifyDemo {

    private static String message;

    public static void main(String[] args) {
        Object lock = new Object();

        Thread thread1 = new Thread(() -> {
            synchronized (lock) {
                while (message == null) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

            System.out.println(message);
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock) {
                message = "A message from thread1";
                lock.notify();
            }
        });

        thread1.start();
        thread2.start();
    }
}
