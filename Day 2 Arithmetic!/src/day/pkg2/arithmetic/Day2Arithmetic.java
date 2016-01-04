/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day.pkg2.arithmetic;

import static java.lang.Math.round;
import java.util.Scanner;

/**
 *
 * @author rana
 */
public class Day2Arithmetic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double M;
        int T,X;
        M  = sc.nextDouble();
        T = sc.nextInt();
        X = sc.nextInt();
        double finalPrice = M + (T*M)/100+(X*M)/100;
        System.out.println("The final price of the meal is $"+round(finalPrice)+".");
    }
    
}
