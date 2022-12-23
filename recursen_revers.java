public class recursen_revers {
    public static void rec_rev(String str, int inx) {
        if (inx == 0) {
            System.out.print(str.charAt(inx));
            return;
        }
        System.out.print(str.charAt(inx));
        rec_rev(str, inx - 1);
    }

    public static void main(String[] args) {
        String str = "MANIDIP";
        rec_rev(str, str.length() - 1);
    }
}
