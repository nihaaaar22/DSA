package recursion;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1,0,-9,-8,-6};
        sort(arr, 1,arr.length-1,0);

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]);

        }
    }

    static void sort(int[] arr,int innerLoop, int outLoop, int indmax){
        if(outLoop == 0){
            return;
        }
        if(innerLoop == outLoop+1){

            swap(arr,indmax,outLoop);

            sort(arr,1,outLoop-1,0);
        }
        else {
            if(arr[innerLoop] > arr[indmax]){

            indmax = innerLoop;
            }

            sort(arr,innerLoop+1,outLoop,indmax);
        }
    }
    static void swap(int[] arr,int indmax,int lastind){
        int temp = arr[indmax];
        arr[indmax] = arr[lastind];
        arr[lastind] = temp;

    }
}
