import Abstract_class.Pets;

import java.util.ArrayList;

public class Pet_registry {

    ArrayList <Pets> registry = new ArrayList<>();

    public void addAnimal (Pets animal)
    {
        registry.add(animal);
    }

    public void printRegistry(){
        for (Pets value: registry) {
            value.test();
        }


    }

    public ArrayList<Pets> getRegistry() {
        return registry;
    }
}
