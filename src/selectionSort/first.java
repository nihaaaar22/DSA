package selectionSort;
import java.util.Arrays;

public class first {
    public static void main(String args[]){
        int[] arr = {25,3,2,4,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for(int i = 0;i<arr.length;i++){
            //boolean swap
            int last = arr.length-1-i;
            int max = max(last,arr);
            if(max!=last){
           swap(max,last,arr);} 
        }

    }
    static int max(int last,int [] arr){
        int max = last;
        for(int i = 0;i<last;i++){
            if(arr[i]>arr[max]){max = i;}
        }return max;
    }
    static void swap(int one,int two,int[] arr){
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
}
