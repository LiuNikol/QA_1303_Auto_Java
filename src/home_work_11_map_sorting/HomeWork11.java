package home_work_11_map_sorting;

import java.util.Map;
import java.util.TreeMap;

public class HomeWork11 {
    public static void printMap(Map<Integer, String> map) {  /*Оголошення методу з назвою printMap, що приймає мапу з ключами типу Integer та значеннями типу String, та не повертає жодного значення.*/
        TreeMap<Integer, String> sortedMap = new TreeMap<>(map); /*Створення нового TreeMap, який буде містити елементи мапи map, переданої в метод. Ключі та значення будуть відсортовані за зростанням ключа.*/
        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) { /* Цикл for, що проходить крізь кожен елемент відсортованого TreeMap. Для кожного елементу зберігається відповідна пара ключ-значення в об'єкті типу Map.Entry<Integer, String>.*/
            System.out.println("key" + entry.getKey() + "=" +"value" + entry.getValue()); /*Вивід y консоль пари ключ-значення в форматі "ключ=значення"*/
        }
    }
}