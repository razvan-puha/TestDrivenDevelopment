package main;

public class MathService 
{
    public static boolean isLeapYear(int year) 
    {
    	if(year % 100 == 0)
    		return false;
        return year % 4 == 0;
    }
}
