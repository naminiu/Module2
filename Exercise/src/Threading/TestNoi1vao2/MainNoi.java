package Threading.TestNoi1vao2;

public class MainNoi {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("start");
        MyThread1Noi t1 = new MyThread1Noi();
        Thread t2 = new Thread(new MyThread2Noi(t1));

        t1.start();
        t2.start();

        System.out.println("end");
    }
}
