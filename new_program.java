public class new_program {

    public static void moveAllx(String str, int inx, int count, String newString) {
        if (inx == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(inx);

        if (currChar == 'x') {
            count++;
            moveAllx(str, inx + 1, count, newString);
        } else {
            newString += currChar;
            moveAllx(str, inx + 1, count, newString);
        }
    }

    public static void main(String[] args) {
        String str = "axbcfxbxgxb";
        moveAllx(str, 0, 0, "");
    }
}
