class SumOfNatural {
    static int natural(int n){
        return n*(n+1)/2;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(natural(n));
    }
}


// Second methon

class Sumfind {
    static int findSum(int n){
        int Sum = 0;
        for(int i = 1; i<=n; i++){
            Sum = Sum+i;
        }
        return Sum;
    }
    public static void main(String[] args){
        int n = 10;
        System.out.println(findSum(n));
    }
}

// Third way by using recursion 

class FindSum {
    static int Sum(int n){
        if(n == 1)
            return 1;
        return n + Sum(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(Sum(n));
    }
}