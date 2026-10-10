import java.util.Scanner;

public class java{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String answer;

        System.out.println("Think of one mushroom.");
        System.out.println("Answer using yes or no.");

        // Question 1
        System.out.print("Does it have a convex cap? ");
        answer = input.nextLine();

        if (answer.equalsIgnoreCase("yes")) {

            // Question 2
            System.out.print("Does it grow in a forest? ");
            answer = input.nextLine();

            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Your mushroom is: Agaric jaunissant");
            } 
            else {
                // Question 3
                System.out.print("Does it have a ring? ");
                answer = input.nextLine();

                if (answer.equalsIgnoreCase("yes")) {
                    System.out.println("Your mushroom is: Amanite tue-mouche");
                } 
                else {
                    System.out.println("Your mushroom is: Pied bleu");
                }
            }

        } 
        else {

            // Question 2
            System.out.print("Does it have gills? ");
            answer = input.nextLine();

            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Your mushroom is: Cepe de bordeaux");
            } 
            else {

                // Question 3
                System.out.print("Does it grow in a forest? ");
                answer = input.nextLine();

                if (answer.equalsIgnoreCase("no")) {
                    System.out.println("Your mushroom is: Coprin chevelu");
                } 
                else {
                    System.out.println("Your mushroom is: Girolle");
                }
            }
        }

        input.close();
    }
}
