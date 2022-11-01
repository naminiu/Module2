package DanhSach.THTrienKhaiLopLinkedlistDonGian;


public class MyLinkedList {
    public class Node {
        Node next;
        Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    private Node head;
    private Node tail;
    private int numNodes;

    public int getNumNodes() {
        return numNodes;
    }

    public MyLinkedList(Object data) {
        head = new Node(data);
        tail = head;
    }

    public void addFirst(Object data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        numNodes++;
    }

    public void addLast(Object data) {
        Node newNode = new Node(data);
        tail.next = newNode;
        tail = tail.next;
        numNodes++;
    }

    public void addToIndex(int index, Object data) {
        if (index == 0) {
            addFirst(data);
        } else if (index >= numNodes) {
            addLast(data);
        } else {
            Node current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            Node newNode = new Node(data);
            newNode.next = current.next;
            current.next = newNode;
            numNodes++;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
            if (temp != null) {
                System.out.print("-->");
            } else {
                System.out.println("");
            }
        }
    }
}