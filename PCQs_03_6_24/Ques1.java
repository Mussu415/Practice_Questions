package PCQs_03_6_24;
import java.util.Arrays;

//chocolate distribution
public class Ques1 {
    static int chocolate(int[]a, int n, int m){
        Arrays.sort(a);
        int min =Integer.MAX_VALUE;
        for(int i=0; i+m-1<n;i++){
            int diff=a[i+m-1]-a[i];
            if (diff<min)
            min=diff;
        }
        return min;
    }
    public static void main(String[] args) {
        int[]a={3,4,1,9,56,7,12,8,0};
        int n=a.length;
        int m =5;
        System.out.print(chocolate(a, n, m));
    }
    
}