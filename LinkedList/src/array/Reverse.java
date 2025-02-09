package array;

public class Reverse {
    public static void main (String[] args){
        int [] arr = {1,2,3,4,5};
        reverseArray(arr);
    }
    public static void reverseArray(int[] arr){
        int size = arr.length;

        for (int i = 0; i < arr.length/2; i ++){
            int temp = arr[i];
            arr[i] = arr[size -i-1];
            arr [size-i-1] = temp;

        }
        System.out.println(arr);
        for(int c : arr){
            System.out.println(c);
        }


    }
}
