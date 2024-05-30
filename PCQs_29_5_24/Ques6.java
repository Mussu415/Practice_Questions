public class Ques6 {
    public static void main(String[] args) {
        int i;
        int j;
        int n = 5;
        for(i=1;i<=n;i++)
        {
            System.out.print(" ");
            for(j=1;j<=((2*n)-1);j++)
            {
                if(j<n+i && j>n-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                };
            }
            System.out.println();
        }
   }
}
    