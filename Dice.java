import java.util.Scanner;

public class Dice{
    public static void main(String[] args){

      	System.out.println("Rolling the dice...");
	int val1 = (int)(Math.random() * 6 )+1;
	System.out.println("Die 1: "+val1);
	int val2 = (int)(Math.random() * 6 )+1;
	System.out.println("Die 2: "+val2);
	System.out.println("Total value: " + (val1+val2));

    }
}
