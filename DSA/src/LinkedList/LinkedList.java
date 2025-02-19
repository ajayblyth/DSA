package LinkedList;

public  class LinkedList {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(10);
        myLinkedList.append(20);
        myLinkedList.append(30);
        myLinkedList.append(40);
        myLinkedList.append(50);

//        myLinkedList.prepend(10);
//       myLinkedList.removeLast();
//    myLinkedList.removeFirst();
//        myLinkedList.remove(2);
//        System.out.println(myLinkedList.get(2).value);
        myLinkedList.reverse();
//        myLinkedList.set(2 , 30);
//        myLinkedList.insert(1, 15);
//        myLinkedList.getHead();
//        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printAll();

    }

    private Node remove(int index){
        if(index < 0 || index >= length) return null;
        if (index ==0) return removeFirst();
        if (index == length -1) return removeLast();
        Node prev = get(index -1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }
    private void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for(int i = 0; i < length; i++){
            after =  temp.next; //assign after
            temp.next = before; // reverse
            before = temp; //update before
            temp = after; //update temp

        }


    }
    public boolean insert(int index, int value){
        if(index < 0 || index > length)return false;
        if (index == 0){
            prepend(value);
            return true;
        }
        if(index == length){
            append(value);
            return  true;
        }
        Node newNode = new Node(value);
        Node temp = get(index -1);
        newNode.next = temp.next;
        temp.next= newNode;
        length++;
return true;
    }
    private boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null){
            temp.value = value;
        }return false;
    }

    private Node get(int index) {
        if(index <0 || index >= length)return null;
        Node temp = head;

      for( int i = 0; i <index ; i++){
          temp = temp.next;
      }return temp;

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
        if (length == 1){
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

    private class Node {
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
            System.out.println(  temp.value + " ");
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