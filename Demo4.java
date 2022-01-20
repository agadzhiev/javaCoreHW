package ru.geekbrains.qa.java2.lesson2;

/* Презентация "Особенности работы с блоками try-catch" */
public class Demo4 {

    public static void main(String[] args) {
        firstSample();
    }

    /* Если один catch сработал, остальные не задействуются */
    public static void firstSample() {
        try {
            int a = 10;
            a -= 10;
            int b = 42 / a;
            int[] с = {1, 2, 3};
            с[42] = 99;
        } catch (ArithmeticException е) {
            System.out.println("Дeлeниe на ноль: " + е);
        } catch (ArrayIndexOutOfBoundsException е) {
            System.out.println("Ошибка индексации массива: " + е);
        }
        System.out.println("Пocлe блока операторов try/catch");
    }

    /* При перехвате исключения определенного типа, мы перехватываем и исключения его подтипов */
    public static void secondSample() {
        try {
            int а = 0;
            int b = 42 / а;
        } catch (Exception е) {
            System.out.println("Exception");
//        } catch (ArithmeticException е) {  <- недостижимый код
            System.out.println("Этот код недостижим");
        }
    }
}
