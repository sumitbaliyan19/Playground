import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner in= new Scanner(System.in);
    int n= in.nextInt();
    
    
    for(int i=1,m=0;i<=n;i++,m++){
      //while(m!=n){
        if(m%3==0 &&   m!=n && m!=0)
        System.out.print(",");
      
      //}
      System.out.print(i);
    }
  }
}