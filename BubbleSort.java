import java.util.*;
public class BubbleSort {
public static void main(String[] args) {
int arr[]= {5,10,1,45,-2,30,6};
System.out.println("Original array: "+Arrays.toString(arr));
int last=arr.length-1;
//System.out.println(last);
for(int i=0;i<arr.length-2;i++){
    int exch=0;
    for(int j=0;j<last;j++){
        if (arr[j] > arr[j + 1]) {
            // Swap array[j] and array[j + 1]
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
            exch++;

        }
        
    }
    if(exch==0){
        
        break;
      
    }
    else{
        last--;
    }
}
System.out.println("Sorted array: "+Arrays.toString(arr));


}    
}

