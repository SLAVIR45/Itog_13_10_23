import Class_pets.Cat;
import Class_pets.Dog;
import Class_pets.Parrot;
import com.sun.tools.javac.Main;

public class Menu {

    Control control = new Control();
    Pet_registry petRegistry = new Pet_registry();

    boolean flag = true;
    public void  Start()
    {
        while(flag)
        {
            menu(control, petRegistry);
        }
    }
    public void  menu (Control control, Pet_registry petRegistry)
    {
        System.out.println("��� ������ �������� ��������");
        System.out.println("�������� �������� �� ����");
        control.viewMenu();
        switch (control.userInputInt())
        {
            case 1:
                System.out.println("����� �������� ������ ������� � ������?");
                System.out.println("�������� �������� �� ������");
                control.viewChoosingAnimal();
                switch (control.userInputInt())
                {
                    case 1:
                        System.out.println("������� ������ �����");
                        String value = control.userInput();
                        System.out.println("������� ���� �������� ");
                        String  value2 = control.userInput();
                        petRegistry.addAnimal(new Cat(value,value2));
                        break;
                    case 2:
                        System.out.println("������� ������ ������");
                        value = control.userInput();
                        System.out.println("������� ���� �������� ");
                        value2 = control.userInput();
                        petRegistry.addAnimal(new Dog(value,value2));
                        break;
                    case 3:
                        System.out.println("������� ������ �������");
                        value = control.userInput();
                        System.out.println("������� ���� �������� ");
                        value2 = control.userInput();
                        petRegistry.addAnimal(new Parrot(value,value2));
                        break;
                }
                break;
            case 2:
                System.out.println("�������� id ������� ��� ��������� ��������� ������");
                petRegistry.printRegistry();
                control.viewComands(petRegistry.getRegistry().get(control.userInputInt() - 1));
                break;
            case 3:
                System.out.println("�������� id ������� �������� ������ ������� ����� �������");
                petRegistry.printRegistry();
                control.addComand(petRegistry.getRegistry().get(control.userInputInt() - 1));
                break;
            case 4:
                petRegistry.printRegistry();
                break;
            case 5:
                flag = false;
                break;

        }





    }
}
