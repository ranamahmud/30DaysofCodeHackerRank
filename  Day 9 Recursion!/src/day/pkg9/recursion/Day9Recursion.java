/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day.pkg9.recursion;

import java.util.Scanner;

/**
 *
 * @author rana
 */
public class Day9Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //Take Input
        int gcd = find_gcd(a, b);
        System.out.println(gcd);
    }

    static int find_gcd(int a, int b) {

        if (b == 0) {
            return a;
        } else {
            return find_gcd(b, a % b);
        }
    }
}
