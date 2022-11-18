public class Triangular {
    public static long triangular(long n) {
        long result = 0;
        for (int i = 0; i <= n; i++) {
            result = result + i;
        }
        return result;
    }
}