package com.example.realtor;

public abstract class City {

    protected String cityName;
    protected int AmountOfEstates;

    public abstract String get_info();

    public int getAmountOfEstates() {
        return AmountOfEstates;
    }
    public String getCityName(){
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setAmountOfEstates(int amountOfEstates) {
        AmountOfEstates = amountOfEstates;
    }
}
