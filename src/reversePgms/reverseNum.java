package reversePgms;

//1️⃣ Reverse a Number
//Question:
//Write a Java program to reverse a given integer without using built-in reverse functions.
//        Follow-up questions interviewers may ask:
//What if the number is negative?
//What is the time complexity?
//Can you solve it without converting to a string?

public class reverseNum {
    public static void main(String[] args) {
        int numbers = -123456;
        System.out.println("Reversed Number : " + reversenumber(numbers));
    }
    private static int reversenumber(int num){
        int reversed =  0;
        while(num != 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}