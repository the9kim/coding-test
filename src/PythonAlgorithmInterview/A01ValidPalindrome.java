package PythonAlgorithmInterview;

import java.util.regex.Pattern;

public class A01ValidPalindrome {
    public static void main(String[] arg) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome2(s));
    }

    public static boolean isPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        String answer = "";
        String pattern = "[a-zA-Z0-9]";
        for (int i = 0; i < s.length(); i++) {
            String subString = s.substring(i, i + 1);
            if (Pattern.matches(pattern, subString)) {
                answer += subString.toLowerCase();
                stringBuilder.insert(0, subString.toLowerCase());
            }
        }
        if (new String(stringBuilder).equals(answer)) {
            return true;
        }
        return false;
    }

    public static boolean isPalindrome2(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            char eachChar = s.charAt(i);
            if (Character.isLetterOrDigit(eachChar)) {
                String validLowerString = String.valueOf(eachChar).toLowerCase();
                answer += validLowerString;
                stringBuilder.insert(0, validLowerString);
            }
        }
        if (new String(stringBuilder).equals(answer)) {
            return true;
        }
        return false;
    }
}
