package Threading.TestNoi1vao2;

public class MyThread1Noi extends Thread{
    @Override
    public void run() {
        System.out.println("t1 running");
        for (int i = 0; i < 10; i++) {
            System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    // cach 1
}
