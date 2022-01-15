package ChapterTwo;

import java.util.Scanner;

public class PopulationGrowthCounter {
Scanner input = new Scanner(System.in);
    double world_Population;
    double growth_rate;

    public void collect_World_Population_Input(){
        System.out.println("Enter current population of the world");
        world_Population = input.nextDouble();
        System.out.println("Enter popualtion growth rate");
        growth_rate = input.nextDouble();
    }

    public void calulate_World_Population(){
        double population_Growth = world_Population * growth_rate;
        System.out.printf("%s  %s", "Year", "Population\n");
        for (int year = 1; year <= 5; year++){
            world_Population = world_Population + population_Growth;
            System.out.printf("%d    %.2f",year, world_Population);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PopulationGrowthCounter population = new PopulationGrowthCounter();
        population.collect_World_Population_Input();
        population.calulate_World_Population();
    }
}
