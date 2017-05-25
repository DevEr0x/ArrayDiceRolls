/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicerollsarray;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ermaz0018
 */
public class DiceRollsArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numRolls;
        Random rand = new Random();
        int outcome = 0;
        int dieCount;
        int dieSides;
        int result;

        /* prompt user for sides of die */
        System.out.print("How many sides on the die? ");
        dieSides = input.nextInt();

        /* prompt user for amount of die */
        System.out.print("\nHow many die should be rolled? ");
        dieCount = input.nextInt();

        /* prompt user for number of rolls */
        System.out.print("\nHow many rolls? ");
        numRolls = input.nextInt();

        result = (dieSides * dieCount);
        int[] outcomes = new int[result+1];		//array with indices 0 through 12

        /* roll dice and add up outcomes */
        for (int roll = 0; roll < numRolls; roll++) {
            for (int die = 0; die <= dieCount; die++) {
                outcome = (rand.nextInt(dieSides) + 1);
            }
            outcomes[outcome] += 1;
        }

        /* show counts of outcomes */
        for (int i = dieCount; i <= result; i++) {
            System.out.println(i + ": " + outcomes[i]);
        }
    }

}
