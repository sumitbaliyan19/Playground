import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in= new Scanner(System.in);
      int n = in.nextInt();
      for(int i=1;i<=n;i++)
      {if(i==1||i==n)
      {
        for(int j=1;j<=n;j++)
      {
        System.out.print("*");
      }
      }
      else
      {
        
        System.out.print("*");
        for(int j=2;j<=n-1;j++)
      {
        System.out.print(" ");
      }
          System.out.print("*");   
      
      }
          
       // for(int j=1;j<=n;j++)
      //{
        //System.out.print("*");
      //}
       
       //c=c+1;
        System.out.println("");
      }
	}
}