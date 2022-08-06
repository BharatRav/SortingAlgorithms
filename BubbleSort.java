public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={10, 20,-1,-5,7};
        //buble sort
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    arr[j]=arr[j]+arr[j+1];
                    arr[j+1]=arr[j]-arr[j+1];
                    arr[j]=arr[j]-arr[j+1];
                }
            }
        }
        for(int val:arr) System.out.print(val + " ");
    }
}
/*T(n)=O(n^2);
S(n)=O(1);*/
