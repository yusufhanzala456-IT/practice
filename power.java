import java.lang.Math;
public class power {
    public static boolean isPower(int x, int y){
        double res1 = Math.log(y) / Math.log(x);
        return res1 == Math.floor(res1);
    }
    public static void main(String[] args) {
        System.out.println(isPower(10, 100));
        System.out.println(isPower(2, 128));
        System.out.println(isPower(5, 25));
    }
    
}
