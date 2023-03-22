import java.util.*;
public class A1103346_0317_1{
    public static void main(String []args){
      int n, m;
      System.out.println("請輸入任意整數做為n值");
      Scanner input = new Scanner(System.in);
      n = input.nextInt();
      
      System.out.println("請輸入任意整數做為m值");
      Scanner in = new Scanner(System.in);
      m = in.nextInt();
      System.out.println();

      int[][] array= new int[n][m];
      for(int i=1; i<=n; i++ ){
        for(int j=1; j<=m; j++ ){
            array[i-1][j-1]= i*j;
        }
      }
      
      
      for(int []a:array){
        for(int b:a){
          System.out.print(b+",");
        }  
        System.out.println();
      } 
  
    }
  }
