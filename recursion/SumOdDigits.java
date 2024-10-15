package recursion;

public class SumOdDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(134));
    }
    static int sumOfDigits(int n){
        return sumOfDigits(n,0);
    }

    static int sumOfDigits(int n,int sum){
        if(n==0) return sum;
        return sumOfDigits(n/10,sum+(n%10));
    }
}
