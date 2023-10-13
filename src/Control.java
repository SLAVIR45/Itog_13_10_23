import Abstract_class.Pets;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Control {


    private HashMap<Integer, String> menu = new HashMap<>();
    private HashMap<Integer, String> choosingAnimal = new HashMap<>();




    public  String userInput ()
    {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();
        return value ;

    }

    public  Integer userInputInt ()
    {
        Scanner scanner = new Scanner(System.in);
        Integer value = scanner.nextInt();
        return value ;

    }


    public void viewComands(Pets pets) {
        System.out.println(Arrays.toString(pets.getComands().toArray()) .replaceAll("[\\[\\]]", ""));
    }


    public void addComand (Pets pets){
        System.out.println("Какой команде обучился питомец?");
        pets.getComands().add(userInput());
    }

    public void viewMenu ()
    {
        menu.put(1, "Завести новое животное");
        menu.put(2, "Список команд животного");
        menu.put(3, "Обучить животное новой команде");
        menu.put(4, "Показать всех животных");
        menu.put(5, "Выйти ");
        menu.forEach((key, value) -> System.out.println(key + " " + value));
    }


    public void viewChoosingAnimal ()
    {
        menu.put(1, "Кошка");
        menu.put(2, "Собака");
        menu.put(3, "Попугай");
        menu.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
