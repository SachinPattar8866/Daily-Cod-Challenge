package primeNoPgms;

//A Prime Number is a natural number greater than 1 that has no positive divisors other than 1 and itself.
// In an interview, the goal is to move from a "brute force" solution to an optimized one.

//Brute force approach or Iterative Method
public class checkPrimeNo {
    public static void main(String[] args) {
        int number = 24;
        if(prime(number)){
            System.out.println(number + " is prime number");
        }
        else{
            System.out.println(number + " is not prime number");
        }
    }
    private static boolean prime(int num){
        if(num <= 1){
            return false;
        }
        for (int i = 2; i <= num ; i++) {
            if(num % 2 == 0){
                return false;
            }
        }
        return true;
    }
}
