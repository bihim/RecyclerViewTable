package com.example.tableexample2;

public class TableModel
{
    private String serial;
    private String name;
    private String quantity;
    private String amount;

    public TableModel(String serial, String name, String quantity, String amount)
    {
        this.serial = serial;
        this.name = name;
        this.quantity = quantity;
        this.amount = amount;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
