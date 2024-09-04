import java.util.*;
public class numberGame {
  public static void main(String[] args) {
    playGame();
  }

  public static void playGame() {
    Scanner sc = new Scanner(System.in);
    int rNumber = (int)(Math.random() * 100) + 1;
    int score = 0;
    for (int i = 0; i < 10; i++) {
      System.out.print("Round " + (i + 1) + ": Enter your guess (1-100): ");
      int userGuess = sc.nextInt();
      if (userGuess == rNumber) {
        System.out.println("Correct!");
        score++;
        break;
      } else if (userGuess < rNumber) {
        System.out.println("Too low!");
      } else if (userGuess < 1 || userGuess > 100) {
        System.out.println("Invalid input! Please enter a number between 1 and 100.");
      }
       else {
        System.out.println("Too high!");
      }
    }
    System.out.println("Game over! Your score is " + score + " out of 10");
    System.out.print("Do you want to play again? (y/n): ");
    String response = sc.next();
    sc.close();
    if (response.equals("y")) {
        playGame();
    }
    else {
        return;
    }
  }
}