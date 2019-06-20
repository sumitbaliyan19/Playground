import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in = new Scanner(System.in);
    int n= in.nextInt();
    while(n>0){
     int n1=n%10;
    n=n/10;
      //int n2=(n/10)%10;
     // int n3=n/100;
     // int n4=(n1*100)+(n2*10)+n3;
      System.out.print(n1);
    }
  }
}