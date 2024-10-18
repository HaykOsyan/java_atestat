package java_atestat;

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
        return "Notebook{id=" + id + ", model='" + model + "', name='" + name + "', ram='" + ram + "gb" + "', hdd='"
                + hdd
                + "gb" + "', screenSize='" + screenSize + "`" + "'}";
    }

    // public Notebook getByName(String name) {
    // for (ArrayList<Notebook> notebookList : notebooks.values()) {
    // for (Notebook notebook : notebookList) {
    // if (notebook.name.equals(name)) {
    // return notebook;
    // }
    // }
    // }
    // System.out.println("There is no notebook with such name");
    // return null;
    // }

    public static void main(String[] args) {
        NotebookController controller = new NotebookController();
        controller.addNotebook(1, "Dell", "XPS", "16", "512", "13.3");
        controller.addNotebook(2, "HP", "Spectre", "32", "1024", "15.6");

        Notebook foundNotebook = controller.getBy("name", "XPS");
        if (foundNotebook != null) {
            System.out.println(foundNotebook);
        } else {
            System.out.println("Notebook not found.");
        }

        Notebook hddNotebook = controller.getBy("hdd", "1024");
        if (hddNotebook != null) {
            System.out.println(hddNotebook);
        } else {
            System.out.println("Notebook not found.");
        }
        controller.filterBy("ram", 50, 30);
        controller.filterBy("screenSize", 16, 14);
    }
}
