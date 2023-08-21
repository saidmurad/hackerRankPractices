import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class OtherScanner {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        ArrayList<String> temp = new ArrayList<>();
        while (scan.hasNext() ) {
            String m = scan.nextLine();
            temp.add(m);

        }
        int i = 1;
        for(String ks : temp) {
            System.out.println(i + " " + ks);
            i++;
        }
    }
}