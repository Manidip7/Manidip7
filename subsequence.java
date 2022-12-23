public class subsequence {

    public static void subseq(String str, int inx, String newString) {
        if (inx == str.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(inx);

        // to be
        subseq(str, inx + 1, newString + currChar);

        // or not to be
        subseq(str, inx + 1, newString);

    }

    public static void main(String[] args) {
        String str = "abc";
        subseq(str, 0, "");
    }
}
