package org.launchcode.studio7;


public class CD extends Disk implements Spinnable{

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    //they both spin


    public CD(){
        this.spinRate = 50;
    }
    public void spin(Disk disk){
        this.isSpinning = true;
        while (this.isSpinning == true) {
            delay(50);
            this.spin(this);
        }
        //spin logic
    }
    //they both store data
    public void storeData(Data data, Laser laser){
        this.data = data;
        this.writeData(data, laser);
    }

    //data gets written to the discs by using a laser
    public void writeData(Data data, Laser laser){
        laser.on();
        laser.write(data);
        laser.off();
    }
    // the data on the discs can be read by using a laser
    public Data readData(){
        return this.data;
    }



    //once loaded, they both report information like name, capacity, contents
    //play media
    //stop media
    //roll
    //can be copied
    //reflect light


    //read,write speeds
}
