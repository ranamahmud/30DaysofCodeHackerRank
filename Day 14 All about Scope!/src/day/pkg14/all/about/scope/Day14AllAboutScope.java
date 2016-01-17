package day.pkg14.all.about.scope;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Md. Rana Mahmud
 */
class Difference {

    private int[] elements;
    public int maximumDifference;

    Difference(int[] arr) {
        elements = arr;

    }

    public void computeDifference() {
        Arrays.sort(elements);
        maximumDifference = elements[elements.length - 1] - elements[0];
    }

}

public class Day14AllAboutScope {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        Difference D = new Difference(a);

        D.computeDifference();

        System.out.print(D.maximumDifference);
    }

}
