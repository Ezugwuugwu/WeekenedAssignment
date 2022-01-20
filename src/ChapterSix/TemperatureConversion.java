package ChapterSix;

import java.util.Scanner;

public class TemperatureConversion {

    public static void main(String[] args) {
        TemperatureConversion tempConversion = new TemperatureConversion();
        tempConversion.convert_Temperature();
    }

    public double fahrenheit_To_Celsius(double fahrenheit){
        double celsius = 5.0/9.0 * (fahrenheit - 32);

        return celsius;
    }

    public double celsius_To_Fahrenheit(double celsius){
        double fahrenheit = 9.0/5.0 * celsius +32;

        return fahrenheit;
    }

    public void convert_Temperature(){
        Scanner input = new Scanner(System.in);
        String format = """
                Enter 1 to convert fahrenheit to Celsius
                Enter 2 to convert Celsius to fahrenheit
                """;
        System.out.println(format);
        int tempFormat = input.nextInt();
        switch (tempFormat){
            case 1:
                System.out.println("Enter temperature in fahrenheit");
                double fahrenheitTemp = input.nextDouble();
                double fahResult = fahrenheit_To_Celsius(fahrenheitTemp);
                System.out.println("Result in degree celsius is "+fahResult);
                break;

            case 2:
                System.out.println("Enter tempereature in degree celsius");
                double tempInDegree = input.nextDouble();
                double celsiusResult =   celsius_To_Fahrenheit(tempInDegree);
                System.out.println("result in fahrenheit is "+celsiusResult);
                break;
        }
    }
}
