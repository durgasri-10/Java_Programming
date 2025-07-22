import java.util.Scanner;
public class magic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        if (isMagicSquare(matrix, n)) {
        } else {
            System.out.println("NOT a Magic Square.");
        }
    }
    static boolean isMagicSquare(int[][] matrix, int n) {
        int magicSum = 0;
        for (int j = 0; j < n; j++) {
            magicSum += matrix[0][j];
        }
        for (int i = 1; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++)
                rowSum += matrix[i][j];
            if (rowSum != magicSum)
                return false;
        }
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++)
                colSum += matrix[i][j];
            if (colSum != magicSum)
                return false;
        }
        int diag1 = 0;
        for (int i = 0; i < n; i++)
            diag1 += matrix[i][i];
        if (diag1 != magicSum)
            return false;
        int diag2 = 0;
        for (int i = 0; i < n; i++)
            diag2 += matrix[i][n - 1 - i];
        if (diag2 != magicSum)
            return false;

        return true;
    }
}
