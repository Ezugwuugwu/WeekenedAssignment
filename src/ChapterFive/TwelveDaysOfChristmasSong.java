package ChapterFive;

import java.util.Scanner;

public class TwelveDaysOfChristmasSong {
    public static void main(String[] args) {
        int i =0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Choose the day 1-12");
            int day = input.nextInt();
            if (day <= 12) {
            for (i = 1; i <= 12; i++) {
                switch (day) {
                    case 1:
                        if (day == 1)
                            System.out.println("First Day");
                        break;

                    case 2:
                        if (day == 2)
                            System.out.println("Second Day");
                        break;

                    case 3:
                        if (day == 3)
                            System.out.println("Third Day");
                        break;

                    case 4:
                        if (day == 4)
                            System.out.println("Fourt Day");
                        break;
                    case 5:
                        if (day == 5)
                            System.out.println("Fift Day");
                        break;

                }

                for (i = 0; i <= 12; i++) {
                    switch (i) {
                        case 1:
                            if (day == 1)
                                System.out.println("Mocking bed - Eminem");
                            break;

                        case 2:
                            if (day == 2)
                                System.out.println("Expensive pain - Meek Mill");
                            break;

                        case 3:
                            if (day == 3)
                                System.out.println("Bad Santa - Chillinit");
                            break;

                        case 4:
                            if (day == 4)
                                System.out.println("Crown of clay - Vector");
                            break;

                        case 5:
                            if (day == 5)
                                System.out.println("Drinking and smoking - Future");
                    }
                }
            }
        } else {
            System.out.println("Wrong input: enter day 1 - 12");
        }
        System.out.println(day);
        System.out.println(i);
        }while (true);

    }
}