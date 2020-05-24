package org.launchcode.studio7;

import java.util.HashMap;

public abstract class BaseDisc implements OpticalDisc {

    private String name;
    private double capacity;
    private HashMap<Integer, String> contents;
    private String discType;

    public BaseDisc(String name, double capacity, HashMap<Integer, String> contents,
                    String discType){
        this.name = name;
        this.capacity = capacity;
        this.contents = contents;
        this.discType = discType;
    }

    public String getName() {
        return name;
    }

    public double getCapacity() {
        return capacity;
    }

    public HashMap<Integer, String> getContents() {
        return contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContents(HashMap<Integer, String> contents) {
        this.contents = contents;
    }
}
