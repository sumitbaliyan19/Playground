import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      
		Scanner in = new Scanner(System.in);
		int a= in.nextInt();
		int b = in.nextInt();
      int c = in.nextInt();
	int l=(a>b)?(a>c?a:c):(b>c?b:c);
      System.out.println(l);
    }		
}