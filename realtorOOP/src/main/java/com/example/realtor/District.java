package com.example.realtor;

public class District extends City {
     protected String district;

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }


    @Override
    public String get_info() {
        return "Desnyanskiy district";
    }

}
