public class stringrivers {
    public static void main(String[] args) {
        String str = "Rohan Gupta";
        String newString = "";

        for (int i = 0; i < str.length(); i++) {
            newString = str.charAt(i) + newString;
        }
        System.out.println(newString);
    }
}
