
    public class GuessingGame {
        public static void main(String[] args) {
            int guess = 444;
            int secretNumber = 444;

            if (guess > secretNumber) {
                System.out.println("Your guess is TOO HIGH : Guess Again");}
             else if(guess < secretNumber) {
                System.out.println("Your guess is TOO LOW: Guess Again");
            }
            else {
                System.out.println("Correct: YOU WIN!!!!");
            }
        }
    }



