import java.util.Scanner;
public class TimeToSecondsReverse{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int totalHours=0, totalMinutes=0;
		double totalSeconds;
		System.out.println("Enter a time duration in seconds.  It will be converted to a combination of hours, minutes, and seconds.");
		System.out.print("Seconds: ");
		double seconds = in.nextDouble();
		for(; seconds>=3600; seconds-=3600){
			totalHours++;
		}
		for(; seconds>=60; seconds-=60){
			totalMinutes++;
		}
		totalSeconds=seconds;
		System.out.println("Total time: " + totalHours + " hours, " + totalMinutes + " minutes, " + totalSeconds + " seconds");
	}
}