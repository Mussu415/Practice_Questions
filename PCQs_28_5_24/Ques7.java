package PCQs_28_5_24;

//to check if 2 strings are anagrams or not 
import java.util.Arrays;
public class Ques7 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        if (areAnagrams(str1, str2))
            System.out.println("Strings are anagrams.");
        else
            System.out.println("Strings are not anagrams.");
    }

    public static boolean areAnagrams(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}

