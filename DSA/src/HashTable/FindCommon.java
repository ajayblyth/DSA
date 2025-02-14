package HashTable;

import java.util.HashMap;

public class FindCommon {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,0,9,7,9};
        System.out.println(commonElement(arr1, arr2));
    }
    public static boolean commonElement(int[] arr1, int[] arr2){
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int a : arr1){
            map.put(a,true);
        }
        for(int b :arr2){
           if ( map.get(b) != null)return true;
        }
return false;

    }


}
