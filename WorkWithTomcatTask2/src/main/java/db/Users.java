package db;

public class Users {
    private Long id;
    private String name;
    private String surname;
    private String country;
    private String city;
    private String uin; // unique identification number
    public Users(){}
    public Users(Long id, String name, String surname, String country, String city, String uin) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.city = city;
        this.uin = uin;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUin() {
        return uin;
    }

    public void setUin(String uin) {
        this.uin = uin;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", uin='" + uin + '\'' +
                '}';
    }
}
