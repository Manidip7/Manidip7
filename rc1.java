public class rc1 {

    public static void main(String[] args) {
        message(5);
    }

    static int message(int n) {

        if (n == 1) {
            System.out.println("hello World");
            return n;
        }
        System.out.println("hello World");
        return message(n - 1);
    }
}
