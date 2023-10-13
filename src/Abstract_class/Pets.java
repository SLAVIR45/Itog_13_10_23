package Abstract_class;

import javax.naming.ldap.Control;
import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class Pets {
    private  String name ;
    private String birthday;

    private ArrayList<String> comands;


    public Pets(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
        this.comands = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }


    @Override
    public String toString() {
        return "Кличка: " + this.getName() + "Дата рождения: " + this.getBirthday();
    }

    public ArrayList<String> getComands() {
        return comands;
    }

    public void setComands(ArrayList<String> comands) {
        this.comands = comands;
    }

    public void test()
    {
        System.out.println("Кличка: " + this.getName() + "  Дата рождения: " + this.getBirthday());
    }
}



