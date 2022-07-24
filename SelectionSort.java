package GitHub;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={-5,10,20,25,1};
        for(int i=0;i<arr.length-1;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
        for(int val:arr) {
            System.out.print(val+" ");
        }

    }
}
