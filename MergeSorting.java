
public class MergeSorting {

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 10, 13};
        int low = 0;
        int high = arr.length;

        Sorting s = new Sorting();
        s.mergeSort(arr, low, high-1);
        s.print(arr);
       
    }
}

class Sorting {

    public void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = ((low + high) / 2);
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, high, mid);

        }
        else{
            return;
        }

    }

    public void merge(int[] arr, int low, int high, int mid) {
        int[] b = new int[arr.length];
        int h, i, j, k;
        h = low;
        i = low;
        j = mid + 1;
        while (h <= mid && j <= high) {
            if (arr[h] <= arr[j]) {
                b[i] = arr[h];
                h++;
            } else {
                b[i] = arr[j];
                j++;
            }

            i++;
        }
        if (h > mid) {
            for (k = j; k <= high; k++) {
                b[i] = arr[k];
                i++;

            }
        } else {
            for (k = h; k <= mid; k++) {
                b[i] = arr[k];
                i++;

            }
        }

        for (k = low; k <= high; k++) {
            arr[k] = b[k];
        }

       
    }

    public void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

    }

}
