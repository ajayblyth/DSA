package LinkedList;

public class DLL_2 {
    public static void main(String[] args) {
        DLL_2 myDLL = new DLL_2(10);
        myDLL.append(20);
        myDLL.append(30);

        myDLL.append(40);

        myDLL.append(50);
        myDLL.prepend(5);
        myDLL.removeFirst();

        myDLL.printAll();

    }

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    DLL_2(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;

    }

    private void printAll() {
        Node temp = head;
        while (temp != null) {
            System.out.println("Doubly linked list = " + temp.value);
            temp = temp.next;
        }

    }private void append(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            tail = newNode;
            length++;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail= newNode;
            length++;

        }

    }
    private void prepend(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            tail = newNode;
        }

        head.prev = newNode;
       newNode.next= head;
        head = newNode;
        length++;

    }
    private Node removeFirst(){
        if (head == null) return null;
        Node temp = head;
        head = temp.next;
        temp.next = null;
        head.prev = null;
        length--;
        return temp;

    }


}

