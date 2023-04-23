package hw_7_version_2;

import java.util.Arrays;

public class ArraysMethods {
    public static int[] addElement(int[] array, int value) {
        int[] newArray = new int[array.length + 1];
        newArray[0] = value;
        System.arraycopy(array, 0, newArray, 1, array.length);
        return newArray;
    } /*цей метод додає елемент value на початок масиву array. Він створює новий
     масив newArray, який містить value на першому місці, а всі інші елементи копіює з масиву array за допомогою
     методу System.arraycopy.*/

    public static int[] addElement(int[] array, int value, int position) {
        int[] result = Arrays.copyOf(array, array.length + 1);
        System.arraycopy(result, position, result, position + 1, array.length - position);
        result[position] = value;
        return result;
    } /*цей  метод  додає елемент value на позицію position в масиві array.
     Він створює новий масив result з довжиною array.length + 1, копіює всі елементи до позиції position з масиву
     array в result, додає value на позицію position в result, а потім копіює всі елементи після позиції position
     з масиву array в result за допомогою методу System.arraycopy*/

    public static int[] addElement(int[] array, int value, Integer... position) {
        if (position.length == 0) {
            return addElement(array, value);
        } else {
            int pos = position[0];
            int[] newArray = new int[array.length + 1];
            System.arraycopy(array, 0, newArray, 0, pos);
            newArray[pos] = value;
            System.arraycopy(array, pos, newArray, pos + 1, array.length - pos);
            return newArray;
        }
    } /*цей метод додає елемент value на список позицій position в масиві array. Якщо список позицій порожній,
    то метод викликає перший метод addElement(int[] array, int value) для додавання елемента на початок масиву.
     Якщо список позицій не порожній, то метод перебирає всі позиції в списку position, додає value на кожну позицію
     за допомогою другого методу addElement(int[] array, int value, int position) та повертає остаточний масив.*/
}