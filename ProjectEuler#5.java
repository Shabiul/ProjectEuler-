import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static long gcd(long a, long b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }

    public static long lcm(int n){
        long ans = 1;
        for(long i = 1; i <= n; i++){
            ans = (ans * i)/gcd(ans, i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(lcm(n));
        }
    }
}
