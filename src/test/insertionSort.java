package test;

import java.util.Arrays;

public class insertionSort {
    public static void main(String args[]){
        int[] arr = {5,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        for(int i = 1;i<arr.length;i++){
            for(int j =i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j);
                }
                else {break;}
            }
        }
    }
    static void swap(int[]arr,int j){
        int temp = arr[j];
        arr[j]= arr[j-1];
        arr[j-1] = temp;
    }
}
