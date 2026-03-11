package binarySearchPgms;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 8, 10, 13, 18};
        int target = 18;
        System.out.println(binary(arr, target));
    }
    private static int binary(int[] num, int target){
        int start = 0;
        int end = num.length - 1;

        while(start <= end){
            int mid = start + (end - start);

            if(num[mid] == target) return mid;

            else if(target < num[mid]){
                end = mid - 1;
            }
            else{
                start = start + 1;
            }
        }
        return -1;
    }
}
