package palindromePgms;
//2️⃣ Check palindromePgm.Palindrome
//Question:
//Write a Java program to check whether a given number is a palindrome.
//        Follow-ups:
//What happens if the number ends with 0?
//Can you do it without converting to a string?
//2️⃣ palindromePgm.Palindrome Check
//a) palindromePgm.Palindrome Number   b) palindrome String
//Given:                    Given:
//Number : 121                      String : "madam"
//expected O/P : palindrome         String : "java"
//Number : 123
//expected O/P : not palindrome

//Palindrome is a word, Number, or sequence that reads the same from forward and backward

public class Palindrome {
    public static void main(String[] args) {
        int number = 12321;
        if (checkPalindrome(number)){
            System.out.println("palindromePgm.Palindrome");
        }
        else{
            System.out.println("Not palindromePgm.Palindrome");
        }
    }
    private static boolean checkPalindrome(int num){
       if(num < 0){
           return false;
       }
       int original = num;
       int reversed = 0;

       while(num != 0){
           int digit = num % 10;
           reversed = reversed * 10 + digit;
           num /= 10;
       }
       return original == reversed;
    }
}
