/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day.pkg3.pkgif.pkgelse.statements;

import java.util.Scanner;

/**
 *
 * @author rana
 */
public class Day3IfElseStatements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();            
            String ans = null;
            if(n%2==1)ans = "Weird";
            else
            {
               if(n>=2&&n<=5)
                   ans = "Not Weird";
               if(n>=6&&n<=20)
                   ans = "Weird";
               if(n>20)
                   ans = "Not Weird";
                
            }
            System.out.println(ans);
    }
    
}
