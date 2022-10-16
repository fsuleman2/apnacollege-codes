package Arrays;

public class ZigZagFashion {
    public static void main(String[] args) {
        int arr[] = {4,3,7,8,6,2,1};
        zigZagFashion(arr);
    }

    public static void zigZagFashion(int[] arr) {
        int n = arr.length;
        // int temp=0;
        for(int i=0;i<n-1;i++){
            if(i%2==0){
                if(arr[i]>arr[i+1]){
                   int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
               
            }else{
                if(arr[i]<arr[i+1]){
               int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}//3748261
