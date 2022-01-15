package tVPackage;

import java.util.Scanner;

public class MainTvClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TvClass myTv = new TvClass("Samsung");
        System.out.println("\nYou want to watch television?");

        String key = """
                enter 1 to turn on TV
                """;

        System.out.println(key);
        int power = input.nextInt();
        switch (power){
            case 1:
                if (power == 1) {
                    myTv.turnOn();

                    if (myTv.isOn() == true) {
                        System.out.println(myTv.isOn() + ", Tv is on");
                    } else
                        break;
                }
                do {
                    String tvRemote = """
                            1 to next channel
                            2 to change to previous channel
                            3 to increase TV volume
                            4 to lower TV volume
                            5 to off the TV
                            """;
                    System.out.println(tvRemote);
                    int sel = input.nextInt();
                    switch (sel) {
                        case 1:
                            System.out.println("channel" + myTv.move_Channel_Forward());

                            break;

                        case 2:
                            System.out.println("Channel" + myTv.move_Channels_Backwards());

                            break;

                        case 3:
                            System.out.println("Volume is increased to " + myTv.increase_Volume());
                            break;

                        case 4:
                            System.out.println("Volume is decreased to " + myTv.lower_Volume());
                            break;

                        case 5:
                            myTv.turnOff();
                            if (myTv.isOn() == false) {
                                System.out.println("Goodbye");
                                System.exit(0);
                            }
                            break;
                    }
                } while (true);

        }
    }
}