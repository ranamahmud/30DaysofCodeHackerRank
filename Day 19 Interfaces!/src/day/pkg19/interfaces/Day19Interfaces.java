package day.pkg19.interfaces;

import java.util.Scanner;

/**
 *
 * @author Md. Rana Mahmud
 */
interface AdvancedArithmetic {

    int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {

    int divSum = 0;

    @Override
    public int divisorSum(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divSum += i;
            }
        }
        return divSum;
    }

}

public class Day19Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: AdvancedArithmetic\n" + sum);
    }

}
