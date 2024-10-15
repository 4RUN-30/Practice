package recursion;

public class Power {
    public static void main(String[] args) {
        long l = new Power().power(12,21);
        System.out.println(l);
    }

    long power(int n,int r)
    {
        //Your code here
        if(r==0){
            return 1;
        }

        long t = power(n,r/2);
        t = (t*t)%1000000007;

        if(r%2==1){
            t = (t * n) % 1000000007;
        }

        return t;
    }
}
