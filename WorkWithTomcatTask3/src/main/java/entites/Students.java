package entites;

public class Students {
    private Long id;
    private String name;
    private String surname;
    private String group;
    private int addmitedYear; // год поступления
    public Students(){}

    public Students(Long id, String name, String surname, String group, int addmitedYear) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.addmitedYear = addmitedYear;
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

    public int getAddmitedYear() {
        return addmitedYear;
    }

    public void setAddmitedYear(int addmitedYear) {
        this.addmitedYear = addmitedYear;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", group='" + group + '\'' +
                ", addmitedYear=" + addmitedYear +
                '}';
    }
}
