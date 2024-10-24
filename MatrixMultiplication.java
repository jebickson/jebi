import java.util.Scanner;
public class MatrixMultiplication {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        //Input dimensions of the matrices
        System.out.println("Enter the number of rows and columns for the first matrix:");
        int rows1=scanner.nextInt();
        int cols1=scanner.nextInt();
        System.out.println("Enter the number of rows and columns for the secondmatrix:");
        int rows2=scanner.nextInt();
        int cols2=scanner.nextInt();
        //Check if matrix multiplication is possible
        if(cols1 != rows2)
        {
            System.out.println("Matrix multiplication is not possible.Number of columns of the first matrix must be equal to the number of rows of the second matrix.");
            return;
        }
        //Input elements of the first matrix
        int[][] matrix1=new int[rows1][cols1];
        System.out.println("Enter the elements of the first matrix:");
        for(int i=0;i<rows1;i++)
        {
            for (int j=0;j<cols1;j++)
            {
                matrix1[i][j]=scanner.nextInt();
            }
        }
        //Input elements of the second matrix
        int[][]matrix2=new int [rows2][cols2];
        System.out.println("Enter the elements of the second matrix:");
        for(int i=0;i<rows2;i++)
        {
            for(int j=0; j<cols2;j++)
            {
                matrix2[i][j]=scanner.nextInt();
            }
        }
        //Multiply the matrices
        int[][] result = new int[rows2][cols2];
        for(int i=0; i<rows1; i++)
        {
            for (int j=0; j<cols2;j++)
            {
                result[i][j]=0;
                for(int k=0; k<cols1;k++)
                {
                    result[i][j] +=matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        //Display the reult
        System.out.println("The resultant matrix is:");
        for(int i=0; i<rows1;i++)
        {
            for(int j=0;j<cols2;j++)
            {
                System.out.println(result[i][j]+"");
            }
            System.err.println();
        }
    }
}
