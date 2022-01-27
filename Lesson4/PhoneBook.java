package ru.geekbrains.qa.java2.lesson2.Lesson4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PhoneBook {
    private HashMap<String, HashSet<String>> phoneBook = new HashMap<>();

    public void addElementPhoneBook (String name, String phone){
        HashSet<String> phones;
        if (phoneBook.containsKey(name)){
            phones= phoneBook.get(name);
        }
        else {
            phones = new HashSet<>();
        }
        phones.add(phone.replaceAll(" ", " "));
        phoneBook.put(name, phones);
    }

    public Set<String> getPhonesByName (String name){
        return phoneBook.get(name);
    }

}
