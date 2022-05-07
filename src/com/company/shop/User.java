package com.company.shop;

public class User {
    private String login;
    private int password;
    private int money;

    public User(String login, int password, int money) {
        this.login = login;
        this.password = password;
        this.money = money;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
