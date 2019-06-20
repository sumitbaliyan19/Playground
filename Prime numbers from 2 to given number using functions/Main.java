import java.util.*;
class Main
{
	public static void main(String[] args) 
	{
      Scanner in= new Scanner(System.in);
      int n=in.nextInt();
      pwrof(n);
    }
  public static void pwrof(int a)
  {
    
	for(int i=2;i<a;i++)
		{int flag=0;
			for(int j=2;j<i;j++)
            {
              if(i%j==0)
                flag=1;
            }
        if(flag==0)
		 System.out.println(i);
    }
	}
 
}