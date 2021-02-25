package db;
import entities.Users;

import java.util.ArrayList;

public class DBManager {

    private ArrayList<Users> users = new ArrayList<>();

    public DBManager(){
        users.add(new Users(1L, "vit", "1234", "Vitaliy Oleinik", 20));
        users.add(new Users(2L, "arman", "asdasd", "Arman Assanov", 22));
        users.add(new Users(3L, "erzhan", "asdasd", "Erzhan Zhuanyshev", 56));
        users.add(new Users(4L, "asan", "zxczxc", "Asan Ali", 21));
        users.add(new Users(5L, "erbol", "qweqwe", "Erbol Ermekov", 22));
    }

    public Users auth(String login, String password){

        for(Users u : users){
            if(u.getLogin().equals(login)&&u.getPassword().equals(password)){
                return u;
            }
        }

        return null;

    }

}

