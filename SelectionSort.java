
import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        
        System.out.println("enter size of element");
        for (int i = 0; i < n; i++) {
            System.out.println("enter a [" + i + "]");
            a[i] = sc.nextInt();
        }
        int min_index ;
        for (int i = 0; i < n - 1; i++) {
            min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min_index]) {
                    min_index = j;
                }
            }

            if (min_index != i) {
                int temp = a[min_index];
                a[min_index] = a[i];
                a[i] = temp;
            }
        }
        System.out.println("<===========================>");
        for (int i = 0; i < n; i++) {

            System.out.println(a[i]);

        }
    }
}
