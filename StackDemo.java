import java.util.*;
 public class  StackDemo{
    public static void main(String[] args) {
        StakeTrace st= new StakeTrace();
st.push();
    }
 }
 class StakeTrace{
    int top=-1;
    int size=0;
    int stack[];
    public void push(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of stack: ");
        size=sc.nextInt();
        stack=new int[size];
        if(top>=size-1){
            System.out.println("Stack is full");
            return;
        }
        else{
            System.out.println("Enter the element: ");
            stack[++top]=sc.nextInt();
        System.out.println("pushed "+stack[top]+"to stack top is now at index" + top);

        }
    }
    public void pop(){
        if(top<0){
            System.out.println("Stack is empty");
            return;
            }
            else{
                top=top-1;
            }




    }
 }