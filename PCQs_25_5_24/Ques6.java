package PCQs_25_5_24;

//ques6
/*Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, 
and methods to calculate and update salary. */

class Employee{
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary){
        this.name=name;
        this.jobTitle=jobTitle;
        this.salary=salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getJobTitle(){
        return jobTitle;
    }
    public void setJobTitle(String jobTitle){
        this.jobTitle=jobTitle;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public void updateSalary(double percentage){
        salary=salary+salary * percentage/100;
    }
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
      }
}
public class Ques6 {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Pooja Maheswary", "HR Manager", 40000);
        Employee employee2 = new Employee("Arvind Singh Chauhan", "Software Engineer", 60000);
        System.out.println("Employee Details:");
        System.out.println("Employee 1:");
        employee1.printDetails();
        System.out.println("\nEmployee 2:");
        employee2.printDetails();
    
        employee1.updateSalary(8);
        employee2.updateSalary(12);
    
        System.out.println("\nAfter updating salary:");
        System.out.println("8% for Pooja Maheswary:");
        employee1.printDetails();
        System.out.println("\n12% for Arvind Singh Chauhan:");
        employee2.printDetails();
      }
}
