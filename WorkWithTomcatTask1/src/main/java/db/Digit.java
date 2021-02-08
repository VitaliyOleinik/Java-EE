package db;

public class Digit {
    private int id;
    private int digit;

    public Digit(int id, int digit) {
        this.id = id;
        this.digit = digit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDigit() {
        return digit;
    }

    public void setDigit(int digit) {
        this.digit = digit;
    }

    @Override
    public String toString() {
        return "Digit{" +
                "id=" + id +
                ", digit=" + digit +
                '}';
    }
}
