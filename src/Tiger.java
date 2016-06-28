/**
 * Created by sunil on 6/28/16.
 */
public class Tiger extends Mammal {
    private boolean mHasStripes;

    public Tiger(){
        super();
        mHasStripes = true;
    }

    public Tiger(String name, int legs, int spd, boolean endgd, boolean landorsea, boolean stripes){

        super(name, legs, spd, endgd, landorsea);

        mHasStripes = stripes;
    }

    public void printInfo(){
        super.printInfo();
        System.out.print(" Has Stripes: " + mHasStripes);
    }
}