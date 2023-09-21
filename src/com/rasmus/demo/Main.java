package com.rasmus.demo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player player = new Player();

        do {
            System.out.println("Insert your name please");
            String result = sc.nextLine();

            player.name = result;

            System.out.println("Your name is: " + player.name);
            System.out.println();

        } while (true);

        /*while (!sc.hasNextInt()) {
            System.out.println("That's not a number!");
            sc.next();

         */
    }

}
