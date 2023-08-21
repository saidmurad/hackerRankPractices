import java.util.Scanner;

public class ScannerDemo {
    // this demo used to demonstrate using nextline canner method to print keybord's inputs.
    // if we use next method first then nextline method, the cursor will be set to new line character
    // position so we get empty that is not parsed ot double data type.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = Integer.parseInt(scan.nextLine()) ;
        double d = Double.parseDouble(scan.nextLine());
        String s = scan.nextLine();
        // Write your code here.
       System.out.println("String: " + s);
       System.out.println("Double: " + d);
       System.out.println("Int: " + i);
    }
}