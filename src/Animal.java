/**
 * Created by sunil on 6/28/16.
 */
public class Animal {
    private int mNumLegs;
    private int mTopSpeed;
    private boolean mIsEndagered;
    private String mName;

    public Animal(){
        mName = "Unknown...";
        mNumLegs = 0;
        mTopSpeed = 0;
        mIsEndagered = false;

    }

    public Animal(String name, int legs, int spd, boolean endgd ){

        mName = name;
        mNumLegs = legs;
        mTopSpeed = spd;
        mIsEndagered = endgd;

    }

    public void printInfo(){
        System.out.print("[Name:] " + mName + " [#Legs:] " + mNumLegs + " [Top Speed:] " + mTopSpeed + " [Endangered Status:] " + mIsEndagered);
    }



}
