package recursion;

public class SumOfNumbers {
    public static void main(String[] args) {

    }
    public int sum(int n){
        if(n==1) return 1;
        return n + sum(n-1);
    }
}
