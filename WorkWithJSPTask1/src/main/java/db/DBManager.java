package db;

import entities.Students;

import java.util.ArrayList;

public class DBManager {

    private ArrayList<Students> allStudents = new ArrayList<>();

    public DBManager(){

        System.out.println("LOADING USERS");

        allStudents.add(new Students(1L, "Ilyas", "Zhuanyshev", "IS-145", 2014));
        allStudents.add(new Students(2L, "Anar", "Daribeyva", "IS-1605", 2016));
        allStudents.add(new Students(3L, "Arman", "Zhuanyshev", "IS-143", 2014));
        allStudents.add(new Students(4L, "Didar", "Zhuanyshev", "IS-146", 2015));
        allStudents.add(new Students(5L, "Esen", "Zhuanyshev", "IS-146", 2015));
        allStudents.add(new Students(6L, "Asylzhan", "Zhuanyshev", "IS-145", 2014));
        allStudents.add(new Students(7L, "Ilyas", "Erbolov", "IS-145", 2014));

    }

    public ArrayList<Students> getAllStudents() {

        return allStudents;

    }

    public ArrayList<Students> getStudentsByName(String name){

        ArrayList<Students> temp = new ArrayList<Students>();

        for(Students st : allStudents){
            if(st.getName().equals(name)){
                temp.add(st);
            }
        }

        return temp;

    }

    public ArrayList<Students> getStudentsBySurname(String surname){

        ArrayList<Students> temp = new ArrayList<Students>();

        for(Students st : allStudents){
            if(st.getSurname().equals(surname)){
                temp.add(st);
            }
        }

        return temp;

    }

    public ArrayList<Students> getStudentsByGroup(String group){

        ArrayList<Students> temp = new ArrayList<Students>();

        for(Students st : allStudents){
            if(st.getGroup().equals(group)){
                temp.add(st);
            }
        }

        return temp;

    }

    public ArrayList<Students> getStudentsByYear(int year){

        ArrayList<Students> temp = new ArrayList<Students>();

        for(Students st : allStudents){
            if(st.getAddmittedYear()==year){
                temp.add(st);
            }
        }

        return temp;

    }

}