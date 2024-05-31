package PCQs_30_5_24;

//Sort String Characters In Alphabetical Order
public class Ques9 {
    public static void main(String[] args) {
        String str = "bdcba";
        char arr[]= str.toCharArray();
        char temp;
        for (int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(new String(arr));
    }
}



/*
String str1= "rock";
char[] charArray=str1.tocharArray();
Arrays.sort(charArray);
sout(new String(arr));
*/
