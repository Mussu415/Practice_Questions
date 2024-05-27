package PCQs_25_5_24;
//method overriding
class vehicle{
    void sound(){
        System.out.println("This is sound of a vehicle");
    }
}

class bike1 extends vehicle{
    void vehicleSound(){
        super.sound();
    }
    void sound(){
        System.out.println("This is a bike");
    }
}

class car extends vehicle{
    void sound(){
        System.out.println("This is a car");
    }
}

public class Ques9 {
    public static void main(String[] args) {
        bike1 bike11=new bike1();
        car car1=new car();
        bike11.sound();
        bike11.vehicleSound();
        car1.sound();
    }
    
}

