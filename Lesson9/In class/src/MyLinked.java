class MyList {
    Node head;

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    //khởi tạo danh sách liên kết đơn
    MyList() {
        head = null;
    }

    void addAtHead(int valOfNewNode) {
        Node newNode = new Node(valOfNewNode);
        newNode.next = head;
        head = newNode;
    }

    void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            if (temp.next == null) {
                System.out.print(temp.val);
                break;
            }
            System.out.print(temp.val + "-> ");
            temp = temp.next;
        }
    }

    void addAtIndex(int valOfNewNode, int index) {
        Node newNode = new Node(valOfNewNode);
        int count = 0;
        Node temp = head;
        while (count < index) {
            temp = temp.next;
            count++;
        }

        newNode.next = temp.next;
        temp.next = newNode;

    }


    void addAtLast(int valOfNewNode) {
        Node newNode = new Node(valOfNewNode);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void deleteAtIndex(int index) {
        if (index == 0) {
            deleteAtHead();
        } else {

            Node temp = head;
            int count = 0;
            while (count < index - 1) {
                temp = temp.next;
                count++;
            }
            temp.next = temp.next.next;
        }
    }

    void deleteAtHead() {
        head = head.next;
    }

    void deleteAtLast(){
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

}

public class MyLinked {
    public static void main(String[] args) {
        MyList list = new MyList();
        list.addAtHead(1);
        list.addAtHead(3);
        list.addAtHead(5);
        list.addAtHead(7);
        list.printLinkedList();

        System.out.println("\n---");
        list.addAtIndex(100, 2);
        list.printLinkedList();

        System.out.println("\n---");
        list.addAtLast(35);
        list.printLinkedList();

        System.out.println("\n---");
        list.deleteAtIndex(3);
        list.printLinkedList();

        System.out.println("\n---");
        list.deleteAtHead();
        list.printLinkedList();

        System.out.println("\n---");
        list.deleteAtLast();
        list.printLinkedList();
    }
}
