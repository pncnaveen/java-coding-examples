
/**
 * word_search still did not finish
 */
public class word_search {

    // find if matrix is out of bounds
    public boolean matrixOutOfBounds(int x, int y, int row, int col) {
        if (x > row || y > col || x < 0 || y < 0)
            return true;
        else
            return false;
    }

    // backtrack and check if the word is ound or not
    public boolean backTrack(char[][] matrix, String word, int x, int y, int row, int col, int count) {
        // check for matrix out of bounds
        if (matrixOutOfBounds(x, y, row, col)) {
            return false;
        }
        // last letter of word found
        if (matrix[x][y] == word.charAt(count) && count == word.length() - 1) {
            return true;
        }
        // if letter is found
        if (matrix[x][y] == word.charAt(count)) {
            // check right of matrix
            if (backTrack(matrix, word, x + 1, y, row, col, count + 1)) {
                return true;
            }
            // check left of matrix
            if (backTrack(matrix, word, x, y + 1, row, col, count + 1)) {
                return true;
            }
        }
        count = 0;
        if (backTrack(matrix, word, x + 1, y, row, col, count)) {
            return true;
        } else if (backTrack(matrix, word, x, y + 1, row, col, count)) {
            return true;
        }
        return false;
    }

    // search the word in the matrix
    // get 3 params 1: matrix, 2: word, 3: num of row
    // if found return true else return false
    public boolean searchWord(char[][] matrix, String word, int row) {
        return backTrack(matrix, word, 0, 0, row, row, 0);
    }

    public static void main(String[] args) {
        word_search ws = new word_search();
        char[][] matrix = { { 'F', 'A', 'C', 'I' }, { 'O', 'B', 'Q', 'P' }, { 'A', 'N', 'O', 'B' },
                { 'M', 'A', 'S', 'S' }, };
        String word = "BP";
        int row = matrix.length;
        System.out.println(ws.searchWord(matrix, word, row - 1));
    }
}