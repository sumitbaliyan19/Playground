import java.util.*;
 
class Main 
{
	public static void main(String[] args) 
	{
      Scanner in= new Scanner(System.in);
      int n=in.nextInt();
      int m=in.nextInt();
      pwrof(n,m);
    }
  public static void pwrof(int b,int e)
  {
    int p=1;
	for(int i=1;i<=e;i++)
		{
			p=p*b;
        }
		System.out.println(p);
		
	}
 
}