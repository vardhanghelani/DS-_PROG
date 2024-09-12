import java.util.*;
public class BinaryReccursion {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the element to be searched");
        int key=sc.nextInt();
       Reccursion r1= new Reccursion();
       r1.serch(arr,key,0,arr.length-1);
    }
}
class Reccursion{
    public  void serch(int []arr,int target,int left,int right){
        if(left>right){
          System.out.println("Element not found");
          return;
    }
    int mid=(left+right)/2;
    if(arr[mid]==target){
        System.out.println("Element found at index "+mid);
        return; 
    }
    else if(arr[mid]<target){
        serch(arr,target,mid+1,right);
    }
else{
    serch(arr,target,left,mid-1);
}


}}
