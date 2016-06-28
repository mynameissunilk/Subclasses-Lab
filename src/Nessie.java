/**
 * Created by sunil on 6/28/16.
 * Classfile for the Loch Ness Monster
 */

public class Nessie extends Reptile {
    private boolean mCaresWhatYouThink;

    public Nessie(){
        super();
        mCaresWhatYouThink = true;
    }

    public Nessie(String name, int legs, int spd, boolean endgd, boolean scales, boolean cares){
        super(name, legs, spd, endgd, scales);
        mCaresWhatYouThink = cares;
    }

    public void printInfo(){
        super.printInfo();
        System.out.print(" [Cares what you think:] " + mCaresWhatYouThink);
    }

}
