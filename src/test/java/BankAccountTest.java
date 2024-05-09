import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {
    BankAccount bankAccount;

    @BeforeEach
    public void setUp(){ bankAccount = new BankAccount("Charisma",
            "Khawaja", "201200", "1234", 1000); }


    @Test
    public void checkSetFirstName(){
        String result = bankAccount.setFirstName("Super");
        assertThat(result).isEqualTo("Super");
    }

    @Test
    public void checkGetFirstName(){
        String result = bankAccount.getFirstName("Charisma");
        assertThat(result).isEqualTo("Charisma");
    }

    @Test
    public void checkSetLastName(){
        String result = bankAccount.setLastName("Mario");
        assertThat(result).isEqualTo("Mario");
    }

    @Test
    public void checkGetLastName(){
        String result = bankAccount.getLastName();
        assertThat(result).isEqualTo("Khawaja");
    }

    @Test
    public void checkSetDateOfBirth(){
        String result = bankAccount.setDateOfBirth("010187");
        assertThat(result).isEqualTo("010187");
    }

    @Test
    public void checkGetDateOfBirth(){
        String result = bankAccount.getDateOfBirth();
        assertThat(result).isEqualTo("201200");
    }

    @Test
    public void checkSetAccountNumber(){
        String result = bankAccount.setAccountNumber("4321");
        assertThat(result).isEqualTo("4321");
    }

    @Test
    public void checkGetAccountNumber(){
        String result = bankAccount.getAccountNumber();
        assertThat(result).isEqualTo("1234");
    }

    @Test
    public void checkSetBalance(){
        long result = bankAccount.setBalance(10000);
        assertThat(result).isEqualTo(10000);
    }

    @Test
    public void checkGetBalance(){
        double result = bankAccount.getBalance();
        assertThat(result).isEqualTo(1000);
    }

    // deposit method

    @Test

    public void checkIfDepositHasBeenAdded(){
        double newBalance = 2000;
        bankAccount.deposit(1000);
        double result = bankAccount.getBalance();
        assertThat(newBalance).isEqualTo(result);
        System.out.println(bankAccount.getBalance());
    }

    @Test
    public void checkIfWithdrawalHasBeenAdded(){
        double newBalance = 50; //what i am expecting
        bankAccount.withdrawal(950); //if i withdraw 950 i shd get 50
        double result = bankAccount.getBalance();
        assertThat(newBalance).isEqualTo(result);
        System.out.println(bankAccount.getBalance());
    }

    @Test
    public void checkIfInterestHasBeenAdded(){
        double interestAdded = 1100;
        bankAccount.payInterest(10);
        double result = bankAccount.getBalance();
        assertThat(interestAdded).isEqualTo(result);
        System.out.println(bankAccount.getBalance());
    }


}
