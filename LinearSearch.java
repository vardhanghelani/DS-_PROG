import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
int arr []={10,20,30,40,50};
Scanner sc =new Scanner(System.in);
int target = sc.nextInt();
int index=-1;
for(int i=0;i<arr.length;i++){
    if(arr[i]==target){
        index=i;
        break;
}
    }
    if(index==-1){
        System.out.println("Element not found");
    }
    else{
        System.out.println("Element found at index "+index);
    }
}
}
