public class revers {
    public static void main(String[] args) {
        String nams = "RIKI";
        String nams2 = "";
        for (int i = nams.length() - 1; i >= 0; i--) {
            nams2 = nams2 + nams.charAt(i);
        }
        System.out.println(nams2);
    }
}
