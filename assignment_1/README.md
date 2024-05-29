## Documentation 

<b>BankAccount Class</b>
<br>
<u>Attributes:</u>
accountNumber: Unique identifier for the account.
balance: Current balance in the account.
accountHolderName: Name of the account holder.
<br>
<u>Methods:</u>
deposit(double amount): Method to deposit funds into the account.
withdraw(double amount): Method to withdraw funds from the account. Ensures the balance does not go negative.
displayBalance(): Method to display the current balance of the account.
<br>
<hr>
<b>SavingsAccount Class </b>
<br>
Inherits from BankAccount and adds the following:
<br>
<u>Attribute:</u>
interestRate: Interest rate for the savings account.
<br>
<u>Method:</u>
addInterest(): Method to calculate and add interest to the account balance.
<br>
<hr>
<b>CurrentAccount Class</b>
<br>
Inherits from BankAccount and adds the following:
<br>
<u>Attribute:</u>
overdraftLimit: Overdraft limit for the current account.
<br>
<u>Method:</u>
withdraw(double amount): Overrides the method from BankAccount to allow withdrawals beyond the balance up to the overdraft limit.
displayOverdraftLimit(): Method to display the overdraft limit of the account.
<br>
<hr>
<b>OOPs Concepts Used</b>
<br>
<u>Encapsulation</u>
<br>
Encapsulation is used to protect the attributes of each class. The attributes are made private and can only be accessed through public getter and setter methods.
<br>
<u>Inheritance</u>
<br>
Inheritance allows SavingsAccount and CurrentAccount to inherit common attributes and methods from the BankAccount class, promoting code reuse and logical hierarchy.
<br>
<u>Polymorphism</u>
<br>
Polymorphism is demonstrated through method overriding. The withdraw method is overridden in the CurrentAccount class to provide specific functionality for overdraft limits.
<br>
<u>Abstraction</u>
<br>
Abstraction is achieved by defining a base class (BankAccount) that outlines the core functionalities of a bank account, while specific account types (SavingsAccount and CurrentAccount) implement additional functionalities.