package Stack_Queue;

public class Queue {
    private Node first;
    private Node last;
    private int length;
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }

    }
    public Queue(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;

    }
    public void enqueue(int value){
        Node newNode = new Node(value);
        if(length == 0){
            first = newNode;
            last = newNode;
            length++;
        }else{
            last.next = newNode;
            last = newNode;
        }length++;

    }
    public Node dequeue(){
        if(length == 0) return null;
        Node temp = first;
        if (length == 1){
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

    public void printAll(){
        Node temp = first;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }

//

    }
    public void getFirst(){
        if (first != null){
            System.out.println("queue first : " + first.value);
        }else{
            System.out.println(" queue is empty");
        }
    }
    public void getLength(){
        System.out.println(" queue length = " + length);
    }

}
