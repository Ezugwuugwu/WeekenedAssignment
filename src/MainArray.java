import java.util.Arrays;
import java.util.Scanner;

public class MainArray {

    public static void main(String[] args) {

        Scanner userinput = new Scanner(System.in);
        int i;
        //declaring array of length 10
int[] array = new int[10];
        System.out.printf("%s%8s", "Index", "Value");
        System.out.println();
        for (int counter =0; counter <array.length; counter++) {
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }


        int [] scores = new int[10];

        Scanner uInput = new Scanner(System.in);
        int number;
        for (number =0; number < scores.length; number++){
            System.out.println(number);
            System.out.println();
            System.out.println("Enter an input");
            scores [number] = uInput.nextInt();
        }
        System.out.println(Arrays.toString(scores));

        int [] num = {2,54,56,67,8,8987,9,8,66};
        System.out.println();
        int count;
        int total = 0;
        System.out.printf("%4s%s%n","index","Elements");
        System.out.println();
        for (count = 0; count < num.length; count++){
            System.out.printf("%3d%8d%n", count, num[count]);
        }
        for (count =0; count < num.length; count++){
            total = total +num[count];

        }
        System.out.println(total);



//        Scanner input = new Scanner(System.in);
//        int i;
//        int [] array = new int[3];
//
//        System.out.printf("%3s%5s", "Index", "element");
//        System.out.println();
//        for (i =0; i <array.length; i++){
//            System.out.printf("%s%5d%n",i,array[i]);
//        }
//        for (i =0; i <array.length; i++){
//            System.out.println("Enter a number");
//            array[i] = input.nextInt();
//        }
//
//        for (i =0; i <array.length; i++){
//            System.out.println(array[i]);
//        }


        }



    }

