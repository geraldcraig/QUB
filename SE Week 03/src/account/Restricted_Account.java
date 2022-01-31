/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package account;

/**
 *
 * @author ioneill
 */
public class Restricted_Account extends Account {	private static final int MAX_WITHDRAWALS = 3;
	private int num_withdrawals_left = 0;
	public void reset()
	{ num_withdrawals_left = MAX_WITHDRAWALS;
	}
	public double withdraw (final double amount)
	{ if (num_withdrawals_left>0)
	  { num_withdrawals_left = num_withdrawals_left - 1;
	    return super.withdraw(amount);
	  }
	  else return 0.0;
	}
}
