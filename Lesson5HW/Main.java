package ru.geekbrains.qa.java2.lesson2.Lesson5HW;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        AppData data = new AppData();
        data.readFromFail("test.csv");
        System.out.println(Arrays.toString(data.getHeader()));
        System.out.println(Arrays.toString(data.getData()));
        data.writeToCSV("my_test.csv");
    }
}
