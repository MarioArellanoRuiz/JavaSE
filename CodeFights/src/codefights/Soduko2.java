package codefights;

public class Soduko2 {

    public static void main(String[] args) {
        char[][] grid = {
            {'.', '.', '.', '1', '4', '.', '.', '2', '.'},
            {'.', '.', '6', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '1', '.', '.', '.', '.', '.', '.'},
            {'.', '6', '7', '.', '.', '.', '.', '.', '9'},
            {'.', '.', '.', '.', '.', '.', '8', '1', '.'},
            {'.', '3', '.', '.', '.', '.', '.', '.', '6'},
            {'.', '.', '.', '.', '.', '7', '.', '.', '.'},
            {'.', '.', '.', '5', '.', '.', '.', '7', '.'}};
        System.out.println(sudoku2(grid));

    }

    static boolean sudoku2(char[][] grid) {
        return true;
    }

}
