package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
          // Car деген класс тузунуз (Id, номер авто)
         // Дагы бир класс тузунуз, ал класста машинанын данныйлары сакталат (год выпуска, модель, цена, цвет)
        // HashMap тузунуз ключ - машина, маани - машинанын данныйлары
       // HashMap ти толтуруп кайра entrySet деген методун колдонуп баардык элементтерин консольго чыгарыныз.



        Car car = new Car(1,312);

        HashMap<Integer,Car>  infoCarHashMap = new HashMap<>();
        infoCarHashMap.put(1,car);
        System.out.println(infoCarHashMap);

        Info info = new Info(2010,"BMW",950000,"чёрный");

        HashMap<Integer,Info> infoHashMap = new HashMap<>();
        infoHashMap.put(1,info);

        for (Map.Entry<Integer, Info> entry:infoHashMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}