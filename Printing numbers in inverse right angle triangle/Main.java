import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner in=new Scanner(System.in);
      int n= in.nextInt();
      
      for(int i=n;i>=1;i--)
      {for(int j=i;j>=1;j--)
          System.out.print(j);
        for(int s=n-1;s>=1;s--)
          System.out.print(" ");
        System.out.println("");
        }
        
        
      }
	
	
}