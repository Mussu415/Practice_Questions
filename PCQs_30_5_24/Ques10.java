package PCQs_30_5_24;

//program to remove white spaces
public class Ques10 {
    public static void main(String[] args) {
        String str="Arvind     Si    n  g h    C  ha  uhan";
        System.out.println("String with whitespaces is: "+str);
        String str1=str.replaceAll("\\s", "");
        System.out.println("String after removing white spaces is: "+str1);
    }
}
