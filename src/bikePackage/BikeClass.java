package bikePackage;
public class BikeClass {
    protected static boolean bike_Is_On;
    private static int minimum_GearOne_Speed =0, minimum_GearTwo_Speed = 21,minimum_GearThree_Speed =31, minimum_GearFour_Speed =41;

    private static final int GEAR_ONE_MAXIMUM_SPEED =20, GEAR_TWO_MAXIMUM_SPEED =29, GEAR_THREE_MAXIMUM_SPEED =40;

    public BikeClass(String maker) {
    }

    public boolean bike_Is_On() {
        return bike_Is_On;
    }

    public static void turn_On_Bike() {
        bike_Is_On =true;
    }

    public static void turn_Off_Bike() {
        bike_Is_On =false;
    }

    public int get_GearOne_Speed() {
        return minimum_GearOne_Speed;
    }

    public int get_GearTwo_Speed() {
        return minimum_GearTwo_Speed;
    }


    public int get_GearThree_Speed() {
        return minimum_GearThree_Speed;
    }

    public int get_GearFour_Speed() {
        return minimum_GearFour_Speed;
    }


    public static int accelerate_GearOne_Speed() {
        if (minimum_GearOne_Speed < GEAR_ONE_MAXIMUM_SPEED)
            minimum_GearOne_Speed++;

        return minimum_GearOne_Speed;
    }


    public int accelerate_GearTwo_Speed() {
       if (minimum_GearTwo_Speed < GEAR_TWO_MAXIMUM_SPEED)
           minimum_GearTwo_Speed += 2;

//Test for speed exceeding the maximum limits of the GearTwo
        while (minimum_GearOne_Speed >0 && minimum_GearTwo_Speed >= GEAR_TWO_MAXIMUM_SPEED ){
            minimum_GearThree_Speed++;
        }
       //End of the test

       return minimum_GearThree_Speed;
    }

    public int accelerate_GearThree_Speed() {
        if (minimum_GearThree_Speed < GEAR_THREE_MAXIMUM_SPEED)
            minimum_GearThree_Speed += 3;

        return minimum_GearThree_Speed;
    }

    public int accelerate_GearFour_Speed() {
        if (minimum_GearFour_Speed > 0)
            minimum_GearFour_Speed += 4;

        return minimum_GearFour_Speed;
    }

    public int decelerate_GearOne_Speed() {
        if (minimum_GearOne_Speed >0 && minimum_GearOne_Speed <= GEAR_ONE_MAXIMUM_SPEED)
            minimum_GearOne_Speed--;

        return minimum_GearOne_Speed;
    }

    public int decelerate_GearTwo_Speed() {
        if (minimum_GearTwo_Speed > 0 && minimum_GearTwo_Speed <= GEAR_TWO_MAXIMUM_SPEED)
            minimum_GearTwo_Speed -= 2;

        return minimum_GearTwo_Speed;
    }

    public int decelerate_GearThree_Speed() {
        if (minimum_GearThree_Speed > 0 && minimum_GearThree_Speed <= GEAR_THREE_MAXIMUM_SPEED)
            minimum_GearThree_Speed -= 3;

        return minimum_GearThree_Speed;
    }

    public int decelerate_GearFour_Speed() {
        if (minimum_GearFour_Speed >0 && minimum_GearFour_Speed >41)
            minimum_GearFour_Speed -= 4;

        return minimum_GearFour_Speed;
    }


}
