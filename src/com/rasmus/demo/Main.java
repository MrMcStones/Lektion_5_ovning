package com.rasmus.demo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player player = new Player();
        boolean isPlaying = true;

        do {
            System.out.println("Insert your name please");
            String result =sc.nextLine();

            player.name = result;

            System.out.println("Write a number you'd like to loop");
            int loop = sc.nextInt();

            sc.nextLine();

            player.loop = loop;

            System.out.println("Player #1: " + player.name);

            for (int i = 1; i <= loop; i++) {
                System.out.println("Loop# " +i);
            }

            System.out.println("Write 'stop' to stop application");
            String stop = sc.nextLine();

            if (stop.equalsIgnoreCase("stop")) {
                isPlaying = false;
            }

        } while (isPlaying);

        /*while (!sc.hasNextInt()) {
            System.out.println("That's not a number!");
            sc.next();

         */
    }

}
