package practice;


public class StackPractice {
    public static void main(String[] args) {
        StackPractice stackPractice = new StackPractice(10);
        stackPractice.push(20);
        stackPractice.push(30);

        stackPractice.push(40);
        stackPractice.pop();
        stackPractice.getTop();
        stackPractice.printAll();
        stackPractice.getHeight();



    }

    private void getHeight() {
        System.out.println("height =" + height);
    }

    private void getTop() {
        if(top!=null){
            System.out.println("top = " + top.value);
        }
        else System.out.println("empty stack");
    }

    private void printAll() {
        Node temp = top;
        while(temp != null){
            System.out.println(temp.value);
            temp =temp.next;
        }
    }

    private Node pop() {
        if(top == null)return null;
        Node temp = top;
        top = top.next;
        temp.next=null;
        height--;
        return temp;



    }

    private void push(int i) {
        Node newNode = new Node(i);
        if (top == null) {
            top = newNode;
        }
        newNode.next = top;

        top = newNode;
        height++;
    }

    private Node top;
    private int height;
    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }

    }
    public  StackPractice(int value){
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

}
