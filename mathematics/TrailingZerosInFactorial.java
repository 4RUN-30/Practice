package mathematics;

public class TrailingZerosInFactorial {
    public static void main(String[] args) {
        int n = 25;
        int count = 0;
        for (int i = 5; n >= i; i *= 5) {
            count += n / i;
        }
        System.out.println(count);
    }
}
// 5->1 25->2 125->3
// TC -> log(n)