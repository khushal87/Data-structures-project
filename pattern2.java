//By KHUSHAL AGARWAL
public class pattern2 {
   public static void main(String[] args) {
       for(int i=1;i<=4;i++)
       {
           int ctr=0;
           for(int j=1;j<=i;j++)
           {
               ctr++;
               System.out.print(ctr+"\t");
           }
           System.out.println();
       }
   }
}

//Output- 
//1
//1	2	
//1	2   3	
//1	2   3   4
