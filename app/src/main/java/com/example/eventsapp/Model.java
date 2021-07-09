package com.example.eventsapp;

public class Model {
    public int imageid;
    public String name;

    public Model() {
    }

    public Model(int imageid, String name) {
        this.imageid = imageid;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Model{" +
                "imageid=" + imageid +
                ", name='" + name + '\'' +
                '}';
    }

    public int getImageid() {
        return imageid;
    }

    public void setImageid(int imageid) {
        this.imageid = imageid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
