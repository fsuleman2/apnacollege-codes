package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] num = {2,5,7,8,9,10,12,14,15,18};
        int key = 12;
        int index = linearSearch(num,key);
        if(key==-1){
            System.out.println("NOT FOUND!!!");
        }else{
            System.out.println("Key is found at index "+ index);
        }
    }

    public static int linearSearch(int[] num,int key) {
        for(int i=0;i<=num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }
}
