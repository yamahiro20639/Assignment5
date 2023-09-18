package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<>();
        name.add("田中");
        name.add("佐々木");
        name.add("鈴木");
        name.add("佐藤");
        name.add("高木");

        List<String> result = name.stream().filter(list -> list.contains("木")).toList();
        System.out.println(result);
    }
}