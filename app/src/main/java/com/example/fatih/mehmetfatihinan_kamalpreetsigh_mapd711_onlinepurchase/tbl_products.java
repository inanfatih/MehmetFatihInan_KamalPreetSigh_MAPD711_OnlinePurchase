package com.example.fatih.mehmetfatihinan_kamalpreetsigh_mapd711_onlinepurchase;

/**
 * Created by Fatih on 2017-12-17.
 */

public class tbl_products {

//CREATE TABLE product ( productId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,
// productName TEXT NOT NULL UNIQUE, price INTEGER NOT NULL, image BLOB );"};

    int productId;
    String productName;
    int price;
    String image;

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    public String getImage() {
        return image;
    }
}
