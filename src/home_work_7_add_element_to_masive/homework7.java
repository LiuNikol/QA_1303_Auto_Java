package home_work_7_add_element_to_masive;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class homework7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { // додаємо безкінечний цикл, щоб можна було повторно запустити програму

            /*create random massive (массив) --- У цьому прикладі ми створюємо об'єкт класу
            Random і використовуємо метод nextInt() для отримання рандомного
            числа. За допомогою циклу for ми заповнюємо масив
            array рандомними числами. Для виведення масиву на екран
            ми використовуємо метод toString() класу Arrays.*/
            int size = 10;/*кількість показаних цифр */
            int upperBound = 100;/*які цифри можуть бути*/
            int[] array = new int[size];
            Random random = new Random();/*умова рандом*/
            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(upperBound);
            }
            System.out.println("Random array: " + Arrays.toString(array));/*наш створений масив*/

            /*rule:you can enter only numbers*/
            int value = 0;
            System.out.println("Please, enter your Special number");
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
            } else {
                System.out.println("You can enter only numbers");
                System.exit(0);
            }

            /*rule: check position, if not int - go out from program*/
            int position = -1;
            System.out.println("Enter number of position");
            if (scanner.hasNextInt()) {
                position = scanner.nextInt();
            } else {
                System.out.println("You can enter only numbers for position");
                System.exit(0);
            }


            /*show what we created from begin "create random massive (массив)"*/
            System.out.println("Show all numbers from massive: " + Arrays.toString(array));

            System.out.println("----------------------------------------------");

            if (position == 0) {
                // додавання елементу на початок масиву
                int[] newArray = new int[array.length + 1];
                newArray[0] = value;
                System.arraycopy(array, 0, newArray, 1, array.length);
                array = newArray;
                System.out.println("Show our Special number before massive if our position = '0': " + Arrays.toString(array));
                // додавання елементу на позицію в масиві
            } else {
                int[] positionArray = {position};
                array = arrays_details.arrayMister(array, value, positionArray); // update the array with new value at the given position
                System.out.println("Show all numbers with our Special number to our Position: " + position + ",  our massive: " + Arrays.toString(array));
            }

            System.out.println("----------------------------------------------");


            /* блок запиту на повторний запуск програми */
            System.out.println("Do you want to restart the program? (Y/N)");
            String answer = scanner.next();
            if (!answer.equalsIgnoreCase("Y")) { // якщо користувач відповів не Y, то вихід з програми
                break; // вихід із циклу
            }
        }
    }
}