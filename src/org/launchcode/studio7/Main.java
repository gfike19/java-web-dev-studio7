package org.launchcode.studio7;

import java.util.HashMap;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        HashMap<Integer, String> tracks = new HashMap<>();
        tracks.put(1, "Face Down by Jumpsuit Apparatus");
        tracks.put(2, "Serpentine by Disturbed");
        tracks.put(3, "Hot in Here by Nelly");
        CD cd = new CD("Random Mix", tracks);

        HashMap<Integer, String> scenes = new HashMap<>();
        scenes.put(1, "Noni whines");
        scenes.put(2, "Noni goes outside");
        scenes.put(3, "Noni barks at stuff");
        scenes.put(4, "Noni goes inside");
        DVD dvd = new DVD("Wanna go for a walk?", scenes);
        // TODO: Call each CD and DVD method to verify that they work as expected.
        System.out.println(cd.getDiscType());
        System.out.print(dvd.getDiscType());

    }
}
