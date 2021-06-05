package com.example.realtor;

public class Flat extends Building {

    protected int AmountOfRooms;

    public int getAmountOfRooms() {
        return AmountOfRooms;
    }

    public void setAmountOfRooms(int amountOfRooms) {
        AmountOfRooms = amountOfRooms;
    }

    @Override
    public String get_info() {
        return "2 rooms with brilliant sign";
    }
}
