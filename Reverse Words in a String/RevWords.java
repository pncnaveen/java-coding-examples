/**
 * RevWords
 */
public class RevWords {

    // reverse the word
    public String reverse(String string) {
        char[] word = string.toCharArray();
        int i = 0, j = word.length - 1;
        while (i < j) {
            char temp = word[i];
            word[i] = word[j];
            word[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(word);
    }

    // split the sentence with delimiter and rev the words
    public String revwords(String msg) {
        String[] words = msg.split(" ");
        msg = "";
        for (String word : words) {
            msg = msg + reverse(word) + " ";
        }
        return msg;
    }

    public static void main(String[] args) {
        RevWords rw = new RevWords();
        String msg = "I am in cavet";
        System.out.println(rw.revwords(msg).trim());
    }
}