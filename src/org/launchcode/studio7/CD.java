package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.


    public CD(int size, String readSpeed, String writeSpeed) {
        super(size, readSpeed, writeSpeed);
    }

    public void spinDisc(){
        System.out.println("This CD is spining at " + this.getReadSpeed() + ".");
    }

    public void readDisc(){
        System.out.println("This CD is reads at " + this.getReadSpeed() + ".");
    }

    public void writeDisc(){
        System.out.println("This CD writes at " + this.getWriteSpeed() + ".");
    }

    public void discSize(){
        System.out.println("This CD writes at " + this.getDiscSize() + "MB.");
    }

}
