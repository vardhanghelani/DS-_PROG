

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 10, 13};
        int lb = 0;
        int ub = arr.length;
    }
}
class Sort{
    public void quickSorting(int []arr,int lb,int ub){
int i=lb;
int j=ub+1;
int key=lb;
Boolean flag=true;
while(flag==true){
    i++;
    while(arr[i]<key){
        i++;
    }
    j++;
    while(arr[j]>key){
        j++;
    }
    if(i>j){
        int temp=0;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    else{
        flag=false;
    }
}

    }
}
