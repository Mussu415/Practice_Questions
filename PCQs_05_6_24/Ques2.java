package PCQs_05_6_24;

public class Ques2 {
       public static int romanToInt(String s) {
            int result = 0;
            int previous = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                char c = s.charAt(i);
                int current = 0;
                
                switch (c) {
                    case 'I':
                        current = 1;
                        break;
                    case 'V':
                        current= 5;
                        break;
                    case 'X':
                        current = 10;
                        break;
                }
                if (current < previous) {
                    result -= current;
                } else { 
                    result += current;
                }
                
                previous = current;
            }
            
            return result;
        }
        
        public static void main(String[] args) {
            String romanNumber = "XXIX";
            System.out.println("Output:- " + romanToInt(romanNumber));
        }
    }

