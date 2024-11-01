
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args){
        int[][] mat1 = new int[2][2];
        int[][] mat2 = new int[2][2];
        int[][] res = new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of first matrix ");
        for(int i=0; i<mat1.length; i++){
            for(int j=0; j<mat1[0].length; j++){
                mat1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix ");
        for(int i=0; i<mat2.length; i++){
            for(int j=0; j<mat2[0].length; j++){
                mat2[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<res.length; i++){
            for(int j=0; j<res[0].length; j++){
                res[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        System.out.println("Result is ");
        for(int i=0; i<mat1.length; i++){
            for(int j=0; j<mat1[0].length; j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
