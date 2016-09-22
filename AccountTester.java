package accounttester;

/**
 *
 * @author Jun
 */
public class AccountTester {
   public static void main(String[] args) {
      // Test constructor and toString()
      Account d1 = new Account(150, 65689.00);
      System.out.println(d1);  // toString()
 
      // Test Setters and Getters
      d1.setBalance(5000.00);

      System.out.println(d1);  // run toString() to inspect the modified instance
      System.out.println("Account Number is: " + d1.getAccountNumber());
      System.out.printf("Balance is: Php %.2f\n", d1.getBalance());
      d1.credit(200.00);
      System.out.printf("Balance is(Added with credit): Php %.2f\n", d1.getBalance());
      d1.debit(200.00);      
            System.out.printf("Balance is(Subtracted with debit): Php %.2f\n", d1.getBalance());
 
      // Test setAccount()
      
      d1.setAccount(298, 799989.00);
      //Account d2 = new Account();
      System.out.println(d1);  // toString()


   }
}

