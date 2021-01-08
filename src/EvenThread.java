public class EvenThread implements Runnable {
    @Override
    public void run() {
        for (int j = 0; j < 10; j++) {
            if (j % 2 == 0) {
                System.out.println(j);
                try {
                    Thread.sleep(15);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}
