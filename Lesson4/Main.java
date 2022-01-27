package ru.geekbrains.qa.java2.lesson2.Lesson4;

public class Main {
    public static void main(String[] args) {
        PhoneBook();
        WordsArray wordsArray = new WordsArray((String[]) createArrayOfWords());
        wordsArray.doArrayWords();

    }

    private static void PhoneBook() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addElementPhoneBook ("One", "89099099090");
        phoneBook.addElementPhoneBook ("Two", "89099091290");
        phoneBook.addElementPhoneBook ("One", "89099123099");
        phoneBook.addElementPhoneBook ("Three", "89299091220");
        phoneBook.addElementPhoneBook ("Two", "89199123190");
        phoneBook.addElementPhoneBook ("Four", "89009091290");
        phoneBook.addElementPhoneBook ("Four", "89779123090");

        System.out.println("One " + phoneBook.getPhonesByName("One"));
        System.out.println("Two " + phoneBook.getPhonesByName("Two"));
        System.out.println("Three " + phoneBook.getPhonesByName("Three"));
        System.out.println("Four " + phoneBook.getPhonesByName("Four"));
    }

    private static Object createArrayOfWords() {
        String [] strings = new String[10];
        strings[0] = "Ноль";
        strings[1] = "Один";
        strings[2] = "Два";
        strings[3] = "Папа";
        strings[4] = "Шесть";
        strings[5] = "Папа";
        strings[6] = "Мама";
        strings[7] = "Два";
        strings[8] = "Три";
        strings[9] = "Три";
        return strings;
    }

}
