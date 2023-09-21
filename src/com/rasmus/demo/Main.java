package com.rasmus.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player player = new Player();
        boolean isPlaying = true;

        System.out.println("Insert your name please");
        String result =sc.nextLine();

        player.name = result;

        System.out.println("Player #1: " + player.name);

        int loop = 0;

        if (isPlaying) {
            System.out.println("Write a number of loops you'd like to create");

        } while (isPlaying) {

            try {
                loop = sc.nextInt();
                sc.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please enter a number");
                sc.nextLine();
            }
        }

        player.loop = loop;

        for (int i = 1; i <= loop; i++) {
            System.out.println("Loop# " +i);
        }

        do {
            System.out.println("Choose and action");
            System.out.println("'1': Throw");
            System.out.println("'stop': Close application");

            String choice = sc.nextLine();

            switch (choice.toLowerCase()) {
                case "1":
                    System.out.println("Throwing!");
                    break;
                case "stop":
                    isPlaying = false;
                    break;
                default:
                    System.out.println("Wrong input");
            }

            /*if (stop.equalsIgnoreCase("stop")) {
                isPlaying = false;
            }

             */

        } while (isPlaying);

        /*while (!sc.hasNextInt()) {
            System.out.println("That's not a number!");
            sc.next();

         */
    }

}
