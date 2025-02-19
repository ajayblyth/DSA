package LinkedList;

 public class SLL_2 {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(100);

        myLinkedList.append(200);
        myLinkedList.append(300);
        myLinkedList.append(400);

        myLinkedList.append(500);

        myLinkedList.prepend(50);
        myLinkedList.removeFirst();
        myLinkedList.printAll();
        myLinkedList.getLength();
    }
  public static class LinkedList{
        private  Node head;
      private  Node tail;
        private int length;

         private class Node{
          private  int value;
          private  Node next;

           public Node(int value){

                this.value = value;
            }

        }
        public LinkedList(int value){
            Node newNode = new Node(value);
             head = newNode;
             tail = newNode;
            length = 1;

        }
       private  void printAll(){
           Node temp = head;
           while (temp != null) {
               System.out.println( temp.value + " ");
               temp = temp.next;
           }

       }
       private void getLength(){
           System.out.println("length = " + length);
       }
      public void append(int value){
          Node newNode = new Node(value);
         if(head == null){
             head = newNode;
             tail = newNode;
             length++;
         }else{
             tail.next = newNode;
             tail = newNode;
             length++;
         }

   }
private void prepend(int val){
             Node newNode = new Node( val);

             if(head == null){
                 head = newNode;
                 tail = newNode;
                 length++;
             }
             else{
                newNode.next = head;
                head = newNode;
                length++;
             }
}
public Node removeFirst(){
             if(head == null)return null;

            Node temp = head;
            head = head.next;
            temp.next = null;
             length--;
    return temp;



}

     }


}
