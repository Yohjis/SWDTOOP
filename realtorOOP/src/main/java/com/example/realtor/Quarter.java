package com.example.realtor;

public class Quarter extends District {

    protected String nameQ;

    public String getNameQ() {
        return nameQ;
    }

    public void setNameQ(String nameQ) {
        this.nameQ = nameQ;
    }

    @Override
    public String get_info() {
        return "Quarter near downtown with greenzones";
    }
}
