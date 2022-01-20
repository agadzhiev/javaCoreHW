package ru.geekbrains.qa.java2.lesson2.Homework;

public class ArrayCheck {
    private String[][] strings;

    public void setStrings(String[][] strings) {
        try {
            checkSizeArray(strings);
            this.strings = strings;
        } catch (MyArraySizeException e){
            e.printStackTrace();
        }catch (NullPointerException ne){
            ne.printStackTrace();
        }
    }

    private void checkSizeArray(String[][] strings) throws MyArraySizeException{
        if (strings.length !=4 || checkLenghtStrings(strings)){
            throw new MyArraySizeException("Размер массива соответсвует 4х4");
        }
    }

    private boolean checkLenghtStrings(String[][] strings){
        for (String[] str: strings){
            if (str.length!=4){return true;}
        }
        return false;
    }

    public void summ(){
        if (strings == null){
            System.out.println("У класса не инициализирован массив строк, суммировать нечего");
            return;
        }

        try {
            summArray();
        } catch (MyArrayDataException e){
            e.printStackTrace();
        }
    }


    private void summArray() throws MyArrayDataException {
        int result = 0;
        for (int i = 0; i < strings.length; i++) {
            String[] str= strings[i];
            for (int j = 0; j < str.length; j++) {
                try {
                    result+=Integer.parseInt(str[j]);
                }
                catch (NumberFormatException e){
                    throw new MyArrayDataException("Массив содержить не только числа, суммирование невозмонжо.");
                }
            }

        }
        System.out.println("Сумма элементов массива: " + result);
    }


}
