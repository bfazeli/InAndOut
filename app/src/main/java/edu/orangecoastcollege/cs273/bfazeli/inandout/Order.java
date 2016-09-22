package edu.orangecoastcollege.cs273.bfazeli.inandout;

/**
 * Class for instantiating an instance of an Order
 *
 * Created by bijanfazeli on 9/21/16.
 */
public class Order {
    // Global constants
    private final double PRICE_CHEESEBURGER = 2.15, PRICE_DOUBLE_DOUBLE = 3.60,
            PRICE_FRENCH_FRIES = 1.65, PRICE_LARGE_DRINK = 1.75, PRICE_MEDIUM_DRINK = 1.55,
            PRICE_SHAKE = 2.20, PRICE_SMALL_DRINK = 1.45, TAX_RATE = .08;

    // Declaration of member fields
    private int mCheeseburgers, mDoubleDoubles, mFrenchFries, mLargeDrinks,
            mMediumDrinks, mShakes, mSmallDrinks;

    // Accessors and Mutators
    /**
     * getCheeseburgers Gets the cheeseburger count
     * @return  The count of cheeseburgers.
     */
    public int getCheeseburgers() {
        return mCheeseburgers;
    }

    /**
     * setCheeseburgers   Sets the count of cheeseburgers.
     * @param cheeseburgers   Sets it to the parameter passed in
     */
    public void setCheeseburgers(int cheeseburgers) {
        mCheeseburgers = cheeseburgers;
    }

    /**
     * getDoubleDoubles Gets the double doubles count
     * @return  The count of double doubles.
     */
    public int getDoubleDoubles() {
        return mDoubleDoubles;
    }

    /**
     * setDoubleDoubles   Sets the count of double doubles.
     * @param doubleDoubles   Sets it to the parameter passed in
     */
    public void setDoubleDoubles(int doubleDoubles) {
        mDoubleDoubles = doubleDoubles;
    }

    /**
     * getFrenchFries Gets the french fries count
     * @return  The count of french fries.
     */
    public int getFrenchFries() {
        return mFrenchFries;
    }

    /**
     * setFrenchFries   Sets the count of french fries.
     * @param frenchFries   Sets it to the parameter passed in
     */
    public void setFrenchFries(int frenchFries) {
        mFrenchFries = frenchFries;
    }

    /**
     * getLargeDrinks Gets the large drink count
     * @return  The count of large drinks.
     */
    public int getLargeDrinks() {
        return mLargeDrinks;
    }

    /**
     * setLargeDrinks   Sets the large drink.
     * @param largeDrinks   Sets it to the parameter passed in
     */
    public void setLargeDrinks(int largeDrinks) {
        mLargeDrinks = largeDrinks;
    }

    /**
     * getMediumDrinks Gets the medium drink count
     * @return  The count of medium drinks.
     */
    public int getMediumDrinks() {
        return mMediumDrinks;
    }

    /**
     * setMediumDrinks   Sets the medium drink.
     * @param mediumDrinks   Sets it to the parameter passed in
     */
    public void setMediumDrinks(int mediumDrinks) {
        mMediumDrinks = mediumDrinks;
    }

    /**
     * getShakes Gets the shakes count
     * @return  The count of shakes.
     */
    public int getShakes() {
        return mShakes;
    }

    /**
     * setShakes   Sets the shakes.
     * @param shakes   Sets it to the parameter passed in
     */
    public void setShakes(int shakes) {
        mShakes = shakes;
    }

    /**
     * getSmallDrinks Gets the small drinks count.
     * @return  The count of small drinks.
     */
    public int getSmallDrinks() {
        return mSmallDrinks;
    }

    /**
     * setSmallDrinks   Sets the small drink.
     * @param smallDrinks   Sets it to the parameter passed in
     */
    public void setSmallDrinks(int smallDrinks) { mSmallDrinks = smallDrinks; }

    /**
     * getNumberItemsOrdered()  Adds the total count of the individual items in the current order.
     * @return  The count of all the items in the order.
     */
    public int getNumberItemsOrdered() {
        return mCheeseburgers + mDoubleDoubles + mFrenchFries + mLargeDrinks +
                mMediumDrinks + mShakes + mSmallDrinks;
    }

    /**
     * calculateSubtotal()  Calculates the subtotal for the current order.
     * @return  The subtotal of the current order.
     */
    public double calculateSubtotal() {
        return (mCheeseburgers * PRICE_CHEESEBURGER) + (mDoubleDoubles * PRICE_DOUBLE_DOUBLE) +
                (mFrenchFries * PRICE_FRENCH_FRIES) + (mLargeDrinks * PRICE_LARGE_DRINK) +
                (mMediumDrinks * PRICE_MEDIUM_DRINK) + (mShakes * PRICE_SHAKE) +
                (mSmallDrinks * PRICE_SMALL_DRINK);
    }

    /**
     * calulateTax()    The tax of the current order.
     * @return The tax.
     */
    public double calculateTax() {
        return calculateSubtotal() * TAX_RATE;
    }

    /**
     * calculateTotal() The total for the current order.
     * @return  The total
     */
    public double calculateTotal() {
        return calculateSubtotal() + calculateTax();
    }
}
