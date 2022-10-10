package org.launchcode.studio7;


public class CD extends Disk implements Spinnable{

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    public CD(){
        super(700,500);
    }


    @Override
    public void spinDisc() {
        System.out.println("A cd spins at a rate of " + this.getSpinSpeed() + " rpm");
    }

    @Override
    public void storeData(String data) {
        this.writeData(data);
    }

    @Override
    public boolean isFull() {
        if(this.readData().length() >= this.getStorageCapacity()) return true;
        else return false;
    }
}
