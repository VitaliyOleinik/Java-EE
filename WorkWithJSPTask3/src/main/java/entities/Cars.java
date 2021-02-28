package entities;

public class Cars {
    private Long id;
    private String name;
    private int maxSpeed;

    public Cars(){}

    public Cars(Long id, String name, int maxSpeed) {
        this.id = id;
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + maxSpeed + " km/h";
    }
}

