import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] l = s.trim().split("[!,?._'@\\s]+");
        if(l.length==1 && l[0].isEmpty()){
            System.out.println("nothing");
        } else {
            System.out.println(l.length);
            for(String token : l) {
                System.out.println(token);
            }
        }

        scan.close();
    }
}

