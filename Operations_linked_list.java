
import java.util.Scanner;

public class Operations_linked_list {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList l1 = new LinkedList();
        while (true) {
            System.out.println("enter 1 to insert at front");
            System.out.println("enter 2 to insert at end");
            System.out.println("enter 3 to insert at position");
            System.out.println("enter 4 to delete at front");
            System.out.println("enter 5 to delete at end");
            System.out.println("enter 6 to delete at position");
            System.out.println("enter 7 to display");
            System.out.println("enter 8 to revrese");
            System.out.println("enter 9 to exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter the data to be inserted");
                    int data = sc.nextInt();
                    l1.insertAtFront(data);
                    break;
                case 2:
                    System.out.println("enter the data to be inserted");
                    int data1 = sc.nextInt();
                    l1.insertAtEnd(data1);
                    break;
                case 3:
                    System.out.println("enter the data to be inserted");
                    int data2 = sc.nextInt();
                    System.out.println("enter the position");
                    int pos = sc.nextInt();
                    l1.insertAtPosition(data2, pos);
                    break;
                case 4:
                    l1.deleteAtFront();
                    break;
                case 5:
                    l1.deleteAtLast();
                    break;
                case 6:
                    System.out.println("enter the position");
                    int pos1 = sc.nextInt();
                    l1.deleteAtPosition(pos1);
                    break;
                case 7:
                    l1.display();
                    break;
                case 8:
                    l1.reverse();
                    break;
                    case 9:
                    System.exit(0);
            }

        }
    }
}

class LinkedList {

    Node first;

    public void insertAtFront(int data) {
        Node newnode = new Node(data);
        newnode.link = first;
        first=newnode;
    }

    public void insertAtEnd(int data) {
        Node newnode = new Node(data);
        Node save = first;
        while (save.link != null) {
            save = save.link;
        }
        save.link = newnode;
    }

    public void insertAtPosition(int data, int pos) {
        Node newnode = new Node(data);
        Node save = first;
        int i = 1;
        while (i < pos - 1) {
            save = save.link;
            i++;
        }
        newnode.link = save.link;
        save.link = newnode;
    }

    public void deleteAtFront() {
        if (first == null) {
            System.out.println("List is empty");

        }
        first = first.link;
    }

    public void deleteAtLast() {
        if (first == null) {
            System.out.println("List is empty");

        }
        Node save = first;
        while (save.link.link != null) {
            save = save.link;
        }
        save.link = null;
    }

    public void deleteAtPosition(int data) {
        if (first == null) {
            System.out.println("List is empty");
        } else {
            Scanner sc = new Scanner(System.in);
            int key = sc.nextInt();
        }

    }

    public void display() {
        // System.out.println(first);
        Node save = first;
        while (save != null) {
            System.out.println(save.data);
            save = save.link;
        }
    }
    public void reverse(){
        Node prev =null;
        Node current=first;
        Node next=first.link;
        while(current.link !=null){
            current.link=prev;
            prev=current;
            current=next;
            next=current.link;
        }
        current.link=prev;
        first=current;
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
