import java.util.*;
import java.io.*;

class HackChallenge{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int[][] twoDArray = new int[t][3];
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int[] intArray = {a, b, n};
            twoDArray[i] = intArray;
        }

        for(int i =0; i< twoDArray.length; i++) {
            int sum =  twoDArray[i][0];
            for(int j =0; j< twoDArray[i][2]; j++) {
                sum = sum  + (int) ( (Math.pow(2, j))*twoDArray[i][1]);
                System.out.print(sum + " ");
            }
            sum = 0;
            System.out.println();
        }
        in.close();
    }
}