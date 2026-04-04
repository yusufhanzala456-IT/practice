public class bitwiseEvenOdd{
    public static boolean isEven(int n){
        if((n & 1) == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int n = 1010;
        if(isEven(n) == true){
            System.out.println("true");;

        }
        else{
            System.out.println("false");
        }
    }
}