package ac.uk.qub.junittesting;

public class Excess_Calc {
	
	public double CheckExcess(double claim_amt) {
		
double excess_amt=0;
		
		if(claim_amt >= 1 && claim_amt <= 249)
			excess_amt = 0.00;
		else if(claim_amt >= 250 && claim_amt <= 499)
			excess_amt = 25.00;
		else if(claim_amt >= 500 && claim_amt <= 999)
			excess_amt = 50.00;
		else if(claim_amt >= 1000)
			excess_amt = 100.00;
		
		return excess_amt;
		
	}

}
