package practice;

public class QueuePractice {

    public static void main(String[] args) {
        QueuePractice myQueue = new QueuePractice(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);
        myQueue.enqueue(40);
        myQueue.enqueue(50);
        myQueue.dequeue();
        myQueue.getFirst();
        myQueue.getLength();
        myQueue.printAll();


    }

    private void getLength() {
        System.out.println("length = " + length);
    }

    private void getFirst() {
        if(first !=null){
            System.out.println(" first " + first.value);
        }else{
            System.out.println(" empty queue");
        }
    }

    private Node first, last;
    private int length;
class Node{
    int value;
    Node next;

     Node (int value){
        this.value = value;
    }
}
QueuePractice(int value){
    Node newNode = new Node(value);
    first=newNode;
   last =newNode;
   length = 1;
}
public void printAll(){
    Node temp = first;
    while(temp != null){
        System.out.println("temp = " + temp.value);
        temp=temp.next;
    }
}
public void enqueue(int value){
    Node newNode = new Node(value);
    if (first == null){
        first = newNode;
        last = newNode;
        length++;

    }
    else{
        last.next = newNode;
        last = newNode;
        length++;
    }

}    public Node dequeue(){
    if(length == 0)return  null;
    Node temp = first;
    if(length ==1){
        first = null;
        last = null;
        length--;
        return  temp;
    }else{
        first = first.next;
        temp.next = null;
        length--;
        return temp;
    }


    }


}
