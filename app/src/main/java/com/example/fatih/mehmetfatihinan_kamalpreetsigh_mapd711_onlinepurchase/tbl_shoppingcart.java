package com.example.fatih.mehmetfatihinan_kamalpreetsigh_mapd711_onlinepurchase;

/**
 * Created by Fatih on 2017-12-17.
 */

public class tbl_shoppingcart {

    //= {"CREATE TABLE shoppingcart ( customerId INTEGER NOT NULL,
    // productId INTEGER NOT NULL, quantity INTEGER NOT NULL, price INTEGER NOT NULL );"}

    int customerId;
    int productId;
    int quantity;
    int price;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
