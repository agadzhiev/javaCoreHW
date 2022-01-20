package ru.geekbrains.qa.java2.lesson2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* Презентация "Перехват исключений". Демонстрация перехвата исключений */
public class Demo3 {

    public static void main(String[] args) {

        File file = new File("file.txt");
        try {
            InputStream in = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        System.out.println(division(6, 0));
    }

    private static int division(int a, int b) {
        // Продемонстрировать работу функции. Спросить у аудитории какой минус они видят в реализации
        try {
            return a / b;
        } catch (ArithmeticException thisIsJustVariableICanCallItHowIWant) {
            return 0;
        }
    }

}

/*
       Существует несколько способ перехвата исключений. Начнем с конструкции try-catch

       1) Перехватить FileNotFound из примера Demo2_2
       2) Вернуться к примеру из Demo1

 */