package ChapterFive;

public class ProductOfOddNumbers {
    public static void main(String[] args) {
        int product = 1;
        int total = 0;
        for (int i = 1; i <= 15; i ++){
            if (i % 2 != 0){
                System.out.println(i);
                product = product * i;
            }
        }
        System.out.println("\nProduct of the numbers is "+product);
    }
}
