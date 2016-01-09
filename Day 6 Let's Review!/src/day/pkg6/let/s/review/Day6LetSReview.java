/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day.pkg6.let.s.review;

import java.util.Scanner;

/**
 *
 * @author rana
 */
public class Day6LetSReview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = n-1; i>=0; i--){
            for(int k = 0;k<i;k++){
                System.out.print(" ");
            }
            for(int j =i; j<n ;j++){
                System.out.print("#");
            }
            System.out.println();
            
        }
    }
    
}
