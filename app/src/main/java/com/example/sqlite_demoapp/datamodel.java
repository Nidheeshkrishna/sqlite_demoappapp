package com.example.sqlite_demoapp;

import androidx.annotation.NonNull;

public class datamodel {
    String name;
    String phno;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

    @NonNull
    @Override
    public String toString() {
        return name.toString();
    }
}
