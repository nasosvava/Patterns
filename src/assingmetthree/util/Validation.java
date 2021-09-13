/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assingmetthree.util;

/**
 *
 * @author Nasos
 */
import java.util.Scanner;

public class Validation {

    private static Scanner scanner = new Scanner(System.in);

    public static int checkingIntegers() {

        int number;

        while (true) {
            try {
                number = Integer.parseInt(scanner.next());

                break;
            } catch (NumberFormatException nfe) {
                System.out.println("Please give only number.");
            }
        }
        return number;
    }

    public static int checkingIntegers(int min, int max) {

        int result = Validation.checkingIntegers();
        boolean quit = false;
        while (!quit) {
            if (result < min || result > max) {
                System.out.println("Please give the right number");
                result = Validation.checkingIntegers();
            } else {
                quit = true;
            }
        }
        return result;
    }

    public static boolean optionsTrueOrFalse() {
        boolean isItYes = false;
        boolean inputIsValid = false;
        while (inputIsValid == false) {
            String input = scanner.next();
            scanner.nextLine();
            switch (input) {
                case "1":
                    isItYes = true;
                    inputIsValid = true;
                    break;
                case "2":
                    isItYes = false;
                    inputIsValid = true;
                    break;
                default:

                    System.out.println("Please coose from option '1' or '2'!");

            }
        }
        return isItYes;
    }

}
