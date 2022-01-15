package bikePackage;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {

    @Test
    public void bike(){
       BikeClass bike = new BikeClass("Yamaha");
    }


    @Test
    public void bike_Is_On(){
        BikeClass bike = new BikeClass("Yamaha");
        bike.bike_Is_On();
       assertFalse(bike.bike_Is_On());
    }


    @Test
    public void turn_On_Bike(){
        BikeClass bike = new BikeClass("Yamaha");
        bike.turn_On_Bike();
        assertTrue(bike.bike_Is_On());
    }


    @Test
    public void turn_Off_Bike(){
        BikeClass bike = new BikeClass("Yamaha");
        bike.turn_Off_Bike();
        assertFalse(bike.bike_Is_On());
    }


    @Test
    public void get_Speed(){
        BikeClass bike = new BikeClass("Yamaha");
        bike.get_GearOne_Speed();
        assertEquals(0,bike.get_GearOne_Speed());
    }


    @Test
    public void get_GearTwo_Speed(){
        BikeClass bike = new BikeClass("Yamaha");
        bike.get_GearTwo_Speed();
        assertEquals(21,bike.get_GearTwo_Speed());
    }


    @Test
    public void get_GearThree_Speed(){
        BikeClass bike = new BikeClass("Yamaha");
        bike.get_GearThree_Speed();
        assertEquals(31,bike.get_GearThree_Speed());
    }


    @Test
    public void get_GearFour_speed(){
        BikeClass bike = new BikeClass("Yamaha");
       int gearFour = bike.get_GearFour_Speed();
        assertEquals(41, gearFour);
    }


    @Test
    public void accelerate_GearOne(){
        BikeClass bike = new BikeClass("Yamaha");
//accelerating speed up to gearOne Maximum speed, acceleration stops after maximum, 20 speed is reached
        for (int i =0; i < 25; i++){
          bike.accelerate_GearOne_Speed();
        }
      int gearOne =  bike.get_GearOne_Speed();
        assertEquals(20,gearOne);
    }


    @Test
    public void accelerate_gearTwo(){
        BikeClass bike = new BikeClass("Yamaha");
         bike.accelerate_GearTwo_Speed();
        int gearTwo = bike.get_GearTwo_Speed();
        assertEquals(23, gearTwo);
    }


    @Test
    public void accelerate_GearThree(){
        BikeClass bike = new BikeClass("Yamaha");
        for (int i =0; i < 3; i++){
         bike.accelerate_GearThree_Speed();
        }
        int gearThree =  bike.get_GearThree_Speed();
        assertEquals(40, gearThree);
    }


    @Test
    public void accelerate_GearFour(){
        BikeClass bike = new BikeClass("Yamaha");
        bike.accelerate_GearFour_Speed();
        int gearFour = bike.get_GearFour_Speed();
        assertEquals(45, gearFour);
    }


    @Test
    public void decelerate_GearOne(){
        BikeClass bike = new BikeClass("Yamaha");
    for (int i =0; i <25; i++){
        bike.accelerate_GearOne_Speed();
    }
    for (int i =0; i <10; i++){
        bike.decelerate_GearOne_Speed();
    }
        int gearOne = bike.get_GearOne_Speed();
        assertEquals(10, gearOne);
    }


    @Test
    public void decelerate_GearTwo(){
        BikeClass bike = new BikeClass("Yamaha");
        bike.accelerate_GearTwo_Speed();
        bike.accelerate_GearTwo_Speed();

        bike.decelerate_GearTwo_Speed();
        int gearTwo = bike.get_GearTwo_Speed();
        assertEquals(23, gearTwo);
    }


    @Test
    public void decelerate_GearThree(){
        BikeClass bike = new BikeClass("Yamaha");
        bike.accelerate_GearThree_Speed();
        bike.accelerate_GearThree_Speed();
        bike.decelerate_GearThree_Speed();
        int gearThree = bike.get_GearThree_Speed();
        assertEquals(34,gearThree);
    }


    @Test
    public void decelerate_GearFour(){
        BikeClass bike = new BikeClass("Yamaha");
        for (int i =0; i <10; i++){
            bike.accelerate_GearFour_Speed();
        }
        bike.decelerate_GearFour_Speed();
        int gearFour = bike.get_GearFour_Speed();
        assertEquals(77, gearFour);
    }

}
