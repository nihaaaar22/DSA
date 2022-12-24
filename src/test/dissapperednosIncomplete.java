package test;

import java.util.ArrayList;

public class dissapperednosIncomplete {
    public static void main(String args[]){
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr) );
    }
        static ArrayList<Integer> findDisappearedNumbers(int[] arr) {
            ArrayList<Integer> list = new ArrayList< >();

            int i =0;
            //int correctIndex = arr[i]-1;
            while(i< arr.length ){
                if(arr[i]!=i+1 && arr[i]<=arr.length-1){
                    swap(arr,i);
                }
                else {i++;}
            }
            for(int j =0;j<arr.length;j++){
                if(arr[j]!=j+1){list.add(j+1);}
            }
            return list;

        }
        static void swap(int arr[],int i){
            int temp = arr[arr[i]-1];
            arr[arr[i]-1]= arr[i];
            arr[i]= temp;
        }
    }


