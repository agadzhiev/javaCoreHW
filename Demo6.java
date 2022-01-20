package ru.geekbrains.qa.java2.lesson2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* Презентация "Проброс исключений" */
public class Demo6 {

    public static void main(String[] args) {

    }

    private static int division(int a, int b) throws ArithmeticException {
        return a / b;
    }

    private static void ioExceptionExample() throws FileNotFoundException {
        File file = new File("file.txt");
        InputStream in = new FileInputStream(file);
    }

}
