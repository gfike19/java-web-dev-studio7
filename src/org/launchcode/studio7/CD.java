package org.launchcode.studio7;

import java.util.HashMap;

public class CD extends BaseDisc {

    public CD(String name, HashMap<Integer, String> contents) {
        super(name, 847, contents, "CD");
    }

    @Override
    public void spin() {
        System.out.print("A CD spins at a rate of 200 - 500 rpm.");
    }

    @Override
    public void writeToDisc() {

    }

    @Override
    public void readFromDisc() {

    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
