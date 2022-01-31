/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package account;
import java.text.DecimalFormat;

/**
 *
 * @author ioneill
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       // Test Account Class
       Account account = new Account();
       account.deposit(1.00);
       account.set_min_balance(0.00);
       account.withdraw(0.99);
       double accountBalance = account.account_balance();
       System.out.println("accountBalance is " + roundToTwoPlaces(accountBalance));
       //System.out.println("accountBalance is " + accountBalance);

       // Test AccountPlus Class
       AccountPlus accountPlus = new AccountPlus("Fred Bloggs");
       accountPlus.deposit(2.00);
       accountPlus.set_min_balance(0.00);
       accountPlus.withdraw(0.99);
       double accountPlusBalance = accountPlus.account_balance();
       System.out.println("\naccountPlusBalance is " + roundToTwoPlaces(accountPlusBalance));
       String accountPlusStatement = accountPlus.statement();
       System.out.println(accountPlusStatement);

       // Test Restricted_Account Class
       Restricted_Account restrictedAccount  = new Restricted_Account();
       restrictedAccount.reset();
       restrictedAccount.deposit(5.00);
       System.out.println("restrictedAccount Balance is " + restrictedAccount.account_balance());
       restrictedAccount.withdraw(1.00);
       System.out.println("After withdrawal 1 restrictedAccount Balance is " + restrictedAccount.account_balance());
       restrictedAccount.withdraw(1.00);
       System.out.println("After withdrawal 2 restrictedAccount Balance is " + + restrictedAccount.account_balance());
       restrictedAccount.withdraw(1.00);
       System.out.println("After withdrawal 3 restrictedAccount Balance is " + restrictedAccount.account_balance());
       restrictedAccount.withdraw(1.00);
       System.out.println("After withdrawal 4 restrictedAccount Balance is " + restrictedAccount.account_balance());

       // Test Interest_Account Class
       // Create with deposit
       Interest_Account interestAccount = new Interest_Account(6.00);
       System.out.println("\ninterestAccount Balance is " + interestAccount.account_balance());
       interestAccount.end_of_day();  // uses interest_accumulate to update the accumulated interest variable
       interestAccount.interest_credit(); // adds the accumulated interest to the account
       System.out.println("interestAccount Balance at end of day 1 is " + interestAccount.account_balance());

       // Test Special Interest_Account Class
       // Create SIA 1 with deposit
       Special_Interest_Account specialInterestAccount1 = new Special_Interest_Account(999.00);
       Special_Interest_Account.set_rate(SIA_Const.R1, SIA_Const.R2);
       System.out.println("\nspecialInterestAccount 1 Balance is " + specialInterestAccount1.account_balance());
       Special_Interest_Account specialInterestAccount2 = new Special_Interest_Account(1000.00);
       Special_Interest_Account.set_rate(SIA_Const.R1, SIA_Const.R2);
       System.out.println("specialInterestAccount 2 Balance is " + specialInterestAccount2.account_balance());
       specialInterestAccount1.end_of_day();
       specialInterestAccount1.interest_credit();
       System.out.println("specialInterestAccount1 Balance at end of day 1 is " + specialInterestAccount1.account_balance());
       specialInterestAccount2.end_of_day();
       specialInterestAccount2.interest_credit();
       System.out.println("specialInterestAccount2 Balance at end of day 1 is " + specialInterestAccount2.account_balance());


        // Test Normal_Account Class
       Normal_Account normalAccount = new Normal_Account("Fred's Account");
       System.out.println("\n" + normalAccount.statement());

    }

    static double roundToTwoPlaces(double doubleToRound){

           DecimalFormat decimalOutput = new DecimalFormat("#.##");
           return Double.valueOf(decimalOutput.format(doubleToRound));
    }

}
