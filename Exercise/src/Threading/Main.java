package Threading;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("start");
         //cach 1
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();



        // cach 2
        MyThread2 myThread2 = new MyThread2();
        Thread t = new Thread(myThread2);
        t.start();
        System.out.println("luong 1");
        myThread1.join();
        System.out.println("luong 2");
        t.join();
        System.out.println("end");

//        try {
//            Thread.sleep(5000);
//            t.stop();
//            thread1.stop();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        // cach 3
//        Thread th3 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    try {
//                        System.out.println("ccccccccccccccccccccccccccccccccccc" + i);
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }
//        });
//        th3.start();
//
//        //cach 4
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println("dddddddddddddddddddddddddddd" + i);
//                }
//            }
//        }).start();


    }
}
