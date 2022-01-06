package ChapterThree;

import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

public class HeartRate {
    private String firstName;
    private String lastName;
    private static int dateOfBirth;
    private int month,day,year;

//No args constructor
    public HeartRate(){
    }

    public HeartRate(String firstName, String lastName, int dateOfBirth){
        this.firstName = firstName;
        this.lastName =lastName;
        this.dateOfBirth = dateOfBirth;

    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public static int getAgeInYears(){
        Date date = new Date();
        int yearNow = date.getYear();
        int currentYear = yearNow +1900;
        int age = currentYear - dateOfBirth;
        return age;
    }

    public int maximumHeartRate(){
        int maximumHeartRate = 220 - getAgeInYears();
        return maximumHeartRate;
    }

    public double targetHeartRate(){
        double targetHeartRate = 0.5 * maximumHeartRate();

        return targetHeartRate;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first Name");
        String firstName = input.nextLine();

        System.out.println("Enter your second name");
        String lastName = input.nextLine();

        System.out.println("Enter your date of birth");
        int dateOfBirth = input.nextInt();


        HeartRate rate = new HeartRate();

        rate.setFirstName(firstName);
        rate.setLastName(lastName);
        rate.setDateOfBirth(dateOfBirth);


        System.out.println("First Name: "+rate.getFirstName());
        System.out.println("Last Name: "+rate.getLastName());
        System.out.println("Date of Birth: "+rate.getDateOfBirth());
        System.out.println("Age in years: "+rate.getAgeInYears());
        System.out.println("Maximum heart Rate: "+rate.maximumHeartRate());
        System.out.println("Target Heart Rate: "+rate.targetHeartRate());
    }
}
