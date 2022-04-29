package com.assighnment;
import java.util.Scanner;
public class HighLow {
	    int correct;
	    HighLow() {
	        this.correct = (int) (Math.random() * 100) + 1;
	    }
	    public String higherOrLower(int guess) {
	        if(guess > this.correct) {
	            return "Lower!";
	        }
	        else {
	            return "Higher!";
	        }
	    }
	    public void guess() {
	        Scanner scan = new Scanner(System.in);
	        int guess = 0;
	        int count = 0;
	        while(count < 10) {
	            System.out.println("Enter your guess try "+ ++count);
	            guess = scan.nextInt();
	            if(guess == this.correct) {
	            	System.out.println("\n");
	            	System.out.println("Perfect");
	                System.out.println("Correct after "+count+" guesses.");
	                break;
	            }
	            System.out.println(this.higherOrLower(guess));
	            if(count == 10) System.out.println("Sorry! You failed.");
	        }
	        }
	    public static void main(String[] args) {
	        System.out.println("Guess the no between 1 to 100");
	        HighLow HL = new HighLow();
	        HL.guess();
	        System.out.println("The correct number was: "+HL.correct);
	    }
	}