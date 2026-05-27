package Bai4;

public class User {
    String fullname;
    boolean gender;
    String country;

    public User() {
    }

    public User(String fullname, boolean gender, String country) {
        this.fullname = fullname;
        this.gender = gender;
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public boolean isGender() {
        return gender;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
