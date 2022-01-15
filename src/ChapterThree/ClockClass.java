package ChapterThree;

public class ClockClass {
    private int hour;
    private int minutes;
    private int second;

    public void setTime(int hour, int minutes, int second){
        if (hour <0 || hour >=24 || minutes <0 || minutes >= 59 || second < 0 || second >= 59){
            throw  new IllegalArgumentException("Hour, minutes or seconds out of range ");
        }
        this.hour = hour;
        this.minutes = minutes;
        this.second = second;
    }

    public String to12Hours(){
        return String.format("%02d:%02d:%02d", hour,minutes,second);
    }

    public String to24Hours(){
        return String.format("%d:%02d:%02d %s",
                ((hour == 0 || hour == 12) ? 12 : hour % 12),
                minutes, second, (hour < 12 ? "AM" : "PM"));
    }

    public static void main(String[] args) {
        ClockClass clock = new ClockClass();
        System.out.println();
        System.out.println("The time at the default contructor - "+clock.to24Hours());

        clock.setTime(23,35,23);
        System.out.println("Time after calling the set method - "+ clock.to24Hours());

        System.out.println("The 24 hours format - "+clock.to12Hours());
    }
}
