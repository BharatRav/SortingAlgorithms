package GitHub;

public class MergeSort {
    public static void merge(int[] arr,int l,int mid,int r){
        int n1=mid+1-l;
        int n2=r-mid;
        int a1[]=new int[n1];
        int a2[]=new int[n2];

        for(int i=0;i<n1;i++){
            a1[i]=arr[l+i];
        }
        for(int j=0;j<n2;j++){
            a2[j]=arr[mid+j+1];
        }
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(a1[i]<a2[j]){
                arr[k]=a1[i];
                i++;
            }else{
                arr[k]=a2[j];
                j++;
            }
            k++;
        }
        //after while loop i have to add all elements directly which had left
        while(i<n1){
            arr[k]=a1[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=a2[j];
            j++;
            k++;
        }
        //now end loop
    }
    public static void mergeSort(int[] arr,int l,int r){
        if(l<r){
            int mid=(l+r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }
    public static void main(String[] args) {
        int arr[]={25,-7,4,18,10};
        int n=arr.length;
        for(int val:arr){
            System.out.print(val+" ");
        }
        System.out.println();
        mergeSort(arr,0,n-1);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
