package PCQs_25_5_24;
//Abstraction 

abstract class vehicle{
    abstract void sound();
}

class bike1 extends vehicle{
    public void sound(){
        System.out.println("This is a bike");
    }
}

class car extends vehicle{
    public void sound(){
        System.out.println("This is a car");
    }
}

public class Ques8 {
    public static void main(String[] args) {
        vehicle bike11=new bike1();
        vehicle car1=new car();
        bike11.sound();
        car1.sound();
    }
    
}
