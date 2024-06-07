package PCQs_06_6_24;

public class Ques3 {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={4,3,8,10,2,1};
        
        //Insertion sort
        for(int i=1; i<arr.length;i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current <arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        printArray(arr);
    } 
}
