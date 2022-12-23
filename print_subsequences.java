import java.util.HashSet;

public class print_subsequences {

    public static void printSubseq(String str, String newString, HashSet<String> set) {

        if (str.length() == 0) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        // we choose not to include the first Charecter
        printSubseq(str.substring(1), newString, set);

        // we choose to include the first Charecter
        printSubseq(str.substring(1), newString + str.charAt(0), set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        printSubseq(str, "", set);
    }
}
