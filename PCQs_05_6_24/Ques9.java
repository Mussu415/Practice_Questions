package PCQs_05_6_24;
public class Ques9 {
    public static long nCr(int n, int r) {
            // Base cases
            if (r == 0 || n == r) {
                return 1;
            } else if (r < 0 || n < 0) {
                return 0; 
            } else {
             // nCr = nC(n-1, r) + nC(n-1, r-1)
                return nCr(n - 1, r) + nCr(n - 1, r - 1);
            }
        }
        public static void main(String[] args) {
            int n = 5;
            int r = 2;
            long result = nCr(n, r);
            System.out.println("The value of " + n + "C" + r + " is " + result);
        }
    }
    

