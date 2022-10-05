package com.company.OOPs;
import java.util.*;
public class GuessTheNoGame {
    public static void main(String[] args) {
    Game guess=new Game();
    guess.play();
        System.out.println("Total no of guesses u took is="+guess.NoOfGuesses());
    }
}
class Game
{
    int random,input,no;
    Game() {
      random= (int) (Math.random() * 100);
    }
    public void takeUserInput() {
        Scanner sc=new Scanner(System.in);
        input=sc.nextInt();
    }
    public int NoOfGuesses() {
        return no;
    }
    public boolean isCorrectNumber() {
        return random != input;
    }
    public void play() {
        while(isCorrectNumber()) {
            System.out.println("Guess the no between 0 to 99");
            takeUserInput();
            if(input<random) {
                System.out.println("The no you guessed is smaller than the real no");
            }
            else if(input>random) {
                System.out.println("The no you guessed is larger than the real no");
            }
            no++;
        }
        System.out.println("Finally you guessed the no \n Congratulation \n The No was="+input);
    }
}
