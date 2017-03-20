package main;

public class MathService 
{
    public static boolean isLeapYear(int year) 
    {
    	if(year < 0)
    		year = year * (-1) + 1;
    	
    	if(year % 400 == 0)
    		return true;
    	
    	if(year % 100 == 0)
    		return false;
        return year % 4 == 0;
    }
}
