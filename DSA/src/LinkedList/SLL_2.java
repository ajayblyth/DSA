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
        myLinkedList.removeLast();
        System.out.println("get = " + myLinkedList.get(2).value);
        myLinkedList.set(2, 301);
        myLinkedList.insert(2,302);
        System.out.println(myLinkedList.remove(3).value);
        myLinkedList.printAll();
        myLinkedList.reverse();
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
public Node removeLast(){
             if(length == 0) return  null;
             Node temp = head;
             if(length ==1){
                 head = null;
                 tail= null;
                 length--;
                 return temp;
             }
             Node pre = head;
             while(temp.next != null){
                 pre =temp;
                 temp = temp.next;
             }
             tail = pre;
             tail.next = null;
             length--;
             return  temp;

}
public Boolean insert(int index, int value){
             if(index<0 || index >length)return false;
             if(index == 0) {
                 prepend(value);
                 return true;
             }
             if(index == length){
                 append(value);
                 return true;
             }
             Node newNode = new Node(value);
             Node temp = get(index-1);
   newNode.next = temp.next;
    temp.next = newNode;
    length++;
             return true;
}
      private Boolean set(int index,int value){
             Node temp = get(index);
             if(temp!=null){
                 temp.value =value;
                 return true;
             }return false;


      }
      private Node get(int index){
           if(index<0 || index >= length)return null;
           Node temp = head;
           for (int i =0; i<index; i++){
               temp = temp.next;
           }return temp ;
      }
      public Node remove(int index){
             if(index < 0 || index >=length) return null;
             if(index == 0) return removeFirst();
             if(index == length-1) return  removeLast();
             Node prev = get(index-1);

              Node temp = prev.next;
              prev.next = temp.next;
              temp.next = null;
              length--;
              return temp;

      }
      public void reverse(){
             Node temp = head;
             head = tail ;
             tail = temp;
             Node after = temp.next;
             Node before = null;
             for (int i = 0; i < length ; i++){
                 after = temp.next;
                 temp.next = before;
                 before= temp;
                 temp = after;

             }



      }

  }


}
