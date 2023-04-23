package home_work_10_strings_and_collections;

//import java.util.*;

import java.util.HashSet;
import java.util.Set;

public class HomeWork10 {
    public static void processString(String str) {
        /* Розбиваємо рядок по розділових знаках  та видаляємо порожні елементи*/
        String[] words = str.split("[ ,.]+");

        /*Створюємо об'єкт(створення об'єкту класу HashSet, який буде зберігати унікальні слова з вхідної строки)для зберігання унікальних слів */
        Set<String> uniqueWords = new HashSet<>();

        /* Додаємо кожне слово у список, але з перевіркою на унікальність та міняємо на перші літери*/
        for (String word : words) {
            String formattedWord = word.substring(0, 1).toUpperCase() + word.substring(1); /*Для кожного слова word виконується форматування, щоб перша буква була великою, а решта - маленькими. Це робиться за допомогою методу substring() класу String. Перший символ слова береться з допомогою substring(0, 1) та змінюється на велику літеру за допомогою toUpperCase(). Решта символів слова береться з substring(1).*/
            if (!uniqueWords.contains(formattedWord)) {
                uniqueWords.add(formattedWord); /* слово formattedWord перевіряється на наявність унікальності у множині uniqueWords за допомогою методу contains(). Якщо слово не зустрічалося раніше, то воно додається до множини за допомогою методу add()*/
            }
        }

        /*Виводим результат на екран*/
        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }
}

