package edu.orangecoastcollege.cs273.bfazeli.inandout;

/**
 * Created by bijanfazeli on 9/21/16.
 */
public class Order {
    private int mCheeseburgers, mDoubleDoubles, mFrenchFries, mLargeDrinks,
            mMediumDrinks, mShakes, mSmallDrinks;

    private final double PRICE_CHEESEBURGER = 2.15, PRICE_DOUBLE_DOUBLE = 3.60,
            PRICE_FRENCH_FRIES = 1.65, PRICE_LARGE_DRINK = 1.75, PRICE_MEDIUM_DRINK = 1.55,
            PRICE_SHAKE = 2.20, PRICE_SMALL_DRINK = 1.45, TAX_RATE = .08;

    public Order(int cheeseburgers, int doubleDoubles, int frenchFries, int largeDrinks,
                 int mediumDrinks, int shakes, int smallDrinks)
    {
        mCheeseburgers = cheeseburgers;
        mDoubleDoubles = doubleDoubles;
        mFrenchFries = frenchFries;
        mLargeDrinks = largeDrinks;
        mMediumDrinks = mediumDrinks;
        mShakes = shakes;
        mSmallDrinks = smallDrinks;
    }

    public int getCheeseburgers() {
        return mCheeseburgers;
    }

    public void setCheeseburgers(int cheeseburgers) {
        mCheeseburgers = cheeseburgers;
    }

    public int getDoubleDoubles() {
        return mDoubleDoubles;
    }

    public void setDoubleDoubles(int doubleDoubles) {
        mDoubleDoubles = doubleDoubles;
    }

    public int getFrenchFries() {
        return mFrenchFries;
    }

    public void setFrenchFries(int frenchFries) {
        mFrenchFries = frenchFries;
    }

    public int getLargeDrinks() {
        return mLargeDrinks;
    }

    public void setLargeDrinks(int largeDrinks) {
        mLargeDrinks = largeDrinks;
    }

    public int getMediumDrinks() {
        return mMediumDrinks;
    }

    public void setMediumDrinks(int mediumDrinks) {
        mMediumDrinks = mediumDrinks;
    }

    public int getShakes() {
        return mShakes;
    }

    public void setShakes(int shakes) {
        mShakes = shakes;
    }

    public int getSmallDrinks() {
        return mSmallDrinks;
    }

    public void setSmallDrinks(int smallDrinks) {
        mSmallDrinks = smallDrinks;
    }

    public int getNumberItemsOrdered() {
        return mCheeseburgers + mDoubleDoubles + mFrenchFries + mLargeDrinks +
                mMediumDrinks + mShakes + mSmallDrinks;
    }

    public double calculateSubtotal() {
        return (mCheeseburgers * PRICE_CHEESEBURGER) + (mDoubleDoubles * PRICE_DOUBLE_DOUBLE) +
                (mFrenchFries * PRICE_FRENCH_FRIES) + (mLargeDrinks * PRICE_LARGE_DRINK) +
                (mMediumDrinks * PRICE_MEDIUM_DRINK) + (mShakes * PRICE_MEDIUM_DRINK) +
                (mShakes * PRICE_SHAKE) + (mSmallDrinks * PRICE_SMALL_DRINK);
    }
}
