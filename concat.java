import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int j = scan.nextInt();
        System.out.println(sum = i + j );
        
        double sum1 = 0;
        double f = scan.nextDouble();
        System.out.println(sum1 = d + f);
       
       	
        String str = scan.next();
        String str1 = s.concat(str);
        System.out.println(str1);
        scan.close();
    }
}
