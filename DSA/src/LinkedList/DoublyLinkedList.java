package LinkedList;

public class DoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.append(2);
        myDLL.prepend(0);
//        myDLL.removeFirst();
//        myDLL.removeLast();
        System.out.println(myDLL.get(0).value);
        myDLL.set(0, 9);
        myDLL.insert(1, 22);
        myDLL.remove(0);

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
            System.out.print(temp.value + " ");
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
    public Node removeFirst(){

       if( length==0)return null;
       Node temp = head;
       head = head.next;
       temp.next = null;
       head.prev = null;
       length--;
       return temp;
    }
    public Node removeLast(){
       if(length==0)return  null;
       Node temp = tail;
      tail = tail.prev;
      temp.prev = null;
      tail.next = null;
       length -- ;
       return temp;
    }
    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        if (index < length / 2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i++) {
                temp = temp.prev;
            }

        }return temp;


    }
    public boolean set(int index , int value){
       if(index < 0 || index >= length)return false;
        Node temp =get(index);

        if(temp !=null){
           temp.value = value;
return true;
       }

return  false;
    }
    public Node remove(int index){
       if(index < 0 || index >= length) return null;
       if (index == 0) return removeFirst();
       if (index == length-1)return  removeLast();
       Node temp = get(index);
       temp.prev.next = temp.next;
       temp.next.prev = temp.prev;
       temp.next = null;
       temp.prev = null;
       length--;
       return temp;
   } public boolean insert(int index, int value){
       if(index <0 || index >= length)return  false;
       if(index == 0){
           prepend(value);
           return  true;
       }
       if(index == length-1){
           append(value);
           return true;
       }
       Node newNode = new Node(value);
       Node before = get(index -1);
       Node after = before.next;
        newNode.prev = before;
       newNode.next = after;
        before.next = newNode;
       after.prev = newNode;
       length++;
       return true;
    }
}
