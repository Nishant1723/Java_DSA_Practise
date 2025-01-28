package DSA;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {
//        StringBuilder builder = new StringBuilder();
//        for(int i=0; i<26; i++) {
//            char ch = (char)('a' + i);
//            builder.append(ch);
//        }
//        System.out.println(builder.toString());

//        String name = " Nishant Ghorpade ";
//        System.out.println(Arrays.toString(name.toCharArray()));
//        System.out.println(name.charAt(2));
//        System.out.println(name.toLowerCase());
//        System.out.println(name.indexOf('a'));
//        System.out.println(name.strip());

//        EX - CHECKING STRING IS PALINDROME OR NOT

        String str = "";
        System.out.println(isPalindrome(str));



    }

    //        EX - CHECKING STRING IS PALINDROME OR NOT

    static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        str = str.toLowerCase();
        for(int i=0; i<=str.length()/2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);

            if(start != end) {
                return false;
            }

        }
        return true;

    }
}
