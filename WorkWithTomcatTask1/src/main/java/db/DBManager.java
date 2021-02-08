package db;

import java.util.ArrayList;

public class DBManager {
    private static ArrayList<Digit> allDigits = new ArrayList<>();
    private static int id = 4;

    static{
        allDigits.add(new Digit(1, 123));
        allDigits.add(new Digit(2, 43));
        allDigits.add(new Digit(3, 677));
    }

    public static void addDigit(Digit digit){
        digit.setId(id);
        allDigits.add(digit);
        id++;
    }

    public static ArrayList<Digit> getAllDigits(){
        return allDigits;
    }
}
