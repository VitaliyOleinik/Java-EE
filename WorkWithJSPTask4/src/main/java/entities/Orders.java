package entities;

import java.util.Date;

public class Orders {
    private Long id;
    private int price;
    private String name;
    private Date orderedTime;
    private boolean isCompleted;

    public Orders(){}

    public Orders(Long id, int price, String name, Date orderedTime, boolean isCompleted) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.orderedTime = orderedTime;
        this.isCompleted = isCompleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getOrderedTime() {
        return orderedTime;
    }

    public void setOrderedTime(Date orderedTime) {
        this.orderedTime = orderedTime;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", orderedTime=" + orderedTime +
                ", isCompleted=" + isCompleted +
                '}';
    }
}
