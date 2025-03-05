package DSA;

import java.util.ArrayList;

public class DisplayVowels {
    public static void main(String[] args) {
    String str = "bbb";
    countVowels(str);
    }

    public static void countVowels(String str) {
        ArrayList<Character> foundvowel = new ArrayList<>();
        String vowels = "aeiouAEIOU";
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(vowels.indexOf(ch) != -1) {
                foundvowel.add(ch);
            }
        }
        System.out.println("vowels found " + foundvowel);
    }
}
