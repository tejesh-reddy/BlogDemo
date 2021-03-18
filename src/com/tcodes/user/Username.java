package com.tcodes.user;

public class Username {
    private String name;


    public Username(String name){
        setName(name);
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
