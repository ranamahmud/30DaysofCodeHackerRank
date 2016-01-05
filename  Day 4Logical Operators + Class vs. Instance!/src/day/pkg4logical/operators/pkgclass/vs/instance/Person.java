/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day.pkg4logical.operators.pkgclass.vs.instance;

/**
 *
 * @author rana
 */
public class Person {

    int age;

    public Person(int initial_Age) {

        age = initial_Age;
        if (age < 0) {
            age = 0;
            System.out.println("This person is not valid, setting age to 0.");
        }
    }

    public void amIOld() {
        if (age < 13) {
            System.out.println("You are young.");
        } else if (age >= 13 && age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }

    public void yearPasses() {
        age++;
    }
}
