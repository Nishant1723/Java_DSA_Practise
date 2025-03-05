package DSA;

public class AmstrongNum {
    public static void main(String[] args) {
        int num = 153;
        int orignalnum = num;
        int digit = String.valueOf(num).length();
        int sum = 0;
        while(num > 0) {
            int lastDigit = num % 10;
            sum +=Math.pow(lastDigit,digit);
            num/=10;
        }
        if(sum == orignalnum) {
            System.out.println("Is amstrong num");
        } else {
            System.out.println("not an amstrong num");
        }
    }
}
