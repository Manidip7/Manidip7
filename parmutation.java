public class parmutation {
    public static void printperm(String str, String permu) {

        if (str.length() == 0) {

            System.out.println(permu);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char currChar = str.charAt(i);

            // "abc" -> "ab"

            String newString = str.substring(0, i) + str.substring(i + 1);

            printperm(newString, permu + currChar);

        }
    }

    public static void main(String[] args) {
        printperm("abc", "");
    }
}
