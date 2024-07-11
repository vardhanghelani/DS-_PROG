
import java.util.Scanner;

public class Operations_linked_list {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    }
    
}
class LinkedList{
    Node first;
    public void insertAtFront(int data){
        Node newnode = new Node(data);
    newnode=first;
   }
   public void insertAtEnd(int data){
    Node newnode = new Node(data);
    Node save = first;
    while(save.link!=null){
        save=save.link;
        }
        save.link=newnode;
    }
public void deleteAtFront(Node link){
    if(first == null){
        System.out.println("List is empty");

    }
    first=first.link;
}
public void deleteAtLast(Node link){
    if(first == null){
        System.out.println("List is empty");

    }
    Node save=first;
    while(save.link.link !=null){
        save=save.link;
}
save.link=null;
}
public void deleteAtPosition(int data){
    if(first == null){
        System.out.println("List is empty");
        }
        else{
            Scanner sc= new Scanner(System.in);
            int key =sc.nextInt();
        }

}
public void display(){

}
}
class Node{
    int data;
    Node link;
    Node(int data){
        this.data=data;
        this.link=null;
    }
}