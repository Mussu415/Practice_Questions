package PCQs_03_6_24;

public class Ques2 {
        public static void main(String[] args) {
            int[] array = {1, 2, 4, 4, 5, 6, 3, 2};
            boolean duplicateFound=false;
    
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        System.out.println("Duplicate found: " + array[i]);
                        duplicateFound=true;
                        break;
                    }
                }
                // if (duplicateFound){
                //     break;
        }
        if(!duplicateFound){
            System.out.println("No duplicates found");
        }
    }
}


