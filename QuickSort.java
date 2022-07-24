package GitHub;

public class QuickSort {
    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];            //consider last one as pivot
        int i=low-1;                    //initially for counting smmaer element from pivot
        for(int j=low;j<high;j++){
            if(arr[j]<pivot) {
                i++;
                //now swap to add small element
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        //add pivot to its main location
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;
    }
    public static void quicksort(int[]arr,int low,int high){
        if(low<high){
            int pivx=partition(arr,low,high);
            quicksort(arr,low,pivx-1);
            quicksort(arr,pivx+1,high);
        }
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        for(int val:arr){
            System.out.print(val+" ");
        }
        System.out.println();
        //now my logic begins
        quicksort(arr,0,arr.length-1);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
