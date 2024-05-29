package assignment_1;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA123", 1000.0, "Arvind Singh Chauhan", 5.0);
        System.out.println("The account holder name is: "+ savings.getAccountHolderName());
        System.out.println("The account number is: "+ savings.getAccountNumber());
        savings.deposit(500);
        //System.out.println("The interest rate is: "+ getinterestRate());
        savings.addInterest();
        savings.displayBalance();

        System.out.println("-----------------------------------------------------");

        CurrentAccount current = new CurrentAccount("FA123", 10000.0, "Jayvardhan",500);
        System.out.println("The account holder name is: "+ current.getAccountHolderName());
        System.out.println("The account number is: "+ current.getAccountNumber());
        System.out.println("~~~~First withdrawal~~~~");
        current.withdraw(12000);
        current.displayBalance();
        current.displayoverdraftLimt();
        System.out.println("~~~~Second withdrawal~~~~");        
        current.withdraw(2000);
        current.displayBalance();
        current.displayoverdraftLimt();
    }
}
