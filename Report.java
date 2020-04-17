//.......1.........2.........3.........4.........5.........6.........7.........8
/**
 * Write a description of class Report here.
 *
 * @author (Raphael Juco)
 * @version (3/3/2018)
 */
public class Report
{
    /*
     * These instance variables are public because I need to be able to access
     * them in the testingMethod().
     */
    public double range;
    public double average;
    /**
     * This method prints out the stats to the window.
     */
    public void writeReport(){
        /*
         * We create an object of class Race and assign it to a variable.
         * We then call methods and instance variables from the class Race 
         * and assign them to variables to access them in this class. 
         */
        Race race = new Race(); 
        race.readInTimes();
        double raceTime1 = race.raceTime1;
        double raceTime2 = race.raceTime2;
        double raceTime3 = race.raceTime3;
        race.sortTimesAscending();//Calling a method in the object
        double first = race.first;
        double second = race.second;
        double third = race.third;
        range = (first - third) * (-1);//We want the absolute value
        average = (first + second + third) / 3;

        System.out.println(raceTime1 + ", " + raceTime2 + ", " + raceTime3);
        System.out.println();
        System.out.println("First place (time in seconds): " + first);
        System.out.println("Second place (time in seconds): " + second);
        System.out.println("Third place (time in seconds): " + third);
        race.tiedRaceTimes();//Calls the method of class race

        System.out.print("The range of the race times (in seconds): ");
        System.out.printf("%3.2f",range);
        System.out.println();
        System.out.print("The average time of all racers (in seconds): ");
        System.out.printf("%3.2f", average);
        System.out.println();
    }
}
