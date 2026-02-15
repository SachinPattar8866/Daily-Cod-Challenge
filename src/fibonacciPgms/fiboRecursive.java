package fibonacciPgms;

public class fiboRecursive {
    public static void main(String[] args) {
        int num = 10;
        int result = fibonacci(10);
        System.out.print(result);
    }
    private static int fibonacci(int num){
        if(num <= 1){
            return num;
        }
        return fibonacci(num-1) + fibonacci(num-2);
    }

}
