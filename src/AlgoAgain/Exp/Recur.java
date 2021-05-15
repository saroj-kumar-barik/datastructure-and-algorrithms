package AlgoAgain.Exp;

public class Recur {
    public static void main(String[] args) {
        int num = 5;
        int res = fact(num);

        System.out.println(res);
    }
    public static int fact(int num){
        if (num == 0 || num ==1)
            return 1;
        else
            return num * fact(num-1);
    }
}
