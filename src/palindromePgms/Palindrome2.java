package palindromePgms;//Given: check palindrome for strings
//String : "madam"
//String : "java"



public class Palindrome2 {
    public static void main(String[] args) {
        String str = "madam";
        if (checkPalindrome2(str)){
            System.out.println("palindromePgm.Palindrome");
        }
        else{
            System.out.println("Not palindromePgm.Palindrome");
        }
    }

    private static boolean checkPalindrome2(String str){
        int start = 0;
        int end = str.length() - 1;

        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
