/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package account;

/**
 *
 * @author ioneill
 */
public class Special_Interest_Account extends Interest_Account {
	static double the_interest_band_1 = SIA_Const.R1;
	static double the_interest_band_2 = SIA_Const.R2;

	public Special_Interest_Account()
	{
	}

	public Special_Interest_Account( final double initial )
	{
		super( initial ); //Constructor in Interest_Account
	}

	public static void set_rate(final double ir1, final double ir2)
	{
	the_interest_band_1 = ir1;
	the_interest_band_2 = ir2;
	}

	public void end_of_day()
	{
	double money = account_balance();
	if ( money < 1000 )
		interest_accumulate( account_balance() * the_interest_band_1 );
	else
		interest_accumulate( account_balance() *
		the_interest_band_2 );
	}

}
