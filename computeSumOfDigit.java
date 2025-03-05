package DSA;

public class computeSumOfDigit {
    public static void main(String[] args) {
    int n = 123;
    int sum1 = computeSum(n);
        System.out.println(sum1);

    }

    public static int computeSum(int n) {
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n/= 10;
        }

        return sum;
    }

}
