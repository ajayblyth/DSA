package LinkedList;

public class DLL_2 {
    public static void main(String[] args) {
        DLL_2 myDLL = new DLL_2(10);
        myDLL.append(20);
        myDLL.append(30);

        myDLL.append(40);

        myDLL.append(50);
        myDLL.prepend(5);
//        myDLL.removeFirst();
//        myDLL.removeLast();
//        System.out.println("get = " + myDLL.get(1).value);
myDLL.set(4, 35);
myDLL.insert(2,22);
myDLL.remove(3);
        myDLL.printAll();

    }



    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    DLL_2(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;

    }

    private void printAll() {
        Node temp = head;
        while (temp != null) {
            System.out.println("Doubly linked list = " + temp.value);
            temp = temp.next;
        }

    }

    private void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
            length++;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            length++;

        }

    }

    private void prepend(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
            length++;
        }

        head.prev = newNode;
        newNode.next = head;
        head = newNode;
        length++;

    }

    private Node removeFirst() {
        if (head == null) return null;
        Node temp = head;
        head = temp.next;
        temp.next = null;
        head.prev = null;
        length--;
        return temp;

    }

    private Node removeLast() {
        if (length == 0) return null;
        Node temp = tail;
        tail = tail.prev;
        temp.prev = null;
        tail.next = null;
        length--;
        return temp;
    }
    private Node get(int index){
        if (index <0 || index >= length) return null;
        Node temp = head;
        if(index <length/2){
            for(int i = 0; i< index; i++){
                temp = temp.next;
            }
        }else{
            temp = tail;
            for(int i=length-1; i>index; i--){
                temp = temp.prev;
            }
        }return temp;

    }
    public boolean set(int index,int value){
        if(index <0 || index >=length)return false;
        Node temp = get(index);
        if(temp!=null){
        temp.value = value;
         return true;
        }
        return false;
    }
    private boolean insert(int index, int value){
        if(index <0 || index >=length)return false;
        if(index == 0){
            prepend(value);
            return true;
        }
        if(index == length-1){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node before = get(index-1);
        Node after = before.next;
        newNode.prev= before;
        newNode.next= after;
        before.next = newNode;
        after.prev = newNode;
        length++;
        return true;

    }
    private Node remove(int index){
        if(index < 0 || index >= length) return null;
        if (index == 0) return removeFirst();
        if (index == length-1)return  removeLast();
        Node temp = get(index);
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        temp.next = null;
        temp.prev = null;
        length--;


        if(length == 0){
            head = null;
            tail = null;

        } return temp;
    }


}