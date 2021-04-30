package db;

import entites.MaterialValues;
import entites.Person;

import java.util.ArrayList;

public class DBManager {
    private static ArrayList<Person> allPersons = new ArrayList<>();
    private static ArrayList<MaterialValues> allMaterialValues = new ArrayList<>();




    static {
        allPersons.add(new Person( "ilyas", 1,29));
        allPersons.add(new Person( "kuatbek", 2, 27));
        allPersons.add(new Person( "alexey", 3,25));

        allMaterialValues.add(new MaterialValues(1L, "Ilyas",  2007));
        allMaterialValues.add(new MaterialValues(2L, "Arman", 2010));
        allMaterialValues.add(new MaterialValues(3L, "Essen",  2009));
        allMaterialValues.add(new MaterialValues(4L, "Ilyas",  2017));
        allMaterialValues.add(new MaterialValues(5L, "Ilyas", 2013));
        allMaterialValues.add(new MaterialValues(6L, "Artem", 2007));
    }
}
