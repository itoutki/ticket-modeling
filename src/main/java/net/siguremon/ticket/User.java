package net.siguremon.ticket;

public class User {
    int age;
    boolean isCinemaCitizen;

    public User() {
        this.age = 20;
        this.isCinemaCitizen = false;
    }

    public User(int age, boolean isCinemaCitizen) {
        this.age = age;
        this.isCinemaCitizen = isCinemaCitizen;
    }

    public boolean isSenior() {
        return age >= 70;
    }

    public boolean isCinemaCitizen() {
        return isCinemaCitizen && age < 60;
    }

    public boolean isSeniorCinemaCitizen() {
        return isCinemaCitizen && age >= 60;
    }
}
