/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package account;

/**
 *
 * @author ioneill
 */
public class Normal_Account extends Abstract_Account {
private String the_name = "";
private double balance = 0.0;

    Normal_Account( String name )
    { the_name = name;
    }
    public String statement()
    { return the_name + " balance is " + account_balance();
    }

    public double account_balance(){
       return balance;
    }

}
