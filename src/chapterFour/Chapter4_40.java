package chapterFour;

public class Chapter4_40 {
    public static void main(String[] args) {
        double population = 7.9;
        double growthRate = 0.01;
        double populationIncrease;
        double currentPopulation = 7.9;
        double populationDoubled = population + population;
        int populationDoubledYear = 0;
        int year = 1;
        while (year <= 75) {

            population = population +  (growthRate * population);
            populationIncrease =  population - currentPopulation;
            System.out.printf("%d\t\t%.2f\t\t%.2f%n", year, population, populationIncrease);
            year++;

        }
        while (currentPopulation < populationDoubled) {
            currentPopulation = currentPopulation +  (growthRate * currentPopulation);
            populationDoubledYear++;
        }
        System.out.println("The year when the population doubles is "+ populationDoubledYear);
    }
}
