package java_atestat;

import java.util.HashMap;

public class NotebookController {

    HashMap<Integer, Notebook> notebooks = new HashMap<>();

    // in future ID must be auto setable
    // Check
    public Notebook addNotebook(int id, String model, String name, String ram, String hdd, String screenSize) {
        if (notebooks.containsKey(id)) {
            System.out.println("There is a notebook with such id");
            return null;
        }
        Notebook notebook = new Notebook(id, model, name, ram, hdd, screenSize);
        notebooks.put(id, notebook);
        // is there 2 time typing ID??
        // CHECK
        System.out.println("New notebook has been added");
        return notebook;
    }

    // by ---- name, ram, hdd, screenSize
    public Notebook getBy(String by, String attribute) {
        // in this method in future add List of founded notebooks, there can be more
        // than one found ...
        // Check
        for (Notebook notebook : notebooks.values()) {
            switch (by) {
                case "name":
                    if (notebook.name.equals(attribute)) {
                        return notebook;
                    }
                    break;
                case "ram":
                    if (notebook.ram.equals(attribute)) {
                        return notebook;
                    }
                    break;
                case "hdd":
                    if (notebook.hdd.equals(attribute)) {
                        return notebook;
                    }
                    break;
                case "screenSize":
                    if (notebook.screenSize.equals(attribute)) {
                        return notebook;
                    }
                    break;
                default:
                    System.out.println("Invalid attribute specified");
                    return null;
            }
        }
        System.out.println("There is no notebook with " + by + "-----" + attribute);
        return null;
    }

    public void printAllNotebooks() {
        if (notebooks.isEmpty()) {
            System.out.println("No notebooks available.");
        } else {
            for (Notebook notebook : notebooks.values()) {
                System.out.println(notebook);
            }
        }
    }

    public void filterByRam(int ramMin, int ramMax) {
        // no filter from 10 to 0 ...
        if (ramMin > ramMax) {
            ramMax = ramMin;
        }
        for (Notebook notebook : notebooks.values()) {
            if (Integer.valueOf(notebook.ram) > ramMin && Integer.valueOf(notebook.ram) < ramMax) {
                System.out.println(notebook);
            }
        }
    }

}
