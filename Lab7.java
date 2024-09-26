import java.util.*;

public class Lab7 {
    public boolean recognize(String str) {
        Stack<Character> s = new Stack<Character>();
        int index = 0;
        s.push('c');
        char next = str.charAt(index);
        while (index < str.length()) {
            if (next == ' ') {
                return false;
            } else {
                s.push(next);
                index++;
                next = str.charAt(index);
            }
        }
        index++;
        while (!s.isEmpty() && index < str.length()) {
            next = str.charAt(index);
            if (next != s.pop()) {
                return false;
            }
            index++;
        }
        if (next == ' ') {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Lab7 lab = new Lab7();
        if (lab.recognize(str)) {
            System.out.println("String is valid");
        } else {
            System.out.print("String is Invalid");
        }
    }
}