package com.example.realtor;

public class House extends Street {

    protected int houseArea;

    public int getHouseArea() {
        return houseArea;
    }

    public void setHouseArea(int houseArea) {
        this.houseArea= houseArea;
    }

    @Override
    public String get_info() {
        return "Nice neighbours and silent suburbs";
    }

}
