package DanhSach.THTrienKhaiLopLinkedlistDonGian;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList n1 = new MyLinkedList(1);
        n1.addFirst(2);
        n1.addFirst(3);
        n1.addFirst(4);
        n1.addFirst(5);
        n1.addFirst(6);
        n1.printList();
        n1.addToIndex(1, 11);
        n1.printList();
    }
}
