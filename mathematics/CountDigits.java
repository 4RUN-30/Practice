package mathematics;

public class CountDigits {
    public static void main(String[] args) {
        System.out.println(countDigits(100));
    }
    public static int countDigits(int n){
        int count =0;
        while(n!=0){
            count++;
            n/=10;
        }
        return count;
    }
    static boolean checkPalindrome(int n)
    {
        int reverse = 0;
        int temp = n;
        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp = temp / 10;
        }
        return (reverse == n);
    }
    public long factorial(int n) {
        if(n==0) {
            return 1;
        }
        return n*factorial(n-1);
    }
}
