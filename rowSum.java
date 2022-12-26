import java.util.*;

class rowSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int R = sc.nextInt();
        System.out.println();
        System.out.println("Enter no. of cols: ");
        int C = sc.nextInt();
        System.out.println();
        int[][] A = new int[R][C];
        System.out.println("Enter 2D array elemnts: ");
        
        for (int i=0; i<R; i++) {
            for (int j=0; j<C; j++) {
                A[i][j] = sc.nextInt();
            }
        }                
        rowSum2D(R, C, A);
        sc.close();
    }
    public static void rowSum2D(int R, int C, int[][] A) {
        int[] B = new int[R];
        System.out.println();
        System.out.println("Resultant 1D array");
        for (int i=0; i<R; i++) {
            int sum = 0;
            for (int j=0; j<C; j++) {
                sum += A[i][j];
            }
            System.out.print((B[i] = sum) + " ");
        }
        System.out.println();
    }
}