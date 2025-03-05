package DSA;

public class ResverseNum {
    public static void main(String[] args) {
        int n = 123;
        int reversed = 0;
        while(n>0){
            int lastdigit = n % 10;
            reversed = reversed * 10 + lastdigit;
            n /= 10;

        }
        System.out.println(reversed);
    }
}
