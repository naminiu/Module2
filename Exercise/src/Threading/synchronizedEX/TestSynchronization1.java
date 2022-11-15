package Threading.synchronizedEX;

public class TestSynchronization1 {
    public static void main(String[] args) {
        Table obj = new Table();// tao mot object
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        MyThread3 t3 = new MyThread3(obj);
        t3.start();
        t1.start();
        t2.start();
    }
}
