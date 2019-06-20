import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in =new Scanner(System.in);
      int n=in.nextInt();
      int t_digit=n%10;
      int f_digit=n/100;
      int sum=f_digit+t_digit;
      System.out.println(sum);
	}
}