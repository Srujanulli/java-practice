package basic;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // Create a tool for reading user input and name it scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String a = scanner.nextLine();
        System.out.println("What is their job?");
        String b = scanner.nextLine();
        System.out.println("Here is the story:\n" +
                "Once upon a time there was " + a +", who was "+ b + "."+
                "\nOn the way to work, "+ a + " reflected on life.\n" +
                "Perhaps "+ a +" will not be "+ b + " forever.");
    }
}
