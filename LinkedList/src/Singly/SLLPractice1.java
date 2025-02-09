package Singly;

public class SLLPractice1 {
    public static void main(String[] args) {
      LinkedList myLinkedList = new LinkedList(11);
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
        }


}





