public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={50,40,20,60,10,30};
        int last=arr.length-1;
        int exch=0;
        for (int idx = 0; idx < arr.length; idx++) {
        for(int j=0;j<last;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                exch++;
            }
         
        }
        if(exch==0){
            System.out.println("array is sorted already");
            break;
        }
        else{
            last--;
        }
            
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
