package factorialPgms;
// Factorial defines as the product of all positive integers from that number down to 1 it is denoted by the symbol
// 5!(exclamation mark)

//Maximum value of factorial can handle in Int is 12

//Iterative method
public class findFactorial {
    public static void main(String[] args) {
        int Fact = 4;
        int result = factorial(Fact);
        System.out.println(result);
    }
    private static int factorial(int num){
        if(num <= 1){
            return 1;
        }
        int res = 1;
        for (int i = 1; i <= num ; i++) {
            res = res * i;
        }
        return res;
    }
}
