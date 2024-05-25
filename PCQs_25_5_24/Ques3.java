package PCQs_25_5_24;

// ques3 
/*Write a Java program to create a class called "Rectangle" with width and height attributes. 
Calculate the area and perimeter of the rectangle. */
class Rectangle{
    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    } 
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public double calculateArea(){
        return width*height;
    }
    public double calculatePerimeter(){
        return 2* (width + height);
    }
}

public class Ques3 {
    public static void main(String[] args){

        Rectangle r1= new Rectangle(2.0,2.0);
        double area= r1.calculateArea();
        double perimeter= r1.calculatePerimeter();

        System.out.println("The perimeter of rectangle is: " + perimeter);
        System.out.println("The area of rectangle is: "+ area);
    }
}
