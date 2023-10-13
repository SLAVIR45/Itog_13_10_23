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
        System.out.println("����� ������� �������� �������?");
        pets.getComands().add(userInput());
    }

    public void viewMenu ()
    {
        menu.put(1, "������� ����� ��������");
        menu.put(2, "������ ������ ���������");
        menu.put(3, "������� �������� ����� �������");
        menu.put(4, "�������� ���� ��������");
        menu.put(5, "����� ");
        menu.forEach((key, value) -> System.out.println(key + " " + value));
    }


    public void viewChoosingAnimal ()
    {
        menu.put(1, "�����");
        menu.put(2, "������");
        menu.put(3, "�������");
        menu.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
