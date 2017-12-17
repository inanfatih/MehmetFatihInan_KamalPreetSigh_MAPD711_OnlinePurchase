package com.example.fatih.mehmetfatihinan_kamalpreetsigh_mapd711_onlinepurchase;

/**
 * Created by Fatih on 2017-12-17.
 */

public class tbl_clerk {
    //"CREATE TABLE clerk ( employeeId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE, userName TEXT NOT NULL UNIQUE,
    // password TEXT, firstname TEXT, lastname TEXT);"};

    int employeeId;
    String userName;
    String password;
    String firstName;
    String lastName;

    public int getEmployeeId() {
        return employeeId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
