package PCQs_25_5_24;

//ques 2 
/*Write a Java program to create a class called "Dog" with a name and breed attribute. 
Create two instances of the "Dog" class, set their attributes using the constructor and 
modify the attributes using the setter methods and print the updated values. */

class dog {
    private String name;
    private String breed;

    // constructor 
   public dog (String name, String breed){
    this.name=name;
    this.breed=breed;
   }

   // setter method 
   public void setName(String name){
         this.name=name;
   }
   public void setBreed(String breed){
    this.breed=breed;
   }

   // getter method 
   public String getName(){
    return name;
   }
   public String getBreed(){
    return breed;
   }
}

public class Ques2{
    public static void main (String []args){
      dog d1 = new dog("Lucie", "Labrador");
      dog d2= new dog("Leo", "German shephard");

      System.out.println("Before using set name Dog1 name: "+ d1.getName() + " and breed: "+ d1.getBreed());
      System.out.println("Before using set name Dog2 name: "+ d2.getName() + " and breed: "+ d2.getBreed());

      // modification
      d1.setName("Tiger");
      d1.setBreed("Pomerian");
      d2.setName("Charlie");
      d2.setBreed("Golden Retriver");

      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      System.out.println("After using set name Dog1 name: "+ d1.getName() + " and breed: "+ d1.getBreed());
      System.out.println("After using set name Dog2 name: "+ d2.getName() + " and breed: "+ d2.getBreed());
    }
}
