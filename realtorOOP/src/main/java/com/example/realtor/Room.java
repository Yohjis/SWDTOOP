package com.example.realtor;

public class Room extends Flat {

    protected String nameR;

    public String getNameR() {
        return nameR;
    }

    public void setNameR(String nameR) {
        this.nameR = nameR;
    }

    @Override
    public String get_info() {
        return "Dining room with big Window";
    }
}
