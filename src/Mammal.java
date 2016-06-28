/**
 * Created by sunil on 6/28/16.
 */
public class Mammal extends Animal {
    private boolean isLandMammal; // tiger vs whale!  ...

    public Mammal(){
        super();
        isLandMammal = false;
    }

    public Mammal(String name, int legs, int spd, boolean endgd, boolean landorsea){
        super(name,legs, spd, endgd);
        isLandMammal = landorsea;
    }

    public void printInfo(){
        super.printInfo();
        System.out.print(" [Land-Based: " + isLandMammal);
    }
}

// make subclass tiger with boolean mHasStripes
