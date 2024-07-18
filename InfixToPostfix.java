
import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String exp = "(A+B^C^D)*(E+F/G))";

        System.out.println("Postfix expression is: " + postfix(exp));
    }

    public static String postfix(String exp) {
        Stack<Character> stack = new Stack<Character>();
        String postfix = "";
        stack.push('(');
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                postfix += ch; 
            }else if (ch == '(') {
                stack.push(ch); 
            }else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix += stack.pop();
                }
                stack.pop();

            } else {
                if(ch=='^'){
                    while (!stack.isEmpty() && precedence(ch) < precedence(stack.peek())) {
                        postfix += stack.pop();
                       
                    }
                    stack.push(ch);
                    
                }
              else{
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    postfix += stack.pop();
                   
                }
                stack.push(ch);
              }
            }

        }
        // while (!stack.isEmpty()) {
        //     postfix += stack.pop();
        // }
        return postfix;
    }

    public static int precedence(char ch) {
        if (ch == '^') {
            return 4; 
        }else if (ch == '*' || ch == '/' || ch == '%') {
            return 2; 
        }else if (ch == '+' || ch == '-') {
            return 1; 
        }else {
            return 0;
        }
    }

    public static int Inputprecedence(char ch) {
        if (ch == '^') {
            return 3; 
        }else if (ch == '*' || ch == '/' || ch == '%') {
            return 2; 
        }else if (ch == '+' || ch == '-') {
            return 1; 
        }else {
            return 0;
        }

    }
}
