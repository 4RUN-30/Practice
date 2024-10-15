package mathematics;

public class AllDivisorsOfNumber {
    public static void main(String[] args) {

        String isIBSType = "";

        if((isIBSType==null || "".equals(isIBSType)) && !true && true && true && true)
        {
            System.out.println("I am in");
        }
        // allDivisors(182);
    }

    static void allDivisors(int n){
        for (int i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.println(i+", "+n/i);
            }
        }
    }
}
