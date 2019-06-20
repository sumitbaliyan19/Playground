import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
          Scanner in = new Scanner(System.in);
      int Number=in.nextInt();
   int Temp = Number;
      int Sum=0;
		while( Temp > 0)
		{
			int Factorial = 1; 
			int i = 1; 
		    int Reminder = Temp % 10;
		    while (i <= Reminder)
		    {
		     	Factorial = Factorial * i;
		     	i++;
		    }
		   
		     Sum = Sum + Factorial;
		     Temp = Temp /10;
		}
		
		
		
		if ( Number == Sum )
		{
			System.out.println("Yes");
		}
		else
		{
		   System.out.println("No");
		}
    }
}