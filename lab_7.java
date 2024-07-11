import java.util.*;
public class lab_7 {
    public boolean Recognize(string){
        Stack<Character> s= new Stack<Character>;
        int index=0;
        s.push('c');
        char next = str.charAt(index);
    while (next != 'c') {
        if (next == ' ') {
            return false;
    }else{
        s.push(next);
        index ++;
        next = str.charAt(index);
    }
    }
    index ++;
    while(s.peek()!='c' && str.length()<index){
        next =str.charAt(index);
        if(next != s.pop()){
            return false;
        }
        index ++;
    }
    if(next=' '){
        return true;

    }
    else{
        return false;
    }

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    String str= sc.next();
    if (Recognize(str)){
        System.out.println("String is valid ");
    }
    else{
        System.out.print("String is Invalid");
    }
}
}
