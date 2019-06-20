import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in =new Scanner(System.in);
      int n = in.nextInt();
     
      for(int i=1,j=i;j<=n;i+=2,j++)
        System.out.println(i);
        
	}
}