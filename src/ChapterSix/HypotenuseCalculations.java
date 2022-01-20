package ChapterSix;

public class HypotenuseCalculations {
    public double hypotenuse(int opposite, int adjacent){
        double hypotenuse = Math.sqrt(Math.pow(opposite,2) + Math.pow(adjacent,2));

        return hypotenuse;
    }

    public void get_Hypotenuse(){
        double triangleOneHypotenuse = hypotenuse(3,4);
        double triangleTwoHypotenuse = hypotenuse(5,12);
        double triangleThreeHypotenuse = hypotenuse(8,15);
        System.out.printf("%s%15s%15s","Triangle1","Triangle2","Triangle3\n");
        System.out.printf("%.2f%17.2f%17.2f",triangleOneHypotenuse, triangleTwoHypotenuse, triangleThreeHypotenuse);
    }

    public static void main(String[] args) {
        HypotenuseCalculations hypotenus = new HypotenuseCalculations();
        hypotenus.get_Hypotenuse();
    }
}
