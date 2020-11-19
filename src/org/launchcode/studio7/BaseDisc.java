package org.launchcode.studio7;

public abstract class BaseDisc {

    private int size;

    private String readSpeed;

    private String writeSpeed;

    public BaseDisc(int size, String readSpeed, String writeSpeed) {
        this.size = size;
        this.readSpeed = readSpeed;
        this.writeSpeed = writeSpeed;
    }

    public BaseDisc() {
    }

    public int getDiscSize() {
        return size;
    }

    public void setDiscSize(int discSize) {
        this.size = discSize;
    }

    public String getReadSpeed() {
        return readSpeed;
    }

    public void setReadSpeed(String readSpeed) {
        this.readSpeed = readSpeed;
    }

    public String getWriteSpeed() {
        return writeSpeed;
    }

    public void setWriteSpeed(String writeSpeed) {
        this.writeSpeed = writeSpeed;
    }
}
