package fibonacciPgms;

//fibonacci is a sequence in which element is a sum of two elements that precede it

public class fiboIterative {
    public static void main(String[] args) {
        int num = 11;
        findFibo(num);
    }
    private static void findFibo(int n){
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
