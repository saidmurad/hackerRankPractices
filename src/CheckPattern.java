import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

public class CheckPattern
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        String[] temp = new String[testCases];
        int count = 0;
        if(testCases>0){
            while (count < testCases) {
                String pattern = in.nextLine();
                temp[count] = pattern;
                count++;
            }

        }
        for(String s: temp) {
            try {
                Pattern.compile(s);
                System.out.println(s);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }

        }
    }
}



