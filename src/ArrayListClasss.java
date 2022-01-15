import java.util.ArrayList;

public class ArrayListClasss {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("Benz");
        cars.add("Wagon");
        cars.add("Mark");

        for ( int i =0; i < cars.size(); i++){
            System.out.println(cars.get(0));
        }
    }
}
