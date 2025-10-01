package Arrays.Sorting;

public class QuickSort {
    static int partition(int[] arr,int low,int high){
        int pivot=arr[low];
        int i=low;
        int j=high;

        while(i<j){
            //until higher el is not found
            while(arr[i]<=pivot&&i<=high-1){
                i++;
            }
            //until smaller el is not found
            while(arr[j]>pivot&& j>=low+1){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        //pivot at position
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;

        return j;
    }
    static void quickSort(int[] arr,int low,int high){
        //element>1
        if(low<high){
            int pIndex=partition(arr,low,high);
            quickSort(arr,low,pIndex-1);
            quickSort(arr,pIndex+1,high);
        }
    }
    public static void main(String[] args) {
        int[] arr={4,6,2,5,7,9,1,3};
        int n=arr.length;
        System.out.println("before: ");
        for(int num: arr){
            System.out.println(num+" ");
        }
        System.out.println();
        quickSort(arr,0,n-1);
        System.out.println("after: ");
        for(int num: arr){
            System.out.println(num+" ");
        }

    }
}
