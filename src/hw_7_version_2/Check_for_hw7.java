package hw_7_version_2;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Check_for_hw7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = 10;
        int upperBound = 100;
        int[] originalArray = new int[size]; // зберігаємо початковий масив в змінну originalArray
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            originalArray[i] = random.nextInt(upperBound);
        }
        System.out.println("Random array: " + Arrays.toString(originalArray));/*наш початковий масив*/

        /*rule:you can enter only numbers*/
        int value = 0;
        System.out.println("Please, enter your Special number");
        if (scanner.hasNextInt()) {
            value = scanner.nextInt();
            originalArray = ArraysMethods.addElement(originalArray, value, 0); // передаємо originalArray замість initialArray
            System.out.println("our  Special number" + Arrays.toString(originalArray));

        } else {
            System.out.println("You can enter only numbers");
            System.exit(0);
        }

        /*rule: check position, if not int - go out from program*/
        int position = 0;
        System.out.println("Enter number of position");
        if (scanner.hasNextInt()) {
            position = scanner.nextInt();
        } else {
            System.out.println("You can enter only numbers for position");
            System.exit(0);
        }

        if (position == 0) {
            // додавання елементу на початок масиву
            originalArray = ArraysMethods.addElement(originalArray, value);
            System.out.println("Show our Special number before massive if our position = '0': " + Arrays.toString(originalArray));
        } else {
            originalArray = ArraysMethods.addElement(originalArray, value, position);
            System.out.println("Show all numbers with our Special number to our Position: " + position + ",  our massive: " + Arrays.toString(originalArray));
        }

        System.out.println("----------------------------------------------");

        /*rule: check position, if not int - go out from program*/
        System.out.println("Enter another number of position");
        if (scanner.hasNextInt()) {
            position = scanner.nextInt();
        } else {
            System.out.println("You can enter only numbers for position");
            System.exit(0);
        }

        originalArray = ArraysMethods.addElement(originalArray, value, position);
        System.out.println("Show all numbers with our Special number to our Position: " + position + ",  our massive: " + Arrays.toString(originalArray));

        scanner.close();
    }
}

