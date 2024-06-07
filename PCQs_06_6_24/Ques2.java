package PCQs_06_6_24;

//selection sort 
public class Ques2 {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={6,2,8,9,1};

        //selection sort
        for(int i =0;i<arr.length-1; i++){
            int small=i;
            for(int j=i+1;j<arr.length; j++){
                if(arr[small]>arr[j]){
                    small=j;
                }
            }
            int temp= arr[small];
            arr[small]= arr[i];
            arr[i]=temp;
        }
        printArray(arr);
    }
}
