package array;

public class highestAltitude {
    public static void main(String args[]){
        int[] arr = {52,-91,72};
        int ans = largestAltitude(arr);
        System.out.println(ans);
    }
    static int largestAltitude(int[] arr) {
        int[] alt = new int[arr.length+1];
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum += arr[i];
            alt[i+1] = sum;


        }
        return largest(alt);

    }
    static int largest(int[] arr){
        int largest = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]>largest){largest = arr[i];}
        }
        return largest;
    }
}
