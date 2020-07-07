package se.lexicon.model;

import java.util.Objects;

public class AppUser {
    private int userId;
    private String email;
    private String password;
    private String name;

    public AppUser(int userId, String email, String password, String name) {
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return getUserId() == appUser.getUserId() &&
                Objects.equals(getEmail(), appUser.getEmail()) &&
                Objects.equals(getName(), appUser.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserId(), getEmail(), getName());
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "userId=" + userId +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
