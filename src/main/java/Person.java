public class Person {
    private long phone;
    private String name;
    private String dateOfBirth;

    public Person(long id, String name, String date) {
        this.phone = id;
        this.name = name;
        this.dateOfBirth = date;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
