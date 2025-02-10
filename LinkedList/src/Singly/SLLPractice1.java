package Singly;

public class SLLPractice1 {
    public static void main(String[] args) {
      LinkedList myLinkedList = new LinkedList(11);
      myLinkedList.append(22);
      myLinkedList.prepend(10);
      myLinkedList.removeFirst();
        myLinkedList.printAll();

    }

        public static class LinkedList{
        private Node head;
        private Node tail;
        private int length;

        class Node {
            int value;
            Node next;
            public Node(int value){
                this.value=value;
            }
        }
        public LinkedList(int value){
            Node newNode = new Node(value);
            head = newNode;
            tail = newNode;
            length = 1;
        }

        public void printAll(){
           Node temp = head;
           while(temp != null){
               System.out.println(temp.value);
               temp= temp.next;
           }

        }
        public void append(int value){
            Node newNode = new Node(value);
            if(length == 0 ) {
                head = newNode;
                tail = newNode;
            }
                else{ tail.next = newNode;
                    tail = newNode;

                }
                length++;

            }
            public void prepend(int value){
            Node newNode = new Node(value);
            if(length == 0){
                head = newNode;
                tail = newNode;
            }
            newNode.next = head;
            head = newNode;
            length ++;
        }
        public Node removeFirst(){
            if (length == 0) return  null;
            if (length == 1){
                head = null;
                tail = null;
            }
            Node temp = head;
            head = head.next;
            temp.next =null;
            length --;

            return temp;
        }
        }


}





