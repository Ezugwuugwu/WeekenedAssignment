package tVPackage;

public class TvClass {
    private  final int MAX_VOLUME =5;
    private  final int MAX_CHANNEL =10;

    private int default_Channel =0;
    private int min_Volume =0;
    private String name;
    private boolean isOn;

    
    public TvClass(String maker){
        name =maker;
    }
    
    public boolean isOn() {
        return isOn;
    }

    public void turnOn(){
        isOn =true;
    }

    public void turnOff() {
        isOn = false;
    }

    public int get_Min_Volume() {
        return min_Volume;
    }

    public int increase_Volume() {
           if (min_Volume < MAX_VOLUME){
               min_Volume++;
           }

           return min_Volume;
    }
    public int lower_Volume() {
        if (min_Volume >0) return min_Volume--;
        return min_Volume;
    }

    public int getChannel() {
        return default_Channel;
    }

    public int move_Channel_Forward() {
            if (default_Channel < MAX_CHANNEL)
                default_Channel++;

        return default_Channel;
    }

    public int move_Channels_Backwards() {
        if (default_Channel >=1) return default_Channel--;

        return default_Channel;
    }

    int max;
    public int minimum_Number_Of_Array_Elements(int [] numbers) {

        int minimuNumber = numbers[0];
        for (int number: numbers){
            minimuNumber = Math.min(minimuNumber,number);
        }
        return minimuNumber;
    }

    public int maximum_number_In_An_Array(int[] numbers) {
        int maximumNumber = numbers[0];
        for (int number : numbers){
            maximumNumber = Math.max(maximumNumber,number);
        }
        return maximumNumber;
    }

    public double average_Of_Array_Elements(int [] numbers) {
        int total =0;
        double average;
        for (int number : numbers){
            total = total +number;
        }
        average = (double) total/numbers.length;

        return average;
    }


}
