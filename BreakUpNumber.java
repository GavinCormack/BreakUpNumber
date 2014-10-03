import java.util.Scanner;

public class BreakUpNumber
{
	public static void main (String args[])
	{
		System.out.println("Enter 5 digit number");
		Scanner scan = new Scanner(System.in);
    	int number;
    	boolean is5 = false;

		while(is5 != true)
		{
			number = scan.nextInt();

				if((int)(Math.log10(number)+1) == 5)
	    		{
	    			is5 = true;
		    		int num1, num2, num3, num4, num5;

			    	num5 = number%10;
			    	number = number/10;
			    	num4 = number%10;
			    	number = number/10;
			    	num3 = number%10;
			    	number = number/10;
			    	num2 = number%10;
			    	number = number/10;
			    	num1 = number%10;
			    	number = number/10;


			    	System.out.println("First Digit = " + num1);
			    	System.out.println("Second Digit = " + num2);
			    	System.out.println("Third Digit = " + num3);
			    	System.out.println("Fourth Digit = " + num4);
			    	System.out.println("Fifth Digit = " + num5);
	    		}

	    		else
	    		{
	    			System.out.println("Incorrect number of digits");
	    			System.out.println("Enter 5 digit number");
	    		}
		}




	}
}