package recursion;

public class Bubblesort {
    public static void main(String[] args) {
        int arr[] = {5,4,2,3,1,0};
        sort(arr, arr.length -1, 0);

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]);

        }

    }
    static void sort(int[] arr,int outerLoop,int innerLoop){
        if(outerLoop == 0) {
            return;
        }
        if(outerLoop == innerLoop){

            sort(arr,outerLoop -1,0);
            return;

        }

        else if (arr[innerLoop] > arr[innerLoop + 1]) {

                swap(arr,innerLoop);

            }
        sort(arr, outerLoop, innerLoop + 1);




    }
    static void swap(int[] arr,int index){
        int temp = arr[index];
        arr[index] = arr[index+1];
        arr[index+1]= temp;
    }
}
