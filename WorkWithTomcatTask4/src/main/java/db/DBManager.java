package db;

import entites.Users;

import java.util.ArrayList;

public class DBManager {
    private static ArrayList<Users>allUsers = new ArrayList<>();
    private static Long id = 4L;

    static{
        allUsers.add(new Users(1L, "Vit", 20));
        allUsers.add(new Users(2L, "Ar4i", 18));
        allUsers.add(new Users(3L, "Diannis", 20));
    }

    public static ArrayList<Users>getAllUsers(){
        return allUsers;
    }

    public static void addUser(Users user){
        user.setId(id);
        allUsers.add(user);
        id++;
    }
}
