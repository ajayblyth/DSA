package LinkedList;

public class DLL_2 {
    public static void main(String[] args) {
       DLL_2  myDLL = new DLL_2(10);
       myDLL.printAll();
    }
    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;
        Node prev;
        Node(int value){
            this.value = value;
        }
    }
    DLL_2(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;

    }
    public  void printAll(){
        Node temp = head;
        while(temp != null){
            System.out.println("Doubly linked list = " + temp.value);
       temp= temp.next;
        }

    }


}

