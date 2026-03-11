package linearSearchPgms;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 8, 10, 16, 55};
        int target =  10;
        System.out.println(linear(arr, target));
    }
    private static int linear(int[] num, int target){
        if(num.length == 0) return 0;

        for(int i = 0; i < num.length; i++){
            if(num[i] == target){
                return i;
            }
        }
        return 0;
    }
}
