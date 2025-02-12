package BinarySearchTree;

public class BinarySearchTree {
    Node root;

    class Node{
        int value;
        Node right;
        Node left;

        private Node (int value){
            this.value = value;
        }


    }
    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null){
            root = newNode;
            return true;
        }
        Node temp = root;
        while(true){
            if (newNode.value == temp.value) return false;
            if(newNode.value < temp.value){
                if(temp.left == null){
                    temp.left = newNode;
                    return  true;
                }temp = temp.left;

            }else{
                if(temp.right == null){
                    temp.right = newNode;
                    return  true;
                }temp = temp.right;
            }
        }





    }
    public boolean contains(int value) {

        Node temp = root;

        while (temp != null) {
            if (value == temp.value) return true;
            if (value > temp.value) {
                temp = temp.right;

            } else if (value < temp.value) {
                temp = temp.left;
            } else {
                return true;
            }

        }
        return false;
    }}
