package Singly;

public class SLLPractice1 {
    public static void main(String[] args) {
      LinkedList myLinkedList = new LinkedList(11);
      myLinkedList.append(22);
      myLinkedList.append(30);
      myLinkedList.append(40);
      myLinkedList.prepend(10);
//        System.out.println(myLinkedList.get(0).value);
        myLinkedList.set(1 , 12);
        myLinkedList.insert(2, 44);
//        myLinkedList.remove(2);
//      myLinkedList.removeFirst();
//      myLinkedList.removeLast();
        myLinkedList.reverse();
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
            public boolean set(int index, int value){
            if(index < 0 || index >= length)return  false;
            Node temp = get(index);
                {if (temp !=null){
                    temp.value = value;
                }return false;
                }
            }
            public Node remove(int index){
            if (index < 0 || index >= length) return null;
            if (index == 0 )removeFirst();
            if (index == length -1) removeLast();
            Node prev = get(index -1);
            Node temp = prev.next;
            prev.next = temp.next;
            temp.next =null;
            length --;
            return temp;

            }
            public boolean insert(int index, int value){
            if(index < 0 || index >= length)return false;

            if (index == 0){prepend(value);
            return true;}

            if(index == length -1) {append(value);
            return true;}
            Node newNode = new Node(value);
            Node temp = get (index - 1);
            newNode.next = temp.next;
            temp.next = newNode;
            length++;
            return true;

    }
    public void reverse(){

            Node temp = head;
            head = tail;
            tail = temp;
            Node before = null;
            Node after = temp.next;
            while(temp!= null){
                after = temp.next; //assign after
                temp.next = before;
                before = temp; //before updated
                temp = after; //temp updated


            }

    }
    }


}





