package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD c = new CD(500, "1600 to 4000 rpm", "24x");

        DVD d = new DVD(750, "1600 to 4000 rpm", "52x");

        // TODO: Call each CD and DVD method to verify that they work as expected.

        c.discSize();

        d.writeDisc();

    }
}
