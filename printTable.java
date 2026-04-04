import java.io.*;
public class printTable {
    public static void printtable(int n){
        for(int i=1; i<=10; i++){
            System.out.println(n + "*" + i + "=" + n * i);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        printtable(n);
    }
}
