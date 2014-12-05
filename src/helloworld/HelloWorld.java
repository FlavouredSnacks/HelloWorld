/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author Slugs
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        shout("hello");
        System.out.println("The sum is: " + add(550, 575));
        System.out.println("The sum is: " + multiply(40, 231));
        System.out.println("The sum is: " + divide(40, 275));

        Pumpkin myPumpkin = new Pumpkin();
        System.out.println("Pumpkin name is " + myPumpkin.getName());
        System.out.println("Pumpkin color is " + myPumpkin.getColor());
        System.out.println("Pumpkin weight is " + myPumpkin.getweight());
        System.out.println("The sum is:" + square(5));

    }

    public static void speak(String text) {
        System.out.println(text);
    }

    public static void shout(String abcd) {
        System.out.println(abcd.toUpperCase() + "!!!");
    }

    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static int multiply(int number1, int number2) {
        return number1 * number2;
    }

    public static int divide(int number1, int number2) {
        return number1 / number2;
    }

    public static int square(int number1) {
        return number1 * number1;
    }
}