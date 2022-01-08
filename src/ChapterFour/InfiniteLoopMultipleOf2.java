package ChapterFour;

import java.util.Scanner;

public class InfiniteLoopMultipleOf2 {
    Scanner input = new Scanner(System.in);
    public void multipleOf2(){

            for (int i = 2; i > 0; i++) {
                if (i % 2 == 0)
                System.out.println(i * 2);
            }
    }

    public static void main(String[] args) {
        InfiniteLoopMultipleOf2 multipleOf2 = new InfiniteLoopMultipleOf2();
        multipleOf2.multipleOf2();
    }
}
