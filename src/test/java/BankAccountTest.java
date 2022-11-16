import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;


//change
public class BankAccountTest {
    BankAccount acct1 = new BankAccount("Anne", "Smith", "22/10/1980", 7000, 982453);


@Test
public void testGetAccountName()
{
    assertThat(acct1.getFirstName().equals("Anne"));
    assertThat(acct1.getLastName().equals("Smith"));
    assertThat(acct1.getDateOfBirth().equals("22/10/1980"));
    assertThat(acct1.getAmount()==0f);
}

@Test
public void testDeposit(){
    float beforeDeposit = acct1.getAmount();
    acct1.deposit(1000f);
    assertTrue(acct1.getAmount()==beforeDeposit+1000f);
}

@Test
    public void testWithdraw(){
    float beforeWithdraw = acct1.getAmount();
    acct1.withdraw(500f);
    assertTrue(acct1.getAmount()==beforeWithdraw-500f);
}}


//    @BeforeEach
  //  public void setUp() {
     //   BankAccount user = new BankAccount("Ann", "Smith", "20/07/1980", 9000, 98734) ;}





