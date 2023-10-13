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
        System.out.println("Это реестр домашних животных");
        System.out.println("Выберите действие из меню");
        control.viewMenu();
        switch (control.userInputInt())
        {
            case 1:
                System.out.println("Какое животное хотите завести в реестр?");
                System.out.println("Выберите животное из списка");
                control.viewChoosingAnimal();
                switch (control.userInputInt())
                {
                    case 1:
                        System.out.println("Введите кличку кошки");
                        String value = control.userInput();
                        System.out.println("Введите дату рождения ");
                        String  value2 = control.userInput();
                        petRegistry.addAnimal(new Cat(value,value2));
                        break;
                    case 2:
                        System.out.println("Введите кличку собаки");
                        value = control.userInput();
                        System.out.println("Введите дату рождения ");
                        value2 = control.userInput();
                        petRegistry.addAnimal(new Dog(value,value2));
                        break;
                    case 3:
                        System.out.println("Введите кличку Попугая");
                        value = control.userInput();
                        System.out.println("Введите дату рождения ");
                        value2 = control.userInput();
                        petRegistry.addAnimal(new Parrot(value,value2));
                        break;
                }
                break;
            case 2:
                System.out.println("Выберите id питомца для просмотра известных команд");
                petRegistry.printRegistry();
                control.viewComands(petRegistry.getRegistry().get(control.userInputInt() - 1));
                break;
            case 3:
                System.out.println("Выберите id питомца которого хотите обучить новой команде");
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
