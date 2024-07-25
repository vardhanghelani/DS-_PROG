
import java.util.*;

public class Operations_Circular_Linked_List {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    Circular_Linked_List c1 = new Circular_Linked_List();
    while (true) {
        System.out.println("enter 1 to insert at front");
        System.out.println("enter 2 to insert at end");
        System.out.println("enter 3 to insert at position");
        System.out.println("enter 4 to delete at front");
        System.out.println("enter 5 to delete at end");
        System.out.println("enter 6 to delete at position");
        System.out.println("enter 7 to display");
        System.out.println("enter 8 to exit");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("enter the data to be inserted");
                int data = sc.nextInt();
                c1.insertAtFront(data);
                break;
            case 2:
                System.out.println("enter the data to be inserted");
                int data1 = sc.nextInt();
                c1.insertAtEnd(data1);
                break;
            case 3:
                System.out.println("enter the data to be inserted");
                int data2 = sc.nextInt();
                System.out.println("enter the position");
                int pos = sc.nextInt();
                c1.insertAtPosition(data2, pos);
                break;
            case 4:
                c1.deleteAtFront();
                break;
            case 5:
                c1.deleteAtEnd();
                break;
            case 6:
                System.out.println("enter the position");
                int pos1 = sc.nextInt();
                c1.deleteAtPosition(pos1);
                break;
            case 7:
                c1.display();
                break;
            case 8:
                System.exit(0);
        }

    }
}
}

class Circular_Linked_List {

    Node first;
    Node last;

    public void insertAtFront(int data) {
        Node new_node = new Node(data);
        if (first == null) {
            first = new_node;
            last = new_node;
        } else {
            new_node.link = first;
            first = new_node;
            last.link = first;
        }
    }

    public void insertAtEnd(int data) {
        Node new_node = new Node(data);
        if (first == null) {
            first = new_node;
            last = new_node;
        } else {
            last.link = new_node;
            last = new_node;
            last.link = first;
        }
    }

    public void insertAtPosition(int data, int pos) {
        Node new_node = new Node(data);
        Node save = first;
        int count = 1;
        while (count < pos - 1) {
            save = save.link;
            count++;
        }
        new_node.link = save.link;
        save.link = new_node;

    }

    public void deleteAtFront() {
        if (first == null) {
            System.out.println("List is empty");
        } else {
            first = first.link;
            last.link = first;
        }
    }

    public void deleteAtEnd() {
        if (first == null) {
            System.out.println("list is empty");
        } else {
            Node save = first;
            while (save.link != last) {
                save = save.link;
            }
            last = save;
            last.link = first;

        }
    }

    public void deleteAtPosition(int pos) {
        Node save = first;
        Node pred = null;
        int count = 1;
        while (count < pos) {
            pred = save;
            save = save.link;
        }
        pred.link = save.link;
        save.link = null;
    }

    public void display() {
        Node save = first;
        while (save.link != first) {
            System.out.println(save.data + " ");
            save = save.link;
        }
        System.out.println(save.data);
    }
   
}

class Node {

    int data;
    Node link;

    Node(int data) {
        this.data = data;
        this.link = null;
    }
}
