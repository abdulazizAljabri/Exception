import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.exit;

public class Calculator {
    public static void main(String[] args) {
        ArrayList finalResult = new ArrayList();
        double result = 0;
        Scanner input = new Scanner(System.in);
        System.out.println(" Welcome to My Calculator : ");
        try {
            int choice;
            do {
                System.out.println("Choose of the following operations " + "\n" + "1.add " + "\n" + "2.subtract " + "\n" + "3.multpli " + "\n" + "4.divide " + "\n" + "5.modulus " + "\n" + "6.find minimum" + "\n" + "7.find maximum" + "\n" + "8.find average" + "\n" + "9.print last result" + "\n" + "10.print all results");
                choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Please enter First number");
                        int number1 = input.nextInt();
                        System.out.println("Please enter Second number");
                        int number2 = input.nextInt();
                        result = addition(number1, number2);
                        finalResult.add(result);
                        break;
                    case 2:
                        System.out.println("Please enter First number");
                        number1 = input.nextInt();
                        System.out.println("Please enter Second number");
                        number2 = input.nextInt();
                        result = subtraction(number1, number2);
                        finalResult.add(result);
                        break;
                    case 3:
                        System.out.println("Please enter First number");
                        number1 = input.nextInt();
                        System.out.println("Please enter Second number");
                        number2 = input.nextInt();
                        multiplication(number1, number2);
                        result = multiplication(number1, number2);
                        System.out.println(number1 + " * " + number2 + " = " + result);
                        finalResult.add(result);
                        break;
                    case 4:
                        System.out.println("Please enter First number");
                        number1 = input.nextInt();
                        System.out.println("Please enter Second number");
                        number2 = input.nextInt();
                        division(number1, number2);
                        result = division(number1, number2);
                        System.out.println(number1 + " / " + number2 + " = " + result);
                        finalResult.add(result);
                        break;
                    case 5:
                        System.out.println("Please enter First number");
                        number1 = input.nextInt();
                        System.out.println("Please enter Second number");
                        number2 = input.nextInt();
                        modulus(number1, number2);
                        result = modulus(number1, number2);
                        System.out.println(number1 + " % " + number2 + " = " + result);
                        finalResult.add(result);
                        break;
                    case 6:
                        System.out.println("Please enter First number");
                        number1 = input.nextInt();
                        System.out.println("Please enter Second number");
                        number2 = input.nextInt();
                        minimum(number1, number2);
                        result = minimum(number1, number2);
                        System.out.println(number1 + "minimum" + number2 + " = " + result);
                        finalResult.add(result);
                        break;
                    case 7:
                        System.out.println("Please enter First number");
                        number1 = input.nextInt();
                        System.out.println("Please enter Second number");
                        number2 = input.nextInt();
                        maximum(number1, number2);
                        result = maximum(number1, number2);
                        System.out.println(number1 + "maximum" + number2 + " = " + result);
                        finalResult.add(result);
                        break;
                    case 8:
                        System.out.println("Please enter First number");
                        number1 = input.nextInt();
                        System.out.println("Please enter Second number");
                        number2 = input.nextInt();
                        average(number1, number2);
                        result = average(number1, number2);
                        System.out.println(" The Average of " + number1 + " and " + number2 + " is " + result);
                        finalResult.add(result);
                        break;
                    case 9:
                        printLastResult(finalResult);
                        exit(0);
                        break;
                    case 10:
                        System.out.println(finalResult);
                        exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            } while (choice != 10);

        } catch (InputMismatchException e1) {
            System.out.println("Please enter number between 1 and 10");
        } catch (ArithmeticException e3) {
            System.out.println(e3.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


    public static int addition(int number1, int number2) {
        int result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        return result;
    }

    public static int subtraction(int number1, int number2) {
        int result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        return result;
    }

    public static int multiplication(int number1, int number2) {
        int result = number1 * number2;
        return result;
    }

    public static double division(int number1, int number2) {
        int result = number1 / number2;
        return result;
    }

    public static int modulus(int number1, int number2) {
        int result = number1 % number2;
        return result;
    }

    public static int minimum(int number1, int number2) {
        int result = Math.min(number1, number2);
        return result;
    }

    public static int maximum(int number1, int number2) {
        int result = Math.max(number1, number2);
        return result;
    }

    public static double average(int number1, int number2) {
        double result = (double) number1 + (double) number2 / 2;
        return result;
    }

    public static void printLastResult(ArrayList<Integer> finalResult) {
        System.out.println(finalResult.get(finalResult.size() - 1));
    }

}
