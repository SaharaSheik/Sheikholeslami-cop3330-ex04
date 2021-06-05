package challenge1;

/*

 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sahar Sheikholeslami

 */

import java.util.Scanner;

/*
Exercise 4 - Mad Lib
Mad libs are a simple game where you create a story template with blanks for words. Y
ou, or another player, then construct a list of words and place them into the story,
creating an often silly or funny story as a result.

Create a simple mad-lib program that prompts for a noun,
a verb, an adverb, and an adjective and injects those into a story that you create.

Example Output
Enter a noun: dog
Enter a verb: walk
Enter an adjective: blue
Enter an adverb: quickly
Do you walk your blue dog quickly? That's hilarious!
Constraints
Use a single output statement for this program.
If your language supports string interpolation or string substitution, use it to build up the output.

Challenges
Add more inputs to the program to expand the story.
Implement a branching story, where the answers to questions determine how the story is constructed.
 */
public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String noun = input.next();
        System.out.print("Enter a verb: ");
        String verb1 = input.next();
        System.out.print("Enter a adjective: ");
        String adjective = input.next();
        System.out.print("Enter a adverb: ");
        String adverb = input.next();

        if (noun.equals("dog")) {
            System.out.print("Enter a verb: ");
            String verb2 = input.next();
            System.out.print("Enter a noun: ");
            String noun2 = input.next();

            String madLib = String.format("Do you %s your %s %s %s? That's hilarious!, can you %s the %s instead?", verb1, adjective, noun, adverb, verb2, noun2);
            System.out.println(madLib);
        }
        if (noun.equals("cat")) {
            System.out.print("Enter a adjective: ");
            String adjective2 = input.next();
            System.out.print("Enter a verb: ");
            String verb2 = input.next();

            String madLib = String.format("Do you %s your %s %s %s? No way! cats are %s they don't %s?", verb1, adjective, noun, adverb, adjective2, verb2);
            System.out.println(madLib);


        }

    }


}