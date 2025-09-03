import java.util.*;
public class MatrixRearrangeAndDiagonals {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        if(M<=3||M>=10){ System.out.println("M must be >3 and <10"); return; }
        int[][] A=new int[M][M];
        for(int i=0;i<M;i++) for(int j=0;j<M;j++) A[i][j]=sc.nextInt();
        System.out.println("Original Matrix");
        print(A);
        // collect non-boundary
        ArrayList<Integer> nb=new ArrayList<>();
        for(int i=1;i<M-1;i++) for(int j=1;j<M-1;j++) nb.add(A[i][j]);
        Collections.sort(nb);
        // put back
        int k=0;
        for(int i=1;i<M-1;i++) for(int j=1;j<M-1;j++) A[i][j]=nb.get(k++);
        System.out.println("Rearranged Matrix");
        print(A);
        // diagonals
        int sum=0;
        System.out.println("Diagonal elements of rearranged matrix:");
        for(int i=0;i<M;i++){
            for(int j=0;j<M;j++){
                if (i==j || i+j==M-1){ System.out.print(A[i][j]+" "); sum+=A[i][j]; }
                else System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("Sum of diagonal="+sum);
        sc.close();
    }
    static void print(int[][] m){
        for(int[] r:m){ for(int v:r) System.out.print(v+" "); System.out.println(); }
    }
}
