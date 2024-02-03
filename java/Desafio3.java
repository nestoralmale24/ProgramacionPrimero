
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

class Desafio3 {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0) {
            int n = sc.nextInt();
            
            int matrix[][] = new int[n][n];
            
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                 matrix[i][j] = sc.nextInt();
				 }
			}
            Solucion ob = new Solucion();
            ArrayList<Integer> ans = ob.downwardDigonal(n, matrix);
            for (Integer val: ans) {
                System.out.print(val + " "); 
            System.out.println("");
			}
        }
    }
}

class Solucion{
    static ArrayList<Integer> downwardDigonal(int N, int A[][]) {
        int[][] ans =
        {
            { 1, 2, 3, 4, 5 },
            { 2, 3, 4, 5, 6 },
            { 3, 4, 5, 6, 7 },
            { 4, 5, 6, 7, 8 },
            { 5, 6, 7, 8, 9 }
        };
 
        return downwardDigonal(N, A);
    }
}


