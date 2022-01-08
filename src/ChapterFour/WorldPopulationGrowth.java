package ChapterFour;

public class WorldPopulationGrowth {

    private static final double WORLD_GROWTH_RATE = 0.0105;//1.05%
    private static double world_Population = 7900000000.0;
    private static double numeric_Increase =0;


    public static void populationGrowth(){
    double population_Growth = world_Population * WORLD_GROWTH_RATE;
        System.out.printf("%S   %S     %S", "Year", "World Pop.", "Numeric Pop Increase \n");

        for (int year = 2022; year <=2097; year++){
            world_Population = world_Population + population_Growth;
            numeric_Increase = world_Population - 7900000000.0;
            System.out.printf("%d   %.2f  %.2f",year, world_Population, numeric_Increase);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        WorldPopulationGrowth population = new WorldPopulationGrowth();
        population.populationGrowth();
    }
}
