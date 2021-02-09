package db;

import java.util.ArrayList;

public class DBUtil {
    private static ArrayList<Users> allUsers = new ArrayList<>();
    private static Long id = 4L;

    static {
        allUsers.add(new Users(1L, "Vit", "Krutoi", "Switzerland", "Zurich", "123456789"));
        allUsers.add(new Users(2L, "Ratatuy", "Way", "Switzerland", "Zurich", "987654321"));
        allUsers.add(new Users(3L, "Pelmen", "San", "Switzerland", "Zurich", "234567890"));
    }

    public static void addUser(Users user){
        user.setId(id);
        allUsers.add(user);
        id++;
    }

    public static ArrayList<Users>getAllUsers(){
        return allUsers;
    }
}
