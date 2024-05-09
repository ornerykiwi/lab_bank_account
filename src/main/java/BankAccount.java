public class BankAccount {
    String firstName;
    String lastName;
    String dateOfBirth;
    String accountNumber;
    double balance; //changed this to long for large numbers

    public BankAccount(String firstName, String lastName, String dateOfBirth, String accountNumber, long balance){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber; //may need to change to an int?
        this.balance = balance; //needs to start at 0

    }
// for first name
    public String setFirstName(String firstName){
        this.firstName = firstName;
        return firstName;
    }

    public String getFirstName(String firstName){
        this.firstName = firstName;
        return firstName;
    }

//    for last name
    public String setLastName(String lastName){
        this.lastName = lastName;
        return lastName;
}

    public String getLastName(){
        return this.lastName;
    }

//    for date of birth
    public String setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
        return dateOfBirth;
    }

    public String getDateOfBirth(){
        return this.dateOfBirth;
    }

    //    for account number
    public String setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
        return accountNumber;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public long setBalance(long balance){
        this.balance = balance;
        return balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public void deposit(double amount){
        this.balance = amount + this.balance;
    }

    public void withdrawal(double amount){
        this.balance = this.balance - amount;
    }

    public void payInterest(double interest){
        this.balance = (long) (this.balance * (1 + (interest/100)));
    }

    //do extension later




























}
