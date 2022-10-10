package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD myCD = new CD();
        DVD myDvd = new DVD("Summer Mix");

        myCD.spinDisc();
        myDvd.spinDisc();

        myCD.writeData("more data to write");
        System.out.println(myCD.readData());
        // TODO: Call each CD and DVD method to verify that they work as expected.
    }
}
