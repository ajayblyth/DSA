package Doubly;

public class DoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.append(2);
        myDLL.prepend(0);

        myDLL.printAll();
    }
    private Node head;
    private Node tail;
    private int length =1;


   public class Node{
int value;
Node next;
Node prev;
Node(int value){
    this.value = value;
        }

    }
    public DoublyLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }
    public void printAll(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;

        }}
    public boolean append(int value){
       Node newNode = new Node(value);
       if(length == 0){
           head = newNode;
           tail = newNode;
       }else{
       tail.next = newNode;
       newNode.prev = tail;
       tail = newNode;
       }
       length++;
       return true;
    }
    public void prepend(int value){
       Node newNode = new Node(value);
       if( length == 0){
           head = newNode;
           tail = newNode;
       }
       else {
           head.prev = newNode;
           newNode.next = head;
           head = newNode;
       }length++;
    }
}
