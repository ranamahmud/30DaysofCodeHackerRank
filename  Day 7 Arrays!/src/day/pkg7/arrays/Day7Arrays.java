/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day.pkg7.arrays;

import java.util.Scanner;

/**
 *
 * @author rana
 */
public class Day7Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        for(int j = N-1;j>=0;j--)
            System.out.print(arr[j]+" ");
        System.out.println();
    }

}
