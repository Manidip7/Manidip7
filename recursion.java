public class recursion {

    public static int factorial(int x) {
        int sum = 1, i;
        for (i = 1; i <= x; i++) {
            sum = sum * i;
        }
        return sum;

    }

    public static void main(String[] args) {
        int total = factorial(6);
        System.out.println(total);
    }
}
