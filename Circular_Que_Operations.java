
import java.util.Scanner;

public class Circular_Que_Operations {

    public static void main(String[] args) {
        Circular_Que q1 = new Circular_Que();
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
                    q1.enque(ele);
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

class Circular_Que {

    int[] que = new int[5];
    int f = -1;
    int r = -1;

    public void enque(int data) {
        if (r == 5-1) {
            if (f == 0) {
                System.out.println("Circular Queue is full");
                return;
            }
            r = 0;
        } else {
            r++;
        }
        
        que[r] = data;
        if (f == -1) {
            f++;
        }

    }

    public void deque() {
        if (f == -1) {
            System.out.println("Circular Queue is empty");
        }
        int y = que[f];
        if (f == r) {
            f = r = -1;
        }
        else if (f == 5-1) {
            f = 0;
        }
        else{
            f++;
        }
    }

    public void display() {
        System.out.println("-------------------------");
        if (f == -1) {
            System.out.println("Circular Queue is empty");
        } else {
            if (r < f) {
                for (int i = f; i < 5; i++) {
                    System.out.println(que[i]);
                }
                for (int i = 0; i <= r; i++) {
                    System.out.println(que[i]);
                }
            }
            for (int i = f; i <= r; i++) {
                System.out.println(que[i]);
            }
        }

    }
}
