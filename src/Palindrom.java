import java.io.*;
import java.util.*;

public class Palindrom {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        System.out.println(new StringBuilder(A));
        System.out.println(new StringBuilder(A).reverse());
        if(new StringBuilder(A).toString().equals(new StringBuilder(A).reverse().toString())) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        /* Enter your code here. Print output to STDOUT. */

    }
}



