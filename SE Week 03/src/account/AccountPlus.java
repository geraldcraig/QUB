/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package account;

/**
 *
 * @author ioneill
 */
public class AccountPlus extends Account
{  private String account_name = "";
   private long   statement_no = 1;

   public AccountPlus()
   { account_name = "Anonymous";
     statement_no = 1;
   }
   public AccountPlus( final String name )
   {  account_name = name;
      statement_no = 1;
   }
   public String statement()
   {return "Mini-statement #" + statement_no++ +
		    "  for " + account_name + "\n" +
            "The balance of your account is : �" + 			account_balance() + "\n";
   }
 }

