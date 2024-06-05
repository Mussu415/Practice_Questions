package PCQs_04_6_24;

public class Ques6 {
     public static void main(String[] args) {
        String[] a={"Jack", "Suneha", "Tejal", "Muskan", "Kunal", "Bhavya", "Harshita"};
        for(int i=0; i<a.length-1; i++){
            for(int j =i; j<a.length; j++){
                if(a[i].compareTo(a[j])>1){
                    String temp;
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (String i:a){
            System.out.println(i);
        }
    }
}
