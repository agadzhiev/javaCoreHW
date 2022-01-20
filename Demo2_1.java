package ru.geekbrains.qa.java2.lesson2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Презентация "Иерархия исключений". Иллюстрация различных исключений на практике */
public class Demo2_1 {

    public static void main(String[] args) {
        /* Демонстрация uncatched (Errors, Runtime exceptions) */

//        ErrorDemo.getOutOfMemoryError();
//        ErrorDemo.getStackOverFlowError();

//        RuntimeExceptionDemo.getArrayIndexOutOfBoundsException();
//        RuntimeExceptionDemo.getStringIndexOutOfBoundsException();
//        RuntimeExceptionDemo.getClassCastException();
//        RuntimeExceptionDemo.getNullPointerException();
//        RuntimeExceptionDemo.getInputMismatchException(); // print 'hello'
    }

    static class ErrorDemo {

        public static void getOutOfMemoryError() {
            List<Object[]> arrays = new ArrayList<>();
            while (true) {
                arrays.add(new Object[1_000_000_000]);
            }
        }

        public static void getStackOverFlowError() {
            getStackOverFlowError();
        }
    }

    static class RuntimeExceptionDemo {

        public static void getArrayIndexOutOfBoundsException() {
            int[] arr = {1, 2, 3};
            int i = arr[3];
        }

        public static void getStringIndexOutOfBoundsException() {
            String name = "Jack";
            System.out.println(name.charAt(5));
        }

        public static void getClassCastException() {
            Object a = 1;
            String b = (String) a;
        }

        public static void getNullPointerException() {
            String name = null;
            System.out.println(name.length());
        }

        public static void getInputMismatchException() {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            System.out.println(number);
        }
    }
}
