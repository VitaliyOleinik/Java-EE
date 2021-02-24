package entities;

public class Students {

    private Long id;
    private String name;
    private String surname;
    private String group;
    private int addmittedYear;

    public Students(Long id, String name, String surname, String group, int addmittedYear) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.addmittedYear = addmittedYear;
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

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getAddmittedYear() {
        return addmittedYear;
    }

    public void setAddmittedYear(int addmittedYear) {
        this.addmittedYear = addmittedYear;
    }

    public Students() {
    }
}