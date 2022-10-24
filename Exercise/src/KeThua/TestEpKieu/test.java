package KeThua.TestEpKieu;

public class test {
    public static void main(String[] args) {
        Customer customer = new CustomerChild();
        CustomerChild customerChild = new CustomerChild();
        customer.setName("CodeGym");
        customerChild.setName("Hai Tan");
        customerChild.setAge(18);
        customerChild = (CustomerChild) customer;

        System.out.println(customer);
        System.out.println(customerChild);

//        CustomerChild customerChild = new CustomerChild();
//        CustomerChild customerChild1 = new CustomerChild();
//        customerChild.setName("CodeGym");
//        customerChild.setAge(18);
//        customerChild1 = customerChild;
//        System.out.println(customerChild);
//        System.out.println(customerChild1);
    }
}
