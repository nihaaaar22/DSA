import java.util.Arrays;
public class cycleSort {
     public static void main(String args[]){
         int arr[]= {5,4,3,2,1};
         cycleSort(arr);
         System.out.println(Arrays.toString(arr));
     }
    static void cycleSort(int arr[]){
         int i = 0;
        while(i<arr.length){

            if(arr[i]!= i+1) {
                swap(arr, i);
            }
            else{i++;}
        }
    }


    static void swap(int arr[],int i){
       int temp = arr[arr[i]-1];
       arr[arr[i]-1]= arr[i];
       arr[i]= temp;
    }
}
