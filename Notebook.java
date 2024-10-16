package java_atestat;

import java.util.HashMap;
import java.util.ArrayList;

public class Notebook {
    // Задание 1. Поиск ноутбуков
    // Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
    // методы.
    // -Создать множество ноутбуков.
    // -Написать метод, который будет запрашивать у пользователя критерий (или
    // критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии
    // фильтрации можно хранить в Map.

    int id;
    String model;
    String name;
    String ram;
    String hdd;
    String screenSize;

    public Notebook(int id, String model, String name, String ram, String hdd, String screenSize) {
        this.id = id;
        this.model = model;
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Notebook{id=" + id + ", model='" + model + "', name='" + name + "', ram='" + ram + "', hdd='" + hdd
                + "', screenSize='" + screenSize + "'}";
    }

    HashMap<Integer, ArrayList<Notebook>> notebooks = new HashMap<>();

    public void addNoteBook(int id, String model, String name, String ram, String hdd, String screenSize) {
        if (notebooks.containsKey(id)) {
            System.out.println("There is notebook with such ID in shop");
        }
        ArrayList<Notebook> newList = new ArrayList<>();
        newList.add(new Notebook(id, model, name, ram, hdd, screenSize));
        notebooks.put(id, newList);
    }
    
    // public Notebook getByName(String name) {
    //     for (ArrayList<Notebook> notebookList : notebooks.values()) {
    //         for (Notebook notebook : notebookList) {
    //             if (notebook.name.equals(name)) {
    //                 return notebook;
    //             }
    //         }
    //     }
    //     System.out.println("There is no notebook with such name");
    //     return null;
    // }

}
