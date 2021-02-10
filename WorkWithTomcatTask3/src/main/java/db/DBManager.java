package db;

import entites.Students;
import entites.Users;

import java.util.ArrayList;

public class DBManager {
    private static ArrayList<Users> allUsers = new ArrayList<>();
    private static ArrayList<Students> allStudents = new ArrayList<>();

    private static Long id = 4L;

    static {
        allUsers.add(new Users(1L, "ilyas", 29));
        allUsers.add(new Users(2L, "kuatbek", 27));
        allUsers.add(new Users(3L, "alexey", 25));

        allStudents.add(new Students(1L, "Ilyas", "Zhuanyshev", "EN-D04", 2007));
        allStudents.add(new Students(2L, "Arman", "Zhuanyshev", "EN-C04", 2010));
        allStudents.add(new Students(3L, "Essen", "Zhuanyshev", "EN-D04", 2009));
        allStudents.add(new Students(4L, "Ilyas", "Assetov", "EN-A04", 2017));
        allStudents.add(new Students(5L, "Ilyas", "Armanov", "EN-B04", 2013));
        allStudents.add(new Students(6L, "Artem", "Egorov", "EN-D04", 2007));
    }

    public static ArrayList<Users>getAllUsers(){
        return allUsers;
    }
    public static void addUser(Users user){
        user.setId(id);
        allUsers.add(user);
        id++;
    }

    public static ArrayList<Students>getAllStudents(){
        return allStudents;
    }
    public static ArrayList<Students>getStudents(String key, String type){
        ArrayList<Students> result = new ArrayList<>();
        if(type.equals("1")){
            for(Students student : allStudents){
                if(student.getName().equals(key)){
                    result.add(student);
                }
            }
        }else if(type.equals("2")){
            for(Students student:allStudents){
                if(student.getSurname().equals(key)){
                    result.add(student);
                }
            }
        }else if(type.equals("3")){
            for(Students student: allStudents){
                if(student.getGroup().equals(key)){
                    result.add(student);
                }
            }
        }else if(type.equals("4")){
            for(Students student: allStudents){
                if(student.getAddmitedYear() == Integer.parseInt(key)){
                    result.add(student);
                }
            }
        }
        return result;
    }
}
