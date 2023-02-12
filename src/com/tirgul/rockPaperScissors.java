package com.tirgul;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class rockPaperScissors {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int countWin = 0, countLose = 0;
        String choice;
        //boolean games = true , continues = true;
        System.out.println("How many rounds would you like to play? ");
        int rounds = Integer.parseInt(scan.nextLine());

        loop:
        for (int i = 0; i < rounds; i++) {
            System.out.println("ROUND #" + (i+1));
            System.out.println("Please enter your choice: [rock | paper | scissors] : ");
            choice = scan.nextLine();
            //choice = validateString(choice);
            if ((!choice.equals("rock")) && (!choice.equals("paper")) && (!choice.equals("scissors"))) {
                System.out.println("Please choose one options: ");
                choice = scan.nextLine();
                //continue loop;
            }

            String computerMove = randomChoice();

            System.out.println("Your move is: " + choice);
            System.out.println("Computer move is: " + computerMove);
            if (choice.equals(computerMove)) {
                System.out.println("It's a draw!\n-------------------------");
            } else if (playerWins(choice, computerMove)) {
                System.out.println("You win!\n-------------------------");
                countWin++;
            } else {
                System.out.println("Computer wins!\n-------------------------");
                countLose++;
            }

        }
        System.out.println("You won: " + countWin + " games!");
        System.err.println("Computer won: " + countLose + " games!");
    }

        private static String randomChoice() {
            String[] arr = {"rock", "paper", "scissors"};
            int randIdx = ThreadLocalRandom.current().nextInt(arr.length);
            return arr[randIdx];

        }
        
        private static boolean playerWins(String choice, String computerMove){
            if (choice.equals("rock")){
                return computerMove.equals("scissors");
            }
            else if (choice.equals("paper"))
                return computerMove.equals("rock");
            else return computerMove.equals("paper");
        
        }

        private static String validateString (String choice){
            choice = choice.replaceAll("\\s+", "");
            choice = choice.toLowerCase();
            if ((!choice.equals("rock")) && (!choice.equals("paper")) && (!choice.equals("scissors"))) {
                System.out.println("Please choose one options: ");
                //string = string.nextLine();
            }
                return choice;
        }
}

