package LinkedList;

 public class SLL_2 {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(100);
        myLinkedList.printAll();
    }
  public static class LinkedList{
         Node head;
         Node tail;
         int length;
       private class  Node{
          private  int value;
          private  Node next;
            Node(int value){
                this.value = value;
            }

        }
        public LinkedList(int value){
            Node newNode = new Node(value);
             head = newNode;
             tail = newNode;
            int length = 1;

        }
       private  void printAll(){
           Node temp = head;
           while (temp != null) {
               System.out.println( temp.value + " ");
               temp = temp.next;

           }


       }
   }


}
