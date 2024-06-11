package PCQs_10_6_24;

//longest substring length
public class Ques2 {
    public static int substringLength(String str){
        int mLength=0;
        int n = str.length();

        for (int i =0; i<n; i++){
            for(int j=i+1; j<=n; j++){
                if(isUnique(str, i, j)){
                    int currentLength = j-i;
                    if (currentLength > mLength){
                        mLength = currentLength;
                    }
                    //mLength = Math.max(mLength, j-i);
                }
            }
        }
        return mLength;
    }

    private static boolean isUnique(String str, int start, int end){
        boolean[] visited = new boolean[128];

        for(int i =start; i<end; i++){
            char ch = str.charAt(i);
            if (visited[ch]) {
                return false;
            }
            visited[ch] = true;
        }
        
        return true;
    }

    public static void main(String[] args) {
        String str = "rabrcwbba";
        System.out.println("Substring length: "+ substringLength(str));
    }
}
