import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
	  Scanner in= new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      grcd(n1,n2,n3);
	}
  public static void grcd(int a,int b,int c)
  {int min;
    if(a>b)
      min=b;
   else
     min=a;
   if(min>c)
     min=c;
   while(min>0)
   {
  if(a%min==0&&b%min==0&&c%min==0)
  {System.out.println(min);
   break;
  }
   }  
  }
}