

package account;


class Account
{
	private double balance = 0.0;
	private double min_balance = 0.0;

	public Account()
	{
		balance= min_balance = 0.0;
	}

	public void deposit(final double amount)
	{
		balance = balance + amount;
	}

	public double withdraw(final double amount)
	{
		if ( (balance - amount) >= min_balance)
			{ balance = balance - amount;
				return amount;
			}
		else
			{ return 0.0;
			}
	}

	public double account_balance ()
	{
		return balance;
	}

	public void set_min_balance(final double amount)
	{
		min_balance = amount;
	}
}
