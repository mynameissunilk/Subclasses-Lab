/**
 * Created by sunil on 6/28/16.
 */
public class Reptile extends Animal {
    boolean mIsFictional; // godzilla/dragons

    Reptile(){
        super();
        mIsFictional = false;
    }

    Reptile(String name, int legs, int spd, boolean endgd, boolean fiction){
        super(name, legs, spd, endgd);
        mIsFictional = fiction;
    }

    public void printInfo(){
        super.printInfo();
        System.out.print(" [Fictional:] " + mIsFictional);
    }
}
