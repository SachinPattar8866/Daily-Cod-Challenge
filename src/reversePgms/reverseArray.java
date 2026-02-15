package reversePgms;
//Two Pointer Technique
//reversing an array is slightly different because we aren't dealing with math instead we are dealing with indices and swapping


import java.util.Arrays;
public class reverseArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, -5, 6};
        reverse(nums);
        System.out.println(Arrays.toString(nums));
    }
    private static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
