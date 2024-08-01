
import java.util.*;

public class QueOperations {

    public static void main(String[] args) {
        Que q1 = new Que();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.Insert");
            System.out.println("2.Delete");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element");
                    int ele = sc.nextInt();
                    q1.enqueue(ele);
                    break;
                case 2:
                    q1.deque();
                    break;
                case 3:
                    q1.display();
                    break;
                case 4:
                    System.exit(0);
                    break;

            }

        }
    }

}

class Que {

    int[] que = new int[5];
    int front = -1, rear = -1;

    public void enqueue(int data) {
       if (rear >=4) {
        System.out.println("overflow");
       }
    
    rear++;        
    
       que[rear]=data;
       if(front==-1){
        front=0;
       }
    }

    public void deque() {
        if (front == -1) {
            System.out.println("Queue is empty");

        } else {
            int ans = que[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {

                front++;
            }
        }
    }

    public void display() {
        System.out.println("------------");
        for (int i = front; i <= rear; i++) {
            
            System.out.println(que[i]);
        }
    }

}
