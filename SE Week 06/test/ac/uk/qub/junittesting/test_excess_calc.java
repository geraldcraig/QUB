package ac.uk.qub.junittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class test_excess_calc {
	
	static double claim1;
	static double claim1_lower;
	static double claim1_upper;
	static double claim2;
	static double claim3;
	static double claim4;
	
	@BeforeClass
	public static void init()
	{
		claim1=1;
		claim1_lower=-1;
		claim1_upper=2;
		claim2=270;
		claim3=600;
		claim4=1100;
	}
	
	@Test
	public void claim_amt1()
	{
		double actual;
		Excess_Calc obj=new Excess_Calc();
		actual=obj.CheckExcess(claim1);
		
		assertEquals(0, actual);
		
	}
	
	@Test
	public void claim_amt1_lower()
	{
		double actual;
		Excess_Calc obj=new Excess_Calc();
		actual=obj.CheckExcess(claim1_lower);
		
		assertEquals(0, actual);
		
	}
	
	@Test
	public void claim_amt1_upper()
	{
		double actual;
		Excess_Calc obj=new Excess_Calc();
		actual=obj.CheckExcess(claim1_upper);
		
		assertEquals(0, actual);
		
	}
	
	@Test
	public void claim_amt2()
	{
		double actual;
		Excess_Calc obj=new Excess_Calc();
		actual=obj.CheckExcess(claim2);
		
		assertEquals(25, actual);
		
	}
	
	@Test
	public void claim_amt3()
	{
		double actual;
		Excess_Calc obj=new Excess_Calc();
		actual=obj.CheckExcess(claim3);
		
		assertEquals(50, actual);
		
	}
	
	@Test
	public void claim_amt4()
	{
		double actual;
		Excess_Calc obj=new Excess_Calc();
		actual=obj.CheckExcess(claim4);
		
		assertEquals(100, actual);
		
	}

}
