import java.util.InputMismatchException;
import java.util.Scanner;

public class HW7 {
    public static void answer() {
        System.out.println(" Welcome to My Mini Project ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Size of Array : ");
        try {
            int size = input.nextInt();
            int[] array = new int[size];
            int choice;
            do {
                System.out.println("-----------------------------");
                System.out.println("Please Choose one of the following options : " + "\n" + "1. Enter element in array" + "\n" + "2. Print array " + "\n" + "3. Searching" + "\n" + "4. Sort in array" + "\n" + "5.To Exit");
                choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter the element to be inserted : ");
                        for (int index = 0; index < size; index++) {
                            array[index] = input.nextInt();
                        }
                        break;
                    case 2:
                        for (int index = 0; index < array.length; index++) {
                            System.out.println("--> " + array[index]);
                        }
                        break;
                    case 3:
                        System.out.println("Enter the element to be searched : ");
                        int element = input.nextInt();
                        boolean isFound = false;
                        for (int index = 0; index < array.length; index++) {
                            if (array[index] == element) {
                                System.out.println("--> " + array[index] + " is Found");
                                isFound = true;
                                break;
                            }
                        }
                        if (!isFound) {
                            System.out.println("--> " + element + " is Not Found");
                        }
                        break;
                    case 4:
                        int temp = 0;
                        try {
                            for (int index = 0; index < array.length; index++) {
                                for (int j = index + 1; j < array.length; j++) {
                                    if (array[j] > array[index]) {
                                        temp = array[index];
                                        array[index] = array[j];
                                        array[j] = temp;
                                    }
                                }
                            }
                            for (int index = 0; index < array.length; index++) {
                                System.out.println("--> " + array[index]);
                            }
                        } catch (ArrayIndexOutOfBoundsException e3) {
                            System.out.println(e3.getMessage());
                        }

                        break;
                    case 5:
                        System.out.println("-----------------------------");
                        System.out.println("Thank you for using My Mini Project");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invaild input");
                }
            } while (choice != 5);
        } catch (InputMismatchException e) {
            System.out.println("Invaild input");
            System.out.println("-------------------");
        } catch (NegativeArraySizeException e3) {
            System.out.println("User only positive number :");
        } catch (Exception e2) {
            System.out.println(e2.getMessage());
        }

    }

}
