package PCQs_28_5_24;

// to find max and min from an array
public class Ques6 {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 9};
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
            if (array[i] < min)
                min = array[i];
        }
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}
