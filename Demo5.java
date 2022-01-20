package ru.geekbrains.qa.java2.lesson2;

/* Презентация "Ручной выброс исключений" */
public class Demo5 {

    public static void main(String[] args) {
        System.out.println(division(6, 0));
    }

    private static int division(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("/ by zero!");
        }
        return a / b;
    }

}
