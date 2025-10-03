package Arrays.Sorting;

import java.util.Scanner;
public class SelectionSort {
    public static void selection_sort(int[] arr,int n) {
        for(int i=0;i<n-1;i++){
            int mini=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[mini]){
                    mini =j;
                }
            }
            int temp=arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;
        }
        System.out.println("after selection sort: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={12,34,24,52,20,8};
        int n=arr.length;
        System.out.println("before sort: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        selection_sort(arr,n);


    }


}
