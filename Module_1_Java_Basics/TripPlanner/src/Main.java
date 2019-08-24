import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math.*;

public class Main {

    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here
        intro();
        budget();
        time();
        distance();
    }

    private static void intro() {
        //takes in user name and destination
        System.out.println("Welcome to vacation Planner!");
        System.out.print("What is your name? ");
        String name = INPUT.nextLine();
        System.out.print("Nice to meet you " + name + ", " + "Where are you travelling to? ");
        String destination = INPUT.nextLine();
        System.out.print("Great! " + destination + " sounds like a great trip");
        Separator();
    }

    private static void budget() {
        //take in days planned on trips, allowance, and converting intro
        System.out.print("How many day are you going to spend travelling? ");
        int days = INPUT.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        int totBudget = INPUT.nextInt();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String currSymbol = INPUT.next();
        System.out.print("How many " + currSymbol + " are there in 1 USD? ");
        float conversionRate = INPUT.nextFloat();

        System.out.println();
        DecimalFormat formatMoney = new DecimalFormat("#.00");

        System.out.println("If you are travelling for " + days + " that is the same as " + (days * 24)
                + " hours or " + (days * 24 * 60) + " minutes");
        System.out.println("If you are going to spend $" + totBudget + " USD that means per day you can spend up to $"
                + formatMoney.format(((float) totBudget / days)) + " USD");
        System.out.println("Your total budget in " + currSymbol + " is " + ((float) totBudget * conversionRate) + " " + currSymbol
                + ", which per day is " + formatMoney.format(((float) totBudget * conversionRate / days)) + " " + currSymbol);
        Separator();
    }

    private static void time() {
        //takes in the time difference between home and destination
        System.out.print("What is the time difference, in hour, between your home and your destination? ");
        float diffTimeZoneHour = INPUT.nextFloat();
        int diffTimeZoneMinutes = (int) ((diffTimeZoneHour - (int) diffTimeZoneHour) * 60);
        DecimalFormat formatMinutes = new DecimalFormat("00");
        String formattedMinutes = formatMinutes.format(diffTimeZoneMinutes);
        System.out.println("That means that when it is midnight at home it will be at " + ((24 + (int) diffTimeZoneHour) % 24) + ":" +
                formattedMinutes + " in your travel destination and when it is noon at home it will be "
                + ((12 + (int) diffTimeZoneHour) % 24) + ":" + formattedMinutes);
        Separator();
    }

    private static void distance() {
        //take in distance between home and destination in square kilometers and
        // converts it into square miles
        System.out.print("What is the square area of your destination country in km2? ");
        double distance = INPUT.nextDouble();
        //kilometers * 0.62137 = miles (LOL why they give wrong value -_-)
        double disInMiles = distance *  0.38610;
        DecimalFormat format = new DecimalFormat("#.0");
        String displayMiles = format.format(disInMiles);
        System.out.println("In miles2 that is " + displayMiles);
        Separator();
    }

    public static void extraDistanceFun() {
        // calculate the distance between the user’s home and their travel destination using the Haversine formula
        // DO NOT TEST THIS METHOD JUST WROTE IT
        double earthRadius = 6.371;
        System.out.print("What is your place latitude and longitude? (Write in order!) ");
        double latHome = INPUT.nextDouble();
        double longHome = INPUT.nextDouble();
        System.out.print("What is your travel destination latitude and longitude? (Write in order!) ");
        double latDes = INPUT.nextDouble();
        double longDes = INPUT.nextDouble();
        System.out.println("The distance between your home and your destination is " + (2 * earthRadius * Math.asin(
                Math.sqrt(Haversine(latHome, latDes) + Math.cos(latDes) * Math.cos(latHome) * Haversine(longHome, longDes)
                )
                    )
                        )
                + " km");
    }

    private static double Haversine(double coordinate1, double coordinate2) {
        double temp = Math.sin((coordinate2 - coordinate1) / 2);
        return temp * temp;
    }

    private static void Separator() {
        System.out.println();
        System.out.println("************");
    }
}
