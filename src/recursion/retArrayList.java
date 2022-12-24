package recursion;

import java.util.ArrayList;

public class retArrayList {
    static ArrayList list = new ArrayList<>();
    public static void main(String[] args) {
        int arr[] = {1,2,16,18,19,19,20};
        search(19,arr,0);


        System.out.println(list);

    }
    static ArrayList search(int target, int arr[], ArrayList list,int index){
        if(index == arr.length){return list;}
            if(arr[index]==target){
                list.add(index);}
            return search(target,arr,list,index +1);



    }
    static void search(int target,int arr[],int index){
        if(index == arr.length){return;}
        if(arr[index]==target){
            list.add(index);}
        search(target,arr,index +1);
    }
}
