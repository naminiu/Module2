package Threading.synchronizedEX;

public class TestSynchronization3 {
    public static void main(String args[]) {
        final Table obj = new Table();// tao mot object

        Thread t1 = new Thread() {
            public void run() {
                obj.printTable(5);
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                obj.printTable(100);
            }
        };
        Thread t3 = new Thread() {
            public void run() {
                obj.printTable(200);
            }
        };

        t1.start();
        t2.start();
        t3.start();
    }
}
