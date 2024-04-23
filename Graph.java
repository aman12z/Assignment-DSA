import java.util.Scanner;
 class Graph {

     public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         int n=sc.nextInt();
         int arr[][]=new int[n][n];
         for(int i=0;i<n;i++)
         {
             for (int j = 0; j <n ; j++) {
                 System.out.println("enter 1 to make edge else in between else 0" );
                 int edge = sc.nextInt();
                 arr[i][j]=edge;
                 arr[j][i]=edge;
             }
         }
         for(int i=0;i<n;i++)
         {
             for (int j = 0; j <n ; j++) {
                 System.out.print(arr[i][j]);
             }
             System.out.println();
         }

     }
}