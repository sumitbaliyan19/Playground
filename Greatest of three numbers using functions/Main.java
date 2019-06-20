import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in= new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      greatest(n1,n2,n3);
	}
  public static void greatest(int a,int b,int c)
  {int d;
    if(a>b)
      d=a;
   else
     d=b;
   if(d>c)
     System.out.println(d);
   else
     System.out.println(c);
      
  }
}