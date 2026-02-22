package reversePgms;

public class reverseString {
    public static void main(String[] args) {
        String word = "Hello World";
//        System.out.println(reverse(word));
        System.out.println(reverseInPlace(word));

    }
    private static String reverse(String str){
        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >=0 ; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    private static String reverseInPlace(String str){
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < words.length; i++){
            result.append(reverse(words[i]));
            if(i < words.length - 1){
                result.append(" ");
            }
        }
        return result.toString();
    }
}
