import java.util.ArrayList;
import java.util.List;
//change
public class BankAccount {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int amount;
    private int accountNumber;
    private List<String> transactions;

    public BankAccount(String firstName, String lastName, String dateOfBirth, int amount, int accountNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.amount = amount;
        this.accountNumber = accountNumber;
        this.transactions = new ArrayList<>();
        this.amount = 0;
        double d = Math.random()*1000000000;
    }




    public String generateBio(){
        return "Your name is " + this.firstName + this.lastName + "." +
                "Your date of birth is " + this.dateOfBirth + "." + " You have £" +
                this.amount + " in your account. Your account number is " + this.accountNumber + ".";

}

    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getDateOfBirth(){
        return this.dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public int getAmount(){
        return this.amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void deposit(float amount){
        this.amount += amount;
        this.transactions.add("deposit " + amount);
    }

    public void withdraw(float amount){
        this.amount -= amount;
        this.transactions.add("Withdraw " +amount);

    }
}
