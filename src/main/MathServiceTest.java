package main;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MathServiceTest 
{
    // a year is a leap year if is divisible by 4
    // but, years divisible by 100 are not leap years
    // except years divisible by 400
	@BeforeEach
	public void setUp()
	{
		// Nothing to do 
	}
	
	@AfterEach
	public void tearDown()
	{
		// Nothing to do
	}

    @Test
    public void leap_year_should_be_divisible_by_four(){
        assertTrue(MathService.isLeapYear(2016));
    }

    @Test
    public void non_leap_year_should_not_be_divisible_by_four(){
        assertFalse(MathService.isLeapYear(3));
    }
    
    @Test
    public void leapYearShouldNotBeDivisibleByOneHundredTest()
    {
    	assertFalse(MathService.isLeapYear(2100));
    }
}
