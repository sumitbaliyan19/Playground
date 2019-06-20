import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int s=in.nextInt();
      int arr[]=new int[s];
      for(int i=0;i<s;i++)
        arr[i]=in.nextInt();
      int f1=0,f2=0;
      int s1=in.nextInt();
      int s2=in.nextInt();
      for(int i=0;i<s;i++)
      {
        if(s1==arr[i])
          f1=i;
        
      }
      for(int i=0;i<s;i++)
      {
        if(s2==arr[i])
          f2=i;
        
      }
      
      if(f1>0)
        System.out.println(f1);
      else
        System.out.println("-1");
      if(f2>0)
        System.out.println(f2);
      else
        System.out.println("-1");
      
      
    }
}