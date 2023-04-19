package home_work_7_add_element_to_masive;

import java.util.Arrays;

public class arrays_details {
    public static int[] arrayMister(int[] array, int value) {
        array[0] = value;
        return array;
    }

    public static int[] arrayMister(int[] array, int value, int position) {
        array[position] = value;
        return array;
    }

    public static int[] arrayMister(int[] array, int value, int[] position) {

            if (position.length > array.length || position[0] >= array.length || position[0] < 1) {
                throw new IllegalArgumentException("Invalid position: " + position[0]);
            }
            int[] result = Arrays.copyOf(array, array.length + 1);
            System.arraycopy(result, position[0] - 1, result, position[0], array.length - position[0] + 1);
            result[position[0] - 1] = value;
            return result;
        }
    }
