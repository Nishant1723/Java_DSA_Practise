package DSA;

public class javaPractise2 {
    public static void main(String[] args) {
    for(int num = 1; num<=10; num++) {
        if(isPrime(num) && num % 2 != 0) {
        System.out.println(num);
        }
      }
    }
    public static boolean isPrime(int n) {
        if(n<2) {
            return false;
        }
        for(int i = 2; i<n; i++) {
            if(n % i== 0) {
                return false;
            }
        }
        return true;
    }
}
