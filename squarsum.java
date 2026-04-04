import java.util.*;
public class squarsum {
    public static int sqrSum(int n){
        int sum = 0;
        for(int i = 1; i<=n; i++)
            sum += i*i;
        return sum;
    }
    public static int summation(int n){
        return n*(n+1) * (2 * n*(n+1)) / 6;
    }
     public static void main(String[] args) {
        int n = 3;
        System.out.println(sqrSum(n));
    }
}
