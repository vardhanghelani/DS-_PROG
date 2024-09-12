import java.util.*;
public class ShellSOrt {
    public static void main(String[] args) {
        int arr[]= {5,10,1,45,-2,30,6};
        System.out.println("Original array: "+Arrays.toString(arr));
       int n=arr.length;
       for(int gap=n/2;gap>=1;gap=gap/2){
        for(int j=gap;j<n;j++){
            for(int i=j-gap;i>=0;i=i-gap){
                if(arr[i+gap]>arr[i]){
                    break;
                }
                else{
                    int temp=arr[i+gap];
                    arr[i+gap]=arr[i];
                    arr[i]=temp;
                }
            }
        }
       }
       System.out.println("Sorted Array :"+Arrays.toString(arr));
    }
}
