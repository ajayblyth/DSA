package Singly;

public class SLLPractice1 {
    public static void main(String[] args) {
      LinkedList myLinkedList = new LinkedList(11);
      myLinkedList.append(22);
      myLinkedList.prepend(10);
        System.out.println(myLinkedList.get(0).value);
//      myLinkedList.removeFirst();
//      myLinkedList.removeLast();
        myLinkedList.printAll();

    }

        public static class LinkedList{
         Node head;
         Node tail;
         int length;

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
            public Node removeLast(){
                if(length == 0) return null;
                Node temp = head;
                Node prev = head;
                while(temp.next != null){
                    prev = temp;
                    temp = temp.next;
                }
                tail = prev;
                tail.next = null;
                length --;
                return temp;

        }

            public Node get(int index) {
                if(index <0 || index >= length)return null;
                Node temp = head;

                for( int i = 0; i <index ; i++){
                    temp = temp.next;
                }return temp;

            }

    }





}





