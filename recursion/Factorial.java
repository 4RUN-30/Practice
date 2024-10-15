package recursion;

import fun.Main;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(new Factorial().fact(5,1));
    }

    public int fact(int n,int res){
        if(n==1){
            return res;
        }
        return fact(n-1,res*n);
    }
}
