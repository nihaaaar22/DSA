package binarySearch;

public class floor {
    // largest number smaller than target
    public static void main(String args[]) {
        int[] arr = {2, 3, 4, 5, 6, 45, 54, 58, 60};
        int target = 7;
        System.out.println(search(arr, target));
    }


    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid+1;
            }
        }
        return end;
    }
}
