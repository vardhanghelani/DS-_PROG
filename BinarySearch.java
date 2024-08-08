import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
    int arr[]={10,20,30,40,50};
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the element to be searched");
    int target =sc.nextInt();
    int flag=-1;
    int left=0,right=arr.length-1;
    int middle = 0;
    while(left<=right){
         middle=(left+right)/2;
if(arr[middle]==target){
    flag=1;
    break;
}
else if(arr[middle]>target){
    right=middle-1;
}
else{
    left=middle+1;
}
    }
    if(flag==1){
        System.out.println("Element found at index "+middle);
    }
    else{
        System.out.println("Element not found");
    }
}
}
