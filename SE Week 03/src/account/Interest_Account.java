/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package account;

/**
 *
 * @author ioneill
 */
public class Interest_Account extends Account{
private static double the_interest_rate = IA_Const.RATE;
private double the_accumulated_interest;

public Interest_Account()
{
the_accumulated_interest = 0.0;
}

public Interest_Account(final double initial)
{
this(); //Constructor in this class
deposit( initial ); //Set initial amount
}

public static void set_rate(final double ir)
{
the_interest_rate = ir;
}

public void end_of_day()
{
interest_accumulate(
account_balance() * the_interest_rate );
}

public void interest_credit()
{
deposit( the_accumulated_interest );
the_accumulated_interest = 0.0d;
}

public void set_min_balance( double money ) //Deny access
{
return;
}

protected void interest_accumulate( final double ai )
{
the_accumulated_interest += ai;
}

}
