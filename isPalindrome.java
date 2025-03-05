package DSA;

public class isPalindrome {
    public static void main(String[] args) {
        int num = 12551;
        int reversed = 0;
        int original = num;
        while(num > 0){
            int lastdigit = num % 10;
            reversed = reversed * 10 + lastdigit;
            num/=10;
        }
        if(original == reversed) {
            System.out.println("the num is palindrome");
        } else {
            System.out.println("the num is not palindrome");
        }
    }
}
