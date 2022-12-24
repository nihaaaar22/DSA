package BubbleSort;

import java.util.Arrays;

public class first {
    public static void main(String args[]) {
     int[] arr = {1,2,3,5,4};
     bubble(arr);
     System.out.println(Arrays.toString(arr));

    }

    static void bubble(int arr[]) {
        boolean swap;
       for(int i =0;i<arr.length;i++){
           swap = false;
           for(int j = 1;j<arr.length-i;j++){
               if(arr[j]<arr[j-1]){
                   int temp = arr[j-1];
                   arr[j-1] = arr[j];
                   arr[j]= temp;
                   swap = true;

               }
           }if(!swap){break;}
       }
    }
}
