class MyLinkedList {
    Node head;
    int length;

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            length++;
        }
    }

    public MyLinkedList() {
        head = null;
        length = 0;
    }

    public int get(int index) {
        if (this.length == 0) {
            return -1;
        }

        if (index > length - 1) {
            return -1;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp.val;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public void addAtTail(int val) {
        Node temp = head;
        if (temp == null) {
            addAtHead(val);
            return;
        }

        Node newNode = new Node(val);
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void addAtIndex(int index, int val) {
        if (index > length - 1) {
            return;
        }

        if (index == 0) {
            addAtHead(val);
            return;
        }

        Node newNode = new Node(val);
        int count = 0;
        Node temp = head;
        while (count < index - 1) {
            temp = temp.next;
            count++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteAtIndex(int index) {
        if (index > length - 1) {
            return;
        }

        if (index == 0) {
            head = head.next;
            length--;
        } else {
            Node temp = head;
            int count = 0;
            while (count < index - 1) {
                temp = temp.next;
                count++;
            }
            temp.next = temp.next.next;
            length--;
        }
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
}


public class LC {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(3, 2);
        System.out.println(" length= " + myLinkedList.length + "\n");


    }
}
//[["","addAtHead","addAtTail","addAtIndex"]
//[,[1],[3],[3,2]]


/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */