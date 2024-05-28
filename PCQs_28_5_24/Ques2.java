package PCQs_28_5_24;

//Convert celsius to farenheit
class CelsiusToFarenheit{
    public static double convert(double celsius){
        return(celsius * 9/5)+32;
    }
}

public class Ques2{
    public static void main(String[] args) {
        double celsius=102;
        double farenheit= CelsiusToFarenheit.convert(celsius);
        System.out.println(celsius + " degree Celsius is equal to "+ farenheit);
    }
}