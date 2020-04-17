//.......1.........2.........3.........4.........5.........6.........7.........8
import java.util.Scanner;
/**
 * Driver for Race.
 *
 * @author (Raphael Juco)
 * @version (3/3/2018)
 */
public class ReportDriver
{
    /*
     * This is private because I only need to use and modify this in this 
     * class. This is static because all of our methods in this class that 
     * accesses this are static. This creates an object of class Report and 
     * assigns it to variable report.
     */
    private static Report report = new Report();
    /**
     * In the main, we execute the race at least once before prompting the 
     * user to race again or not, which then enters the loop and exits it when
     * the user states so.
     */
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        boolean repeat = true;
        report.writeReport();//Calls the method in object report
        System.out.println();
        System.out.println("Enter another race? (y/n): ");
        char yesOrNo = keyboard.next().charAt(0);//Reads the first char
        //testingMethod();
        /*
         * Continues to execute as long as the user responds with "y"
         * else to system exits.
         */
        while(repeat = true){//Just a dummy to keep the loop running
            if(yesOrNo == 'y'){
                report.writeReport();
                System.out.println();
                System.out.println("Enter another race? (y/n): ");
                yesOrNo = keyboard.next().charAt(0);
            }
            else{
                System.exit(0);
            }
        }
    }

    /**
     * This is the testing method which allows us to see what are the 
     * values stored in each variable.       
     */
    public void testingMethod(){
        Race race = new Race();
        double raceTime1 = race.raceTime1;
        double raceTime2 = race.raceTime2;
        double raceTime3 = race.raceTime3;
        double average = report.average;
        double range = report.range;

        System.out.println(average);
    }
}
