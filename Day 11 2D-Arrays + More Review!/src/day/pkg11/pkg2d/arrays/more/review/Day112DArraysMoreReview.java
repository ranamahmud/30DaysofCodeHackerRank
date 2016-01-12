package day.pkg11.pkg2d.arrays.more.review;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Md. Rana Mahmud
 */
public class Day112DArraysMoreReview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int sum, result = -99999;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                sum = arr[i - 1][j - 1] + arr[i - 1][j] + arr[i - 1][j + 1]
                        + arr[i][j] + arr[i + 1][j - 1] + arr[i + 1][j]
                        + arr[i + 1][j + 1];
                if (sum > result) {
                    result = sum;
                }

            }

        }
        System.out.println(result);
    }

}
