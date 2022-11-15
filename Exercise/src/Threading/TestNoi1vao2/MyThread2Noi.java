package Threading.TestNoi1vao2;

public class MyThread2Noi implements Runnable {
    MyThread1Noi t1;

    public MyThread2Noi(MyThread1Noi t1) {
        this.t1 = t1;
    }
    public MyThread2Noi() {
    }

    @Override
    public void run() {
        System.out.println("t2 runnning");
        try {
            System.out.println("join t1 vao t2");
            t1.join();
            System.out.println("t1 finish");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    // cach 2
}
