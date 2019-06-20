import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in= new Scanner(System.in);
      int n= in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
        arr[i]=in.nextInt();
      int z_count=0;
      int pos[]=new int[n];
      int index=0;
      for(int i=0;i<n;i++)
      { if(arr[i]==0)
          z_count++;
       else
       { pos[index]=arr[i];
         index++;
       }
      }  
      for(int i=0;i<index;i++)
        System.out.print(pos[i]+" ");
      for(int i=0;i<z_count;i++)
        System.out.print("0"+" ");
        
    }
}