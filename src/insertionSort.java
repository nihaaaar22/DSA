import java.util.Arrays;

public class insertionSort {
    public static void main(String args[]){
        int[] arr = {4,3,2,676,1,0};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int arr[]){
        for(int i = 0;i<arr.length-1;i++){
            for(int j =i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(j,j-1,arr);
                }
                else{ break;}
            }
        }
    }
    static void swap(int one,int two,int[] arr){
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
}
