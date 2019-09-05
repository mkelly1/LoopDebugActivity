import java.util.Scanner;

public class EndlessStrings {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        boolean loop = true;
        String userInput;

        while (loop) {
            System.out.print("Enter a string : ");
            userInput = keyboard.nextLine();
            System.out.println("You typed : " + userInput);
            System.out.print("Do you want to continue? Enter true or false : ");
            try {
                loop = keyboard.nextBoolean();
                keyboard.nextLine();             //this 'extra' .nextLine is to get rid of the \n at the end of the scanner buffer
            } catch (Exception e) {              // if user enters a non boolean give error message and continue loop
                System.out.println(e);
                System.out.println("Bad input. Try again");
                keyboard.nextLine();            //this 'extra' .nextLine is to get rid of the \n at the end of the scanner buffer
            }
            if(!loop){
                System.out.println("Program ended.");
            }
        }
    }
}

