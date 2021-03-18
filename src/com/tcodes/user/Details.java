package com.tcodes.user;

import com.tcodes.actions.Action;

public class Details {
    private Username username;
    private Password password;
    private Action action;


    public void setUser(Username username) {
        this.username = username;
    }

    public Username getUser(){
        return this.username;
    }

    public void setPassword(Password password){
        this.password = password;
    }

    public Password getPassword(){
        return this.password;
    }
}

