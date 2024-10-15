package mathematics;

public class Power {
    public static void main(String[] args) {
        System.out.println(efficientPower(3,5));
    }
    static int power(int base,int pow){
        int result = 1;
        for(int i=0;i<pow;i++){
            result =result*base;
        }
        return result;
    }

    static int efficientPower(int base,int pow){
        int temp;
            if(pow%2==0){
            temp = power(base,pow/2) * power(base,pow/2);
        }
        else{
            temp = power(base,pow/2) * power(base,pow/2) * base;
        }
        return temp;
    }


}
