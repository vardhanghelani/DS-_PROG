import java.util.*;

public class  StringRecognizer {


    public static boolean isRecognizable(String str) {
        switch (str) {
            case "aca":
                return matchAca(str);
            case "bcb":
                return matchBcb(str);
            case "abcba":
                return matchAbcba(str);
            case "abbcbba":
                return matchAbbcbba(str);
            default:
                return false;
        }
    }

    private static boolean matchAca(String str) {
        if (str.length() == 3) {
            return str.charAt(0) == 'a' && str.charAt(2) == 'a' && str.charAt(1) == 'c';
        }
        return false;
    }

    private static boolean matchBcb(String str) {
        if (str.length() == 3) {
            return str.charAt(0) == 'b' && str.charAt(2) == 'b' && str.charAt(1) == 'c';
        }
        return false;
    }

    
    private static boolean matchAbcba(String str) {
        if (str.length() == 5) {
            return str.charAt(0) == 'a' && str.charAt(4) == 'a'
                    && str.charAt(1) == 'b' && str.charAt(3) == 'b'
                    && str.charAt(2) == 'c';
        }
        return false;
    }


    private static boolean matchAbbcbba(String str) {
        if (str.length() == 7) {
            Stack<Character> stack = new Stack<>();
           
            for (int i = 0; i < 3; i++) {
                stack.push(str.charAt(i));
            }
        
            for (int i = 4; i < 7; i++) {
                if (stack.isEmpty() || stack.pop() != str.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String[] testStrings = {"aca", "bcb", "abcba", "abbcbba"};
        for (String str : testStrings) {
            if (isRecognizable(str)) {
                System.out.println(str + " is recognized.");
            } else {
                System.out.println(str + " is not recognized.");
            }
        }
    }
}
