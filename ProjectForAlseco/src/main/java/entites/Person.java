package entites;

public class Person {
    private String fullName;
    private int cnt;
    private int totalCost;

    public Person(String fullName, int cnt, int totalCost) {
        this.fullName = fullName;
        this.cnt = cnt;
        this.totalCost = totalCost;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", cnt=" + cnt +
                ", totalCost=" + totalCost +
                '}';
    }
}
