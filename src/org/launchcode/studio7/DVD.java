package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc{

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.


    public DVD(int size, String readSpeed, String writeSpeed) {
        super(size, readSpeed, writeSpeed);
    }

    public void spinDisc(){
        System.out.println("This DVD is spining at " + this.getReadSpeed() + ".");
    }

    public void readDisc(){
        System.out.println("This DVD is reads at " + this.getReadSpeed() + ".");
    }

    public void writeDisc(){
        System.out.println("This DvD writes at " + this.getWriteSpeed() + ".");
    }

    public void discSize(){
        System.out.println("This DVD writes at " + this.getDiscSize() + "MB.");
    }

}
