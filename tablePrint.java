import java.util.*;
public class tablePrint {
    static void tableprint(int n, Integer ... val){
        int i = 1;
        if(val.length != 0)
            i = val[0];
        if( i == 11)
            return;
        System.out.println(n + "*" + i + "=" + n*i);
        i++;
        tableprint(n, i);
    }
    public static void main(String[] args) {
        int n = 5;
        tableprint(n);

    }
}
