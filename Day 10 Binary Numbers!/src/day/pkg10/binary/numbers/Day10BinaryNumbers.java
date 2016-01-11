package day.pkg10.binary.numbers;

import java.util.Scanner;

/**
 *
 * @author Md. Rana Mahmud
 */
public class Day10BinaryNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = 0;
        int t;
        t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextLong();
            decToBin(n);
        }

    }

    public static void decToBin(long n) {
        String result = "";
        while (n > 0) {
            result += (n % 2);
            n /= 2;
        }
        String reverse = new StringBuffer(result).reverse().toString();
        System.out.println(reverse);
    }

}
