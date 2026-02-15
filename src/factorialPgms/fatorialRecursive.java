package factorialPgms;

//Recursive Method
public class fatorialRecursive {
    public static void main(String[] args) {
        int factorialNo = 5;
        int result = fact(factorialNo);
        System.out.println(result);
    }
    private static int fact(int n){
        if(n <= 1){
            return 1;
        }
        return n * fact(n - 1);
    }
}
