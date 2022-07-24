package GitHub;

import java.util.Scanner;

public class InsertionSortPart2 {
    public static void insertionsort(int[] a){
        for(int i=1;i<a.length;i++){
            int j=i;
            while(j>0 && a[j]<a[j-1]){
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            insertionsort(arr);
            for(int val:arr){
                System.out.print(val+" ");
            }
        }
    }
}
