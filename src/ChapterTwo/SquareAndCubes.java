package ChapterTwo;

public class SquareAndCubes {
    public static void main(String[] args) {
        int product =0;
        int product2 =0;
        System.out.printf("%s%10s%10s", "Number","Square","Cube");
        System.out.println();

        for (int i =0; i <=10; i++){
            product = i *i;
            product2 = i *i*i;
            System.out.printf("%s%12s%12s", i, product, product2);
            System.out.println();
        }
    }
}
