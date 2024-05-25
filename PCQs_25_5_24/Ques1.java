package PCQs_25_5_24;

//ques1 
/*Write a Java program to create a class called "Person" with a name and age attribute. 
Create two instances of the "Person" class, set their attributes using the constructor, 
and print their name and age. */


class Person {                         
    private String name;
    private int age;                          // Person class created with 2 instances name and age

    public Person(String name, int age){         // attributes set using constructor
          this.name=name;
          this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){                               //getter and setter methods 
        return age;
    }
}
// Encapsulation 

public class Ques1{
public static void main (String[] args){
    Person p1= new Person("Bhavya", 21);
    Person p2= new Person("Suneha", 24);
    Person p3= new Person("Muskan", 20);

    System.out.println(p1.getName() + " is " + p1.getAge() + " years old.");
    System.out.println(p2.getName()+ " is " + p2.getAge() + " years old");
    System.out.println(p3.getName()+ " is " + p3.getAge() + " years old");
}
}
