public class PascalTriangle {
    public static void main(String[] args) {
        int n = 4; // number of rows

        // Create a 2D array to store the Pascal's Triangle values
        int[][] pascalTriangle = new int[n][n];

        // Generate Pascal's Triangle
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    pascalTriangle[i][j] = 1;
                } else {
                    pascalTriangle[i][j] = pascalTriangle[i-1][j-1] + pascalTriangle[i-1][j];
                }
            }
        }

        // Print Pascal's Triangle and calculate the sum of each row
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(pascalTriangle[i][j] + " ");
                rowSum += pascalTriangle[i][j];
            }
            System.out.println("\tSum of row " + (i+1) + ": " + rowSum);
        }
    }
}
