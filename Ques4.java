// ques4 

/*Write a Java program to create a class called "Circle" with a radius attribute. 
You can access and modify this attribute. 
Calculate the area and circumference of the circle. */

class Circle{
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double calculateArea(){
        return 2.14* radius*radius;
    }
    public double calculateCircumference(){
        return 2* 2.14*radius;
    }
}

public class Ques4 {
    public static void main(String[] args) {
        Circle r=new Circle(2.0);
        double area= r.calculateArea();
        double circumference= r.calculateCircumference();

        // access 
        System.out.println("The radius before modification is: "+r.getRadius());
        System.out.println("The circumference of circle is: " + circumference);
        System.out.println("The area of circle is: "+ area);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        // modification
        r.setRadius(4.0);
        System.out.println("The radius after modification is: "+r.getRadius());
        System.out.println("The circumference of circle is: " + circumference);
        System.out.println("The area of circle is: "+ area);

    }
    
}
