import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in=new Scanner(System.in);
      int n= in.nextInt();
      square(n);
      
	} 
  public static void square(int n)
  {
    int s=n*n;
    System.out.println(s);
  }
}