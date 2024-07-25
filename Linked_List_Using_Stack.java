
import java.util.*;

public class Linked_List_Using_Stack
 {

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("enter 1 to push");
            System.out.println("enter 2 to pop");
            System.out.println("enter 3 to display");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter a data in link list");
                    int data = sc.nextInt();
                    l1.push(data);
                    break;
                case 2:
                    l1.pop();
                    break;
                case 3:
                    l1.display();
                    break;
            }
        }

    }
}

class LinkedList {

    Node first = null;
    Node top = null;

    public void push(int data) {
        Node newnode = new Node(data);
        if (first == null) {
            first = newnode;
            top = newnode;
        } else {
            Node save = first;
            while (save.link != null) {
                save = save.link;
            }
            save.link = newnode;
            top = newnode;
        }
    }

    public void pop() {

        if (first == null) {
            System.out.println("underflow");
        } else {
            Node save = first;
            if(save.link ==null){
                first=null;
                top=null;

            }
           else{
            while (save.link.link != null) {
                save = save.link;
            }
            save.link = null;
           }
        }
    }

    public void display() {
       
        Node save = first;
        while (save != null) {
            System.out.println(save.info + " ");
            save = save.link;
        }
    }
}

class Node {

    int info;
    Node link;

    Node(int info) {
        this.info = info;
        this.link = null;

    }
}
