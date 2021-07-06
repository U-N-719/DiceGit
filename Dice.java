import java.util.Scanner;

public class Dice{
    public static void main(String[] args){
       	Scanner scanner = new Scanner(System.in);
	System.out.println("What is your name?");
	System.out.print(">");
	String name = scanner.next();
	System.out.println("Hello, "+name+"!");

      	System.out.println("Rolling the dice...");
	int val1 = (int)(Math.random() * 6 )+1;
	System.out.println("Die 1: "+val1);
	int val2 = (int)(Math.random() * 6 )+1;
	System.out.println("Die 2: "+val2);
	System.out.println("Total value: " + (val1+val2));
	
	int all = val1+val2;
	if(all>7){
	    System.out.println(name + " won!");
	}else{
	    System.out.println(name + " lost!");
	}

	
    }
}
