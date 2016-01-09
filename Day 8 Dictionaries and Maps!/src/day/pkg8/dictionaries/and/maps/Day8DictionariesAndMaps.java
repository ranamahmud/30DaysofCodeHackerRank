/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day.pkg8.dictionaries.and.maps;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

/**
 *
 * @author rana
 */
public class Day8DictionariesAndMaps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Object> x = new HashMap<>();
        int N = in.nextInt();
        in.nextLine();
        for (int i = 0; i < N; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            x.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            if (x.containsKey(s)) {
                System.out.println(s + "=" + x.get(s));
            }
            else{
                System.out.println("Not found");
            }
        }
    }

}
