package Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] num = {2,5,7,8,9,10,12,14,15,18};
        int element = 5;
        int index = binarySearch(num,element);
        System.out.println("Element "+element+" is at index "+index);
    }

    public static int binarySearch(int[] num, int key) {
        int start = 0, end = num.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(num[mid]==key){ return mid; }
            if(num[mid]<key){  start = mid+1; } //look right
            else{  end = mid-1; } //look left
        }
        return -1;
    }
}
