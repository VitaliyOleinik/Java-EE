package db;

import entities.Orders;

import java.util.ArrayList;
import java.util.Date;

public class DBManager {
    private static ArrayList<Orders>orders = new ArrayList<>();
    private static Long nextId = 2L;

    static {
        orders.add(new Orders(1L, 250, "t-short", new Date(), false));
    }

    public static void addOrder(Orders order){
        orders.add(order);
        order.setId(nextId);
        nextId++;
    }

    public static ArrayList<Orders>getOrders(){
        return orders;
    }

    public static Orders getOrder(Long id){
        for(Orders o : orders){
            if(o.getId() == id){
                return o;
            }
        }
        return null;
    }

    public static void isComplete(Long id){
        for(int i = 0; i < orders.size(); i++){
            if(orders.get(i).getId() == id){
                orders.get(i).setCompleted(true);
            }
        }
    }
}
