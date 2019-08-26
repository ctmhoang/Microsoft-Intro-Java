//Write a method called inputBirthday that accepts a Scanner for the console as a parameter and
//prompts the user to enter a month, day, and year of birth, then prints the birthdate in a suitable format.
//Here is an example dialogue with the user:

//On what day of the month were you born? 8
//What is the name of the month in which you were born? May
//During what year were you born? 1981
//You were born on May 8, 1981. You're mighty old!

public static void inputBirthday(Scanner input) {
	print("On what day of the month were you born? ");
    int day = input.nextInt();
    print("What is the name of the month in which you were born? ");
    String month = input.next();
    print("During what year were you born? ");
    int year = input.nextInt();
    print("You were born on " + month + " " + day + ", " + year + ". "+ "You're mighty old!");
}
private static void print(String s){
    System.out.print(s);
}
