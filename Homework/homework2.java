package ru.geekbrains.qa.java2.lesson2.Homework;

import org.w3c.dom.ls.LSOutput;

public class homework2 {

    public static void main(String[] args) {
        String [][] strings = createArray();
        ArrayCheck arrayCheck = new ArrayCheck();
        arrayCheck.setStrings(strings);

        arrayCheck.summ();

    }

    private static String [][] createArray(){
        String [][] array = new String[4][4];
        for (int i = 0; i < array.length; i++,System.out.println()) {
            for (int j = 0; j < array[i].length; j++) {

                array[i][j]= String.valueOf((int)(Math.random()*10));
                System.out.println(array[i][j] + " ");
            }

        }



        return array;
    }
}
