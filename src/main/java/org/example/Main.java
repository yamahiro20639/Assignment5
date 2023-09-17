package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<>();
        name.add("田中");
        name.add("佐々木");
        name.add("鈴木");
        name.add("佐藤");
        name.add("高木");
        ArrayList<String> result = new ArrayList<>();

        for (String person : name) {
            if (person.contains("木")) {
                result.add(person);
            }
        }
        System.out.println(result);
    }
}