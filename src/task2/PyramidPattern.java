package task2;

public class PyramidPattern {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            // Printing spaces
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }

            // Printing numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }

            // Move to the next line
            System.out.println();

        }
    }
}
