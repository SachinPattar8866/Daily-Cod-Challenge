package palindromePgms;//check case-sensitive in string palindrome
//String : "Madam"
//.toLowerCase(): To make the comparison case-insensitive.
//.isLetterOrDigit(): To skip over characters that aren't part of the palindrome.
//"A man, a plan, a canal: Panama"


public class Palindrome3 {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal Panama";
        if (checkPalindrome(str)){
            System.out.println("palindromePgm.Palindrome");
        }
        else{
            System.out.println("Not palindromePgm.Palindrome");
        }

    }
    private static boolean checkPalindrome(String str){
        int start = 0;
        int end = str.length() - 1;

        while (start < end){
            char startChar = str.charAt(start);
            char endChar = str.charAt(end);

            if(!Character.isLetterOrDigit(startChar)){
                start++;
            }
            else if(!Character.isLetterOrDigit(endChar)){
                end--;
            }
            else{
                if(Character.toLowerCase(startChar) != Character.toLowerCase(endChar)){
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}
