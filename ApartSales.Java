public class ApartSales {
     
    public static int calculateRevenue(int N, int M, int X)  {

          int CA = N / M + 1;

          int SP = (X + X + 1000 * (CA - 1)) * CA / 2;

          int SO = (N % M) * (X + 1000 * (CA - 1));

          return SP * (N / M) + SO; 

     }



    public static void main(String[] args) {

          int N = 30;

          int M = 10;

          int X = 10000;

          int revenue = calculateRevenue(N, M, X);

          System.out.println("Общая выручка: $" + revenue);

     }
}
