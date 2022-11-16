import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
// commit

public class Runner {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put(1, "current account");
        properties.put(2, "savings account");
        System.out.println("Please select which account you wish to access");
        System.out.println(properties.toString());
        System.out.println(properties.getProperty("1"));
        System.out.println(properties.getProperty("2"));
        System.out.println("hello");
    }



        private final String name;
        private String accountNumber;
        private final float accountBalance;
        private List<String> transaction;
        private float interest = 3;
        private int duration = 6;
        private boolean isChangedInterest = false;
        private boolean isChangedduration = false;

    public Runner(String name, float accountBalance, String name1,float accountBalance1){
            this.name = name1;
            this.accountBalance = accountBalance1;
            BankAccount user = new BankAccount("Ann", "Smith", "20/07/1980", 9000, 89934);
            user.setFirstName("Ann ");
            user.setLastName("Smith");
            user.setDateOfBirth("20/07/1980");
            user.setAmount(9000);
            user.setAccountNumber(89934);
        }

    public Runner(String name, float accountBalance, float interest){
            this.name = name;
            this.accountBalance = accountBalance;
            this.isChangedduration = false;
            this.transaction = new ArrayList<>();
            this.interest = interest;
        }

    public Runner(String name, float accountBalance, float interest, int dur){
            this.name = name;
            this.accountBalance = accountBalance;
            this.interest = interest;
            this.duration = dur;
            this.isChangedInterest = true;
            this.isChangedduration = true;
            this.transaction = new ArrayList<>();
        }

        public String getName () {
            return this.name;
        }

        public String getAccountNumber () {
            return this.accountNumber;
        }

        public void setAccountNumber (String acctNo){
            this.accountNumber = acctNo;
        }

        public float getAccountBalance () {
            return this.accountBalance;
        }

        public float getInterest () {
            return this.interest;
        }

        public void setInterest ( float rate){
            this.interest = rate;
        }

        public int getDuration () {
            return this.duration;
        }

        public void setDuration ( int month){
            this.duration = month;
        }
    /*


        System.out.println("Your name is " + user.getFirstName() + user.getLastName());
        System.out.println("Your date of birth is " + user.getDateOfBirth());
        System.out.println("There is £" + user.getAmount() + " in your account");
        */


}




