/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day.pkg5.loops;

import java.util.Scanner;

/**
 *
 * @author rana
 */
public class Day5Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int T,a,b,N,sum;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        while(T-->0){
            sum = 0;
            a = sc.nextInt();
            b = sc.nextInt();
            N = sc.nextInt();
            sum = a;
            for(int i = 0; i<N; i++){
                sum+=Math.pow(2, i)*b;
                System.out.print(sum+" ");
               
            }
            System.out.println();
        }
    }
    
}
