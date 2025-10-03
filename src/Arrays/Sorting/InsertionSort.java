package Arrays.Sorting;

public class InsertionSort {
    static void insertion_sort(int[] arr,int n){
        for(int i=0;i<n;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
//        tried using only one variable
//        for(int i=0;i<n;i++){
//            while(i>0 && arr[i-1]>arr[i]){
//                int temp=arr[i-1];
//                arr[i-1]=arr[i];
//                arr[i]=temp;
//                i--;
//            }
//        }
        System.out.println("after sort: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={13,46,24,52,20,9};
        int n=arr.length;
        System.out.println("before: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        insertion_sort(arr,n);
    }

}
