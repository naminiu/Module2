package Test.Equals;

public class TestEquals {
    int amount;
    String currencyCode;

    public TestEquals() {
    }

    public  TestEquals(int amount, String currencyCode) {
        this.amount = amount;
        this.currencyCode = currencyCode;
    }




    public static void main(String[] args) {
        TestEquals income = new TestEquals(55, "USD");
        TestEquals expenses = new TestEquals(55, "USD");
        System.out.println(income.hashCode());
        System.out.println(expenses.hashCode());

        System.out.println(income.equals(expenses)); // false
        System.out.println("--------");

        TestEquals tmp = income;
        boolean b1 = income.equals(income); // true
        System.out.println(b1);
        boolean b2 = tmp.equals(income); // true
        System.out.println(b2);
        System.out.println("------------");


//        String s1 = new String("HELLO");
//        String s2 = new String("HELLO");
//        System.out.println(s1 == s2);       //false
//        System.out.println(s1.equals(s2));  // true
//
//
//        Double s3 = new Double(1);
//        Double s4 = new Double(1);
//        System.out.println("------------------");
//        System.out.println(s3.equals(s4)); // true


    }
}
