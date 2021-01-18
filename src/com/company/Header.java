package com.company;

public class Header {

    private String username;
    private String password;

    public Header(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
