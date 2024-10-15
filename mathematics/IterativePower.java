package mathematics;

public class IterativePower {
    public static void main(String[] args) {
        System.out.println(iterativePower(2,5));
    }
    public static int iterativePower(int base, int power){
        int res = 1;
        while(power!=0){
            if(power%2!=0){
                res*=base;
            }
            power/=2;
            base*=base;
        }
        return res;
    }
}
