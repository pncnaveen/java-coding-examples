
/**
 * characterMap
 */
public class characterMap {

    // find if the charaters are mapped or not
    // return true if all mapped or false if cannot map
    public Boolean hasCharMap(String str1, String str2) {
        // init the alphabet int array to 0
        int[] alpha1 = new int[52];
        int[] alpha2 = new int[52];

        // check if both the string length are same
        if (str1.length() != str2.length())
            return false;

        // parse both strings
        for (int i = 0; i < str1.length(); i++) {
            // get chars from string
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);

            // get the ascii values
            int asc1 = c1 >= 'a' ? c1 - 'a' + 26 : c1 - 'A';
            int asc2 = c2 >= 'a' ? c2 - 'a' + 26 : c2 - 'A';

            // if alphabet is alredy mapped
            if (alpha1[asc1] != 0 || alpha2[asc2] != 0) {
                return false;
            }

            // if alphabet is not mapped
            alpha1[asc1] = i + 1;
            alpha2[asc2] = i + 1;

        }
        return true;
    }

    public static void main(String[] args) {
        characterMap cm = new characterMap();
        String str1 = "aAc";
        String str2 = "Fef";
        System.out.println(cm.hasCharMap(str1, str2));
    }
}