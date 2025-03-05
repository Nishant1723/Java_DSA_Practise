package DSA;

public class ExtractNumString {
    public static void main(String[] args) {
    String str = "heloo34t4nfdfn84y459";
        System.out.println(ExtractNum(str));
    }

    public static String ExtractNum(String str) {
        StringBuilder number = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            if(Character.isDigit(str.charAt(i))) {
                number.append(str.charAt(i));
            }
        }
        return number.toString();
    }
}
