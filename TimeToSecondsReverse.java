import java.util.Scanner;
public class TimeToSecondsReverse{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		long totalHours=0, totalMinutes=0;
		System.out.println("Enter a time duration in seconds.  It will be converted to a combination of hours, minutes, and seconds.");
		System.out.print("Seconds: ");
		double seconds = in.nextDouble(); //take seconds from user
		totalHours = (long) seconds/3600; //find number of hours in seconds
		seconds-= totalHours*3600; //subtract seconds that are part of these hours
		totalMinutes = (long) seconds/60; //find number of minutes in remaining seconds
		seconds-= totalMinutes*60; //subtract seconds that are part of these minutes
		System.out.println("Total time: " + totalHours + " hours, " + totalMinutes + " minutes, " + seconds + " seconds");
	}
}