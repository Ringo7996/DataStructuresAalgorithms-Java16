import java.awt.peer.PanelPeer;

class myQueueLinkedList {
    Node head;

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    myQueueLinkedList() {
        head = null;
    }

    void push(int valOfNewNode) {
        Node newNode = new Node(valOfNewNode);
        newNode.next = head;
        head = newNode;
    }

    int pop() {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        int tempVal = temp.next.val;
        temp.next = null;

        return tempVal;
    }

    boolean isFull() {
        return false;
    }

    boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
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


class myQueueArray {
    int[] array;
    int top;
    int bottom;
    int length;

    myQueueArray(int elementNumber) {
        this.array = new int[elementNumber];
        this.top = -1;
        this.bottom = 0;
        this.length =0;
    }

    void push(int val) {
        if (isFull()){
            System.out.println("Full!");
            return;
        }

        if (top == array.length - 1) {
            top = 0;
        }
        if (top < array.length - 1) {
            top++;
        }
        array[top] = val;
        length++;
    }

    int pop() {
        int temp = array[bottom];
        if (bottom == array.length - 1) {
            top = 0;
        }
        if (top < array.length - 1) {
            bottom++;
        }
        length--;
        return temp;

    }


    boolean isFull() {
        if (length == array.length) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty() {
        if (length == 0) {
            return true;
        } else {
            return false;
        }
    }
}


public class Queue {
    public static void main(String[] args) {
        myQueueLinkedList stack2 = new myQueueLinkedList();
        System.out.println(stack2.isEmpty());
        stack2.isFull();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);
        System.out.println(stack2.pop());
        System.out.println(stack2.isEmpty());
        System.out.println("----");

        myQueueArray array2 = new myQueueArray(5);
        System.out.println(array2.isEmpty());
        array2.push(10);
        array2.push(20);
        array2.push(30);
        array2.push(40);
        System.out.println(array2.pop());
        System.out.println(array2.pop());
        System.out.println(array2.isEmpty());
    }
}
