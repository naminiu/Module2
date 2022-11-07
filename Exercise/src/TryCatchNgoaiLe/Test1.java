package TryCatchNgoaiLe;

public class Test1 {
        public static void main(String args[]){

            try {
                int a[] = new int[5];
                a[5] = 50/0;
            } catch (ArithmeticException e) {
                System.out.println("1");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("2");
            } catch (Exception e) {
                System.out.println("3");
            }
    }
}
