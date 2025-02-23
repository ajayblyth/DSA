package Stack_Queue;

public class Main {
    public static void main(String[] args) {
//        Stack myStack = new Stack(2);
//        myStack.push(3); // add at top
//        myStack.push(4);
//        myStack.push(5);
//        myStack.pop(); // remove from top only
//        myStack.getTop();
//        myStack.getHeight();
//        myStack.printAll();

        Queue myQueue = new Queue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30); // add in last
        myQueue.enqueue(40);
        myQueue.enqueue(50);
        myQueue.enqueue(60);
        myQueue.dequeue();  // same like remove first
        myQueue.getFirst();
        myQueue.getLength();
        myQueue.printAll();


    }
}
