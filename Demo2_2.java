package ru.geekbrains.qa.java2.lesson2;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* Презентация "Иерархия исключений". Иллюстрация checked exceptions */
public class Demo2_2 {

    public static void main(String[] args) {
        File file = new File("file.txt");
//        InputStream in = new FileInputStream(file); // Разобрать подсветку ошибки в IDEA и перейти к след.слайду
    }

}

/*
       Давайте посмотрим на то, как компилятор сообщает о необходимости обработки checked исключений.
       На слайде с иерархией исключений особое место занимает IOException

       Работу с файловой системой и потоком ввода-вывода мы с вами обязательно затронем в дальнейшем по курсу,
       но сейчас давайте напишем две строчки кода, которые дадут нам отличный жизненный пример получения checked exception
 */

