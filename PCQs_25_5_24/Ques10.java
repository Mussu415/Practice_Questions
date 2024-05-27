package PCQs_25_5_24;
//multiple inheritance

interface human{
    void walk();
}
interface animal{
    void crawl();
}
class adiManav implements human, animal{
    public void walk(){
        System.out.println("I can walk!!!!");
    }
    public void crawl(){
        System.out.println("I can crawl too!!!");
    }

    public void proof(){
        System.out.println("Hence prooved I am Adimanav");
    }
}
public class Ques10 {
    public static void main(String[] args) {
        adiManav h1=new adiManav();
        h1.walk();
        h1.crawl(); 
        h1.proof();   
    }
}
