package PCQs_06_6_24;

public class Ques5 {

    //Quick sort 
    public static int partition(int[]arr, int low, int high){
        int pivot =arr[high];
        int i = low-1;

        for(int j =low; j<high; j++){
            if(arr[j]<pivot){
                i++;
                //swap
                int temp= arr[i];
                arr[j]= arr[i];
                arr[j]= temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high]= temp;
        return i;
    }
    public static void quickSort(int arr[], int low, int high){
        if(low<high){
           int pidx = partition(arr, low, high);
           
           quickSort(arr, low, pidx-1);
           quickSort(arr, pidx+1, high);
        }
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        int n= arr.length;

        quickSort(arr, 0, n-1);

        for (int i =0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
