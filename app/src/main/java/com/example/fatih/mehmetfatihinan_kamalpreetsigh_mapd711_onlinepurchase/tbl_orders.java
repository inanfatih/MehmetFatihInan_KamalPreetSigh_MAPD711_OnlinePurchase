package com.example.fatih.mehmetfatihinan_kamalpreetsigh_mapd711_onlinepurchase;

import java.text.DateFormat;
import java.util.Date;

/**
 * Created by Fatih on 2017-12-17.
 */

public class tbl_orders {
    //CREATE TABLE order ( orderId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE, customerId INTEGER NOT NULL,
    // productId INTEGER NOT NULL, quantity INTEGER NOT NULL, price INTEGER, shipped INTEGER NOT NULL, orderdate NUMERIC NOT NULL
    int orderId;
    int customerId;
    int productId;
    int quantity;
    int price;
    int shipped;
    Date orderDate;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

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

    public int getShipped() {
        return shipped;
    }

    public void setShipped(int shipped) {
        this.shipped = shipped;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
