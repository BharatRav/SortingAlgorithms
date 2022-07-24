package GitHub;

public class InsersionSort {
    public static void main(String[] args) {
        int arr[]={12,11,13,5,6};
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for(int val:arr){
            System.out.print(val+" ");
        }
        /*
        T(n)=O(n^2)
        S(n)=O(1)
        Geeksforgeeks aproach
         */
    }
}
