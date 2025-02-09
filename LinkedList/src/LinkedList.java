public  class LinkedList {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(103);
        myLinkedList.append(23);
        myLinkedList.prepend(20);
//       myLinkedList.removeLast();
    myLinkedList.removeFirst();

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printAll();

    }

    private Node removeFirst() {
        if(length == 0)return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        return temp;
    }

    private Node removeLast() {
        if (length == 0) return null;

        Node temp = head;
        Node pre = head;
        while(temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length ==0){
            head = null;
            tail =null;
        }
        return temp;
    }

    private void prepend(int i) {
        Node newNode = new Node(i);
        if( length == 0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }length++;

    }

    private  void append(int value) {
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail =  newNode;
        }else{
            tail.next = newNode;
            tail = tail.next;
        }
        length++;

    }

    private Node head;
    private Node tail;
    private int length;

    class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }


    private void printAll() {
        Node temp = head;
        while (temp != null) {
            System.out.print(  temp.value + " ");
            temp = temp.next;

        }
    }

    private void getLength() {
        System.out.println("length = " + length);
    }

    private void getTail() {
        System.out.println("Tail = " + tail.value);


    }

    private void getHead() {
        System.out.println("head = " + head.value);

    }
}