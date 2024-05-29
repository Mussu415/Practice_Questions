package assignment_1;

public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, String accountHolderName, double interestRate){
        super(accountNumber, balance, accountHolderName);
        this.interestRate = interestRate;
    }
    public double getinterestRate(){
        return interestRate;
    }

    public void addInterest() {
        double interest = getBalance() * (interestRate / 100);
        setBalance(getBalance() + interest);
        System.out.println("Interest added: "+ interest);
    }
}
