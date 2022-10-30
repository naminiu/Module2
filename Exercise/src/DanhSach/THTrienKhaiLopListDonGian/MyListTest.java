package DanhSach.THTrienKhaiLopListDonGian;

public class MyListTest {
    public static void main(String[] args) {
//        MyList<Integer> listInteger = new MyList<Integer>();
//        listInteger.add(1);
//        listInteger.add(2);
//        listInteger.add(6);
//        listInteger.add(3);
//        listInteger.add(4);
//        listInteger.add(5);
//
//        System.out.println(listInteger.toString());
//        System.out.println(listInteger.get(1));
//        System.out.println(listInteger.toString());

        MyList<Integer> myList = new MyList<Integer>(5);
        myList.add(1);
        myList.add(6);
        myList.add(8);
        myList.add(9);
        System.out.println(myList);
//        myList.add(11,15);
//        System.out.println(myList);
//        System.out.println(myList.clone());
//        System.out.println("----");

        System.out.println(myList.clear());



//        System.out.println(myList);
//        myList.add(4,11);
//        System.out.println(myList);


//        myList.add(3,11);
//        System.out.println("CAPACITY "+myList.getDEFAULT_CAPACITY());
//        System.out.println(myList.getElements());


    }
}
