//.......1.........2.........3.........4.........5.........6.........7.........8
import java.util.Scanner;
/**
 * Write a description of class Race here.
 *
 * @author (Raphael Juco)
 * @version (3/3/2018)
 */
public class Race
{
    /*
     * These instance variables are public because I need to call them in 
     * our main method in order to print them out to the window.
     */
    public double raceTime1, raceTime2, raceTime3;
    public double first, second, third;

    /**
     * This method asks the user to enter the race times, then it reads it and 
     * assigns those values to a variable.
     */
    public void readInTimes(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the race times (in seconds):");
        raceTime1 = keyboard.nextDouble();
        raceTime2 = keyboard.nextDouble();
        raceTime3 = keyboard.nextDouble();
    }

    /**
     * This method lists all the possible combination of positions 
     * between the race time values can have using multiway 
     * if-else.
     */
    public void sortTimesAscending(){
        if(raceTime1 <= raceTime2 && raceTime2 <= raceTime3){
            first = raceTime1;
            second = raceTime2;
            third = raceTime3;
        }
        else if(raceTime1 <= raceTime3 && raceTime3 <= raceTime2){
            first = raceTime1;
            second = raceTime3;
            third = raceTime2;
        }
        else if(raceTime2 <= raceTime1 && raceTime1 <= raceTime3){
            first = raceTime2;
            second = raceTime1;
            third = raceTime3;
        }
        else if(raceTime2 <= raceTime3 && raceTime3 <= raceTime1){
            first = raceTime2;
            second = raceTime3;
            third = raceTime1;
        }
        else if(raceTime3 <= raceTime2 && raceTime2 <= raceTime1){
            first = raceTime3;
            second = raceTime2;
            third = raceTime1;
        }
        else if(raceTime3 <= raceTime1 && raceTime1 <= raceTime2){ 
            first = raceTime3;
            second = raceTime1;
            third = raceTime2;
        }
    }

    /**
     * This method tests if there are any race time values that are equal, 
     * then reports to the window that there are racers tied for the same
     * position. If there are none, then it reports nothing.
     */
    public void tiedRaceTimes(){
        if(first == second){
            if(first < third){
                System.out.println("Two racers shared first place.");
            }
            if(first == third){
                System.out.println("All racers shared first place.");
            }
        }
        else if(second == third){
            if(first < second){
                System.out.println("Two racers shared second place.");
            }
        }
        else{
            System.out.println();
        }
    }
}
//.......1.........2.........3.........4.........5.........6.........7.........8