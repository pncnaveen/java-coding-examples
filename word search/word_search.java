
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
    public boolean backTrack(char[][] matrix, String word, int x, int y, int row, int col, int count, int wordLen) {

        boolean k = false;
        if (count == wordLen - 1) {
            System.out.println("checking count");
            return true;
        }
        if (matrixOutOfBounds(x, y, row, col) == true) {
            System.out.println("checking matrix out of bounds");
            return false;
        }
        if (matrix[x][y] == word.charAt(count) && !matrixOutOfBounds(x + 1, y, row, col)
                && matrix[x + 1][y] == word.charAt(count + 1)) {
            System.out.println("checking matrix to down side" + x);
            return backTrack(matrix, word, x + 1, y, row, col, count + 1, wordLen);
        }
        if (matrix[x][y] == word.charAt(count) && !matrixOutOfBounds(x, y + 1, row, col)
                && matrix[x][y + 1] == word.charAt(count + 1)) {
            System.out.println("checking matrix to right side" + y);
            return backTrack(matrix, word, x, y + 1, row, col, count + 1, wordLen);
        }
        System.out.println("no check going down" + x);
        k = backTrack(matrix, word, x + 1, y, row, col, count, wordLen);
        // k = backTrack(matrix, word, x, y + 1, row, col, count, wordLen);
        // return k;
        return k;
    }

    // search the word in the matrix
    // get 3 params 1: matrix, 2: word, 3: num of row
    // if found return true else return false
    public boolean searchWord(char[][] matrix, String word, int row, int wordLen) {

        return backTrack(matrix, word, 0, 0, row, row, 0, wordLen);
    }

    public static void main(String[] args) {
        word_search ws = new word_search();
        char[][] matrix = { { 'B', 'X', 'A', 'M' }, { 'A', 'F', 'A', 'M' }, { 'F', 'O', 'A', 'M' },
                { 'M', 'A', 'S', 'S' }, };
        String word = "FOAM";
        int row = matrix.length;

        boolean isWordFound = ws.searchWord(matrix, word, row - 1, word.length());
        System.out.println(isWordFound);
    }

}