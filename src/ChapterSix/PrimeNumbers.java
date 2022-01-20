package ChapterSix;

public class PrimeNumbers {

    public static void main(String[] args) {
        PrimeNumbers prime = new PrimeNumbers();
        prime.isPrime(10000);
    }

public void isPrime(int number){
    for (int i = 2; i <= number; i++) {

        int count = 0;
        for (int j = 2; j <= i / 2; j++) {
            if (i % j == 0) {
                count++;
                break;}
        }
        if (count == 0) {
            System.out.println(i);
        }
    }
}
}
