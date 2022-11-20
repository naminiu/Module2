package Test;

public class Main {

    public static void add(int a, int b) {
        class TestA {
            public void start() {
                System.out.println("TestA");
            }
        }
        class TestB extends TestA {
            public void start() {
                System.out.println("TestB");
            }

            public static void main(String[] args) {
                ((TestA) new TestB()).start();
            }
        }
    }
}
