```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the square matrix:");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        if (isMagicSquare(matrix)) {
            System.out.println("The given matrix is a magic square.");
        } else {
            System.out.println("The given matrix is not a magic square.");
        }
    }

    private static boolean isMagicSquare(int[][] matrix) {
        int n = matrix.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrix[0][i];
        }
        for (int i = 1; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != sum) {
                return false;
            }
        }
        for (int i = 0; i < n; i++) {
            int colSum = 0;
            for (int j = 0; j < n; j++) {
                colSum += matrix[j][i];
            }
            if (colSum != sum) {
                return false;
            }
        }
        int diagSum1 = 0;
        for (int i = 0; i < n; i++) {
            diagSum1 += matrix[i][i];
        }
        if (diagSum1 != sum) {
            return false;
        }
        int diagSum2 = 0;
        for (int i = 0; i < n; i++) {
            diagSum2 += matrix[i][n - 1 - i];
        }
        return diagSum2 == sum;
    }
}
```