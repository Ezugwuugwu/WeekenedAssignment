package tVPackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TvTest {

    @Test
    public void theTv() {
        TvClass tv = new TvClass("Samsung");
    }

    @Test
    public void isOn() {
        TvClass tv = new TvClass("Samsung");
        tv.isOn();
       assertFalse(tv.isOn());
    }

    @Test
    public void turnOn(){
        TvClass tv = new TvClass("Samsung");
        tv.turnOn();
        assertTrue(tv.isOn());
    }

    @Test
    public void turnOff(){
        TvClass tv = new TvClass("Samsung");
        tv.turnOff();

    }

    @Test
    public void getVolume(){
        TvClass tv = new TvClass("Samsung");
        int vol =  tv.get_Min_Volume();
        assertEquals(0,vol);
    }

    @Test
    public void increase_Volume(){
        TvClass tv = new TvClass("Samsung");
//increase volume from 0,to maximum volume, 5 and pulse increement when maximum volume is reached

        tv.increase_Volume();
        tv.increase_Volume();
        tv.increase_Volume();
        tv.increase_Volume();
        tv.increase_Volume();//increement stops here, after the maximum value is reached
        tv.increase_Volume();
        tv.increase_Volume();
        int vol = tv.get_Min_Volume();
        assertEquals(5,vol);
    }
    @Test
    public void lower_Volume(){
        TvClass tv = new TvClass("Samsung");
        //increase volume to more than 5 which is the maximum volume, so the reduction will be noticed
        tv.increase_Volume();
        tv.increase_Volume();
        tv.increase_Volume();
        tv.increase_Volume();
        tv.increase_Volume();//increement stops here because the maximum volume is reached at 5.
        tv.increase_Volume();
        tv.increase_Volume();
        tv.increase_Volume();
        tv.increase_Volume();
        //Now decrease the increased volume by 3

        tv.lower_Volume();
        tv.lower_Volume();
        tv.lower_Volume();
        int vol = tv.get_Min_Volume();
        assertEquals(2, vol);
    }


    @Test
    public void move_Channels_Forward(){
        TvClass tv = new TvClass("Samsung");
        //the default channel is 1 already and increases from that point

        tv.move_Channel_Forward();
        tv.move_Channel_Forward();
        tv.move_Channel_Forward();
        int channel = tv.getChannel();
        assertEquals(3,channel);
    }

    @Test
    public void move_Channels_Backwards(){
        TvClass tv = new TvClass("Samsung");
        //recall that the channel has been made final at 10. So, the whole increase by 20 will interrupt after count 10
    for (int i =1; i < 20; i++){
        tv.move_Channel_Forward();
    }

    //move the channels backwards twice
        tv.move_Channels_Backwards();
        tv.move_Channels_Backwards();
        int getchannel = tv.getChannel();
        assertEquals(8,getchannel);
    }

    @Test
    public  void minimumNumberInArrayElements(){
        TvClass tv = new TvClass("Samsung");
        int [] numbers = {1,2,3,54,5,};

       int mini = tv.minimum_Number_Of_Array_Elements(numbers);
        assertEquals(1, mini);
    }
    @Test
    public void maximumNumberInArrayElement(){
        TvClass tv = new TvClass("Samsung");
        int [] numbers = {34,56,67,7,8};
       int max = tv.maximum_number_In_An_Array(numbers);
        assertEquals(67, max);
    }

    @Test
    public void average_Of_Array_Elements(){
        TvClass tv = new TvClass("Samsung");
        int [] numbers = {2,4,6,7,8,9};
      double average =  tv.average_Of_Array_Elements(numbers);
        assertEquals(6.0,average);
    }

}