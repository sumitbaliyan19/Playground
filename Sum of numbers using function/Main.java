import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner in=new Scanner(System.in);
      int n= in.nextInt();
      sumOf(n);
      
	} 
  public static void sumOf(int n)
  {
    int s=0;
    while(n>0)
    {
      s=s+n;
      n=n-1;
    }
    
    System.out.println(s);
  }
	
}