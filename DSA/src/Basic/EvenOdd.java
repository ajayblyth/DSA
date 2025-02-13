package Basic;

import java.util.ArrayList;

public class EvenOdd {
    public static void main(String[] args) {
        int[] arr = { 12,34,56,44,77,89,75};
        evenOdd(arr);

    }
    public static void evenOdd(int[] arr){
ArrayList <Integer> evenNumber = new ArrayList<>();
ArrayList<Integer > oddNumber = new ArrayList<>();

for(int c :arr){
    if(c % 2 == 0){
        evenNumber.add(c);
    }else{
        oddNumber.add(c);
    }

}
        System.out.println("evenNumbers = " + evenNumber);
        System.out.println(" oddNumbers = " + oddNumber);
    }
}
