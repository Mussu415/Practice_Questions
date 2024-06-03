package PCQs_03_6_24;

// valid parentheses
public class Ques4 {
    public boolean isValid(String s){
        if(s==null || s.length()==0){
            return true;
        }
        int parenthesesCount=0;
        int squareBracketsCount=0;
        int curlyBracesCount=0;
        for(char c: s.toCharArray()){
            if (c=='(') {
                parenthesesCount++;
            }
            else if (c=='[') {
                squareBracketsCount++;
            }
            else if (c=='{') {
                curlyBracesCount++;
            }
            else if (c==')') {
                if (parenthesesCount == 0) return false;
                parenthesesCount--;
            }
            else if (c==']') {
                if (squareBracketsCount == 0) return false;
                squareBracketsCount--;
            }
            else if (c=='}') {
                if (curlyBracesCount == 0) return false;
                curlyBracesCount--;
            }
            //if (parenthesesCount<0 || squareBracketsCount<0 || curlyBracesCount<0) {
                return false;
            }
    
        return parenthesesCount==0 && squareBracketsCount==0 && curlyBracesCount==0;
    }
    public static void main(String[] args) {
        Ques4 solution=new Ques4();
        System.out.println(solution.isValid("()"));
        System.out.println(solution.isValid("()[]{}"));
        System.out.println(solution.isValid("({[}])"));
    }
}

