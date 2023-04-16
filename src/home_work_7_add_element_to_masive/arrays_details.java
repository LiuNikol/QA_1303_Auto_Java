package home_work_7_add_element_to_masive;

import java.util.Arrays;

public class arrays_details {
    public static int [] arrayMister(int[] array, int value) {
        array[0] = value;
        return array;
    }
    public static int[] arrayMister(int[] array, int value, int position) {
        array[position] = value;
        return array;
    }
    public static int[] arrayMister(int[] array, int value, int[] position) {
        /*а як зробити щоб position при умові 2, ставало число на місце 1 - бо номерація починається з 0 -
Для цього в методі arrayMister потрібно замінити position[0] на position[0]-1
у виразі result[position[0]] = value;. Також в умові перевірки потрібно змінити
position[0] < 0 на position[0] < 1, щоб не дозволяти вставляти елементи на позицію перед початком масиву
Цей метод замінить елемент на позиції position[0] на заданий елемент value і поверне новий масив зі
зміненим елементом. Якщо позиція
 position[0] виходить за межі масиву або менша за 1, метод викине виключення IllegalArgumentException.*/

        if (position.length > array.length || position[0] >= array.length || position[0] < 1) {
            throw new IllegalArgumentException("Invalid position: " + position[0]);
        }
        int[] result = Arrays.copyOf(array, array.length + 1);
        System.arraycopy(result, position[0]-1, result, position[0], array.length - position[0]+1);
        result[position[0]-1] = value;
        return result;
    }
}