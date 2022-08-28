package Facade.Entity;

public class User {
    private Long Id;
    private String name;
    private String surname;
    private String mailAddress;
    private String password;

    public User() {

    }

    public User(Long id, String name, String surname, String mailAddress, String password) {
        Id = id;
        this.name = name;
        this.surname = surname;
        this.mailAddress = mailAddress;
        this.password = password;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
