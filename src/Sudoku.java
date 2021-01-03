public class Sudoku {
    public static void main(String[] args) {
        int[][] sudoku = {{1, 0, 3}, {0, 1, 2}, {2, 3, 0}};

        int i = 0;


        while (i < sudoku.length) {
            int j = 0;
            while (j < sudoku[i].length) {
                if (sudoku[i][j] == 0) {
                    if (j > 0  ) {
                        sudoku[i][j] = sudoku[i][j - 1] + 1;
                    } if(j == sudoku.length-1){
                        sudoku[i][j] = sudoku[i][j - 1] - 2;
                    }
                    if (j == 0) {
                        sudoku[i][j] = sudoku[i][j + 1] + 2;
                    }
                }
                System.out.print(sudoku[i][j]);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
