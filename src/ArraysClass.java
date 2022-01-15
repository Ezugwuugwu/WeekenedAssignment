import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {

        double[] numbers = {6.0,6.0,5.0,6.0,7.0,};
        Arrays.sort(numbers);
//        Arrays.fill(numbers, 7.0);
//        Arrays.fill(numbers,3,9,6);
//        System.out.println("Original Arrays is "+Arrays.toString(numbers));
        double binarySearch = Arrays.binarySearch(numbers,6.0);
        if (binarySearch > 0){
            System.out.println(binarySearch);
        }else{
            System.out.println("Number not found");
        }

        double [] arrayNumbers = Arrays.copyOfRange(numbers,0,7);
        System.out.println("\nAfter copying the original arrays ");
        for (double num : arrayNumbers){
            System.out.println(num);
        }


        double[] comp = Arrays.copyOf(numbers, numbers.length);
        boolean compr = Arrays.equals(numbers,comp);
        System.out.println(compr);


        boolean compare = Arrays.equals(numbers,arrayNumbers);
        System.out.println(compare);
    }
}
