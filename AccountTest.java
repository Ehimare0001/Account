import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @Test
    public void testAccountCreated() {
        Account account = new Account(1234);

        assertEquals(0, account.getBalance());
    }

    @Test
    public void testDeposit() {
        Account account = new Account(1234);

        account.deposit(7000);

        assertEquals(7000, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        Account account = new Account(1234);

        account.deposit(7000);
        account.withdraw(3000);

        assertEquals(4000, account.getBalance());
    }

    @Test
    public void testWithdrawWithPin() {
        Account account = new Account(1234);

        account.deposit(7000);
        account.withdraw(3000, 1234);

        assertEquals(4000, account.getBalance());
    }

    @Test
    public void testCannotWithdrawGreaterThanBalance() {
        Account account = new Account(1234);

        account.deposit(4000);
        account.withdraw(6000);

        assertEquals(4000, account.getBalance());
    }


}

