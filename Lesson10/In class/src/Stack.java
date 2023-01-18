class myStackLinkedList {
    Node head;

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    myStackLinkedList() {
        head = null;
    }

    void push(int valOfNewNode) {
        Node newNode = new Node(valOfNewNode);
        newNode.next = head;
        head = newNode;
    }

    int pop() {
        int temp = head.val;
        head = head.next;

        return temp;
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

class myStackArray {
    int[] array;
    int top;

    myStackArray(int elementNumber) {
        this.array = new int[elementNumber];
        this.top = -1;
    }

    void push(int val) {
        if (!isFull()) {
            top++;
            array[top] = val;
        } else {
            System.out.println("Full!");
        }
    }

    int pop() {
        if (!isEmpty()) {
            int temp = array[top];
            top--;
            return temp;
        } else {
            System.out.println("Empty!");
            return -1;
        }
    }

    boolean isFull() {
        if (top == array.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
}

public class Stack {
    public static void main(String[] args) {
        myStackLinkedList stack = new myStackLinkedList();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        int u = stack.pop();
        System.out.println(u);
        System.out.println(stack.pop());
        System.out.println("----");

        myStackArray array = new myStackArray(5);
        System.out.println(array.isEmpty());
        array.push(1);
        array.push(2);
        array.push(3);
        System.out.println(array.pop());
        System.out.println(array.isEmpty());
    }
}
