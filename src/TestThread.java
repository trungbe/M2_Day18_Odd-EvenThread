public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();
        Thread thread1 = new Thread(oddThread);
        Thread thread2 = new Thread(evenThread);
        System.out.println("Odd number: ");
        thread1.start();
        thread1.join();

        System.out.println("Even number: ");
        thread2.start();
    }
}
