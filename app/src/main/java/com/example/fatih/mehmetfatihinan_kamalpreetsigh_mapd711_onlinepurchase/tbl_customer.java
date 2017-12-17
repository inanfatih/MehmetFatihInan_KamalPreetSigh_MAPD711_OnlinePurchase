package com.example.fatih.mehmetfatihinan_kamalpreetsigh_mapd711_onlinepurchase;

/**
 * Created by Fatih on 2017-12-17.
 */

public class tbl_customer {

    //  "CREATE TABLE customer ( customerId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,
    // userName TEXT NOT NULL UNIQUE, password TEXT, firstname TEXT, lastname TEXT, address TEXT, city TEXT, postalcode TEXT );"};

    int customerId;
    String userName;
    String password;
    String firstName;
    String lastName;
    String postalCode;

    public int getCustomerId() {
        return customerId;
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

    public String getPostalCode() {
        return postalCode;
    }
}
