package array;
import java.util.Arrays;
public class reversingArray {
    public static void main(String args[]){
        int[] arr= {1,2,3,4,5};
        int length = arr.length;
        for(int i =0;i<=arr.length/2;i++){
            int last = length - i -1;
            swap(i,last,arr);
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int i,int last,int[] arr){
        int temp = arr[i];
        arr[i] = arr[last];
        arr[last] = temp;
    }
}
