package assignment_1;

public class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount (String accountNumber, double balance, String accountHolderName, double overdraftLimit){
        super(accountNumber, balance, accountHolderName);
        this.overdraftLimit = overdraftLimit;
    }
    @Override
    public boolean withdraw(double amount){
        if(amount > 0 && amount <= getBalance() + overdraftLimit){
            setBalance(getBalance() - amount);
            System.out.println("Withdrew: " + amount);
            return true;
        }
        else{
            System.out.println("Exceeded overdraft limit or invalid withdrawal amount");
            return false;
        }
    }    
    public void displayoverdraftLimt(){
        System.out.println("Overdraft Limit: "+ overdraftLimit);
    }
}
