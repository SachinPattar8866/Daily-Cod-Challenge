package primeNoPgms;

public class printPrimeNos {
    public static void main(String[] args) {
        int priNo = 100;
        System.out.print("Prime Numbers are: " + " ");
        for(int i = 0; i <= priNo; i++){
            if(primeNo(i)){
                System.out.print(i + " ");
            }
        }
    }
    private static boolean primeNo(int num){
        if(num <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num) ; i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
