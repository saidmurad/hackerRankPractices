import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();
        for(int i=0; i< a.length(); i++) {
            char letter = a.charAt(i);
            System.out.println(numberOfCharacter(a, letter));
            System.out.println(numberOfCharacter(b, letter));
            if(numberOfCharacter(a, letter) != numberOfCharacter(b, letter)){
                return false;
            }
            System.out.println(numberOfCharacter(a, letter));
            System.out.println(numberOfCharacter(b, letter));
        }
        return true;
    }
    static int numberOfCharacter(String c, char d) {
        int sum = 0;
        for(int i=0;  i < c.length(); i++) {
            if(c.charAt(i) == d ) {
                sum = sum +1;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}