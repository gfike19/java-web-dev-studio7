package org.launchcode.studio7;

import java.util.HashMap;

public class DVD extends BaseDisc {

    public DVD(String name, HashMap<Integer, String> contents) {
        super(name, 4700, contents, "DVD");
    }

    @Override
    public void spin() {
        System.out.print("A DVD spins at a rate of 570 - 1600 rpm.");
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
