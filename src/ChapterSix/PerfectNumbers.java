package ChapterSix;

public class PerfectNumbers {
    public static void main(String[] args) {
        PerfectNumbers perfectNumbers = new PerfectNumbers();
        perfectNumbers.check_Perfect_Numbers();
    }

    public void check_Perfect_Numbers() {
        for (int num = 1; num <= 1000; num++) {
            if (isPerfect(num)) {
            System.out.println("The number " + num + " is a perfect number!");}}
    }

    public static Boolean isPerfect(int num) {
        int sum = 0;
        for (int factor = 1; factor < num; factor++) {
            if(num % factor == 0) {
              sum += factor;}}

        if (sum == num) {
            return true;
        } else {
            return false;
        }
    }

}

