package com.qa.AccountPrize;

import org.junit.Assert;
import org.junit.Test;
import com.qa.account.accountapi.util.PrizeCalculator;



public class TestingAccountGenLengths {

	

	@Test
	public void testAccountLength6() {
		
		PrizeCalculator Prize = new PrizeCalculator();
		
		Prize.getCashPrize("B", 8);
		
		Assert.assertEquals(25, Prize.getCashPrize("A", 8));
		Assert.assertEquals(100, Prize.getCashPrize("A", 10));
		Assert.assertEquals(400, Prize.getCashPrize("A", 12));

		Assert.assertEquals(50, Prize.getCashPrize("B", 8));
		Assert.assertEquals(200, Prize.getCashPrize("B", 10));
		Assert.assertEquals(800, Prize.getCashPrize("B", 12));
		
		
		Assert.assertEquals(0, Prize.calculatePrize("C"));

	}
}


