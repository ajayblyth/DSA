package Basic;

public class LargestSmallest {
    public static void main(String[] args) {
        int [] arr = { 23,45,65,43,95,975,26};
        findLargestSmallest(arr);
    }
    public static void findLargestSmallest(int[] arr){
         int largest = arr[0];
         int smallest = arr[0];
         for (int c : arr)
         {
             if (c > largest){
                 largest = c;
             }
             if (c < smallest){
                 smallest = c;
             }

             }        System.out.println(smallest + " " + largest);


    }



    }

