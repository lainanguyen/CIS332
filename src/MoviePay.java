import java.util.Scanner;

public class MoviePay {
    public static void main(String[] args) {
        // Variables
        // Parallel arrays
        String[] titles = {"Avatar: The Way of Water", "M3GAN", "Puss in Boots: The Last Wish"};
        String[] ratings = {"PG-13", "R", "PG"};
        double[] movieCost = {22.50, 13.00, 8.00};

        System.out.println("Welcome to MoviePay!");
        System.out.println("Here are your options today: ");

        // Print out titles to the screen
        for (int i = 0; i < titles.length; i++){
            System.out.println((i+1) + ". " + titles[i]);
        }

        System.out.println("Please provide your name and age to the system.");

        // Create scanner object
        Scanner userInput = new Scanner(System.in);

        // User general data
        String userName = userInput.nextLine();
        int userAge = userInput.nextInt();
        System.out.println("Name: " + userName + ", Age: " + userAge);

        // User movie choice
        System.out.println("Please Choose a Movie to Watch Today: (Input a number)");

        int userMovieChoice = userInput.nextInt();

        boolean oldEnough = true; // create function later

        if (oldEnough) {
            System.out.println("You are old enough to see this film.");
            //pay for movie
            System.out.println("This movie costs " + movieCost[userMovieChoice-1]);
            System.out.println("How much are you paying with?");
            float userPayment = userInput.nextFloat();
            double change = userPayment - movieCost[userMovieChoice-1];
            System.out.println(change); //Finish up making change look pretty
        } else {
            System.out.println("You are NOT old enough to see this film.");
            System.out.println("Have a nice day.");
        }

    }
}
