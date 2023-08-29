import java.util.*;
import java.io.*;

class ifElse{
    
    static void check(int num){
        if(num % 2 != 0){
            System.out.println("Weird");        
        }
        
        if(num % 2 == 0){
            if(num >= 2 && num <= 5){
                System.out.println("Not Weird");
            }
            if(num >= 6 && num<=20){
                System.out.println("Wierd");
            }
            if(num > 20){
                System.out.println("Not Wierd");
            }
    }
}
    public static void main(String args []){
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        check(num);
        
        int num1 = sc.nextInt();
        check(num1);
        }
}
