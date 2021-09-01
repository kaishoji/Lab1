import java.util.Scanner; 

// ---------------- CLASS HEADER ---------------------- 
// Author: Kai Shoji Ohsawa
// FILENAME: Lab1.java
// SPECIFICATION: This will accept user-input test scores and calculate the average out of three.
//                It will also show this to the user through the console.
// FOR: CSE 110- Lab #1
// TIME SPENT: 2 hours

public class Lab1 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        double test_one, test_two, test_three;

        // prompts user for first test score, sets input to be stored in var. test_one.
        System.out.println("Please input your first test score.");
        test_one = in.nextInt();
        System.out.println("Your first test score is " + test_one);

        // prompts user for two test score, sets input to be stored in var. test_two.
        System.out.println("Please input your second test score.");
        test_two = in.nextInt();
        System.out.println("Your second test score is " + test_two);

        // prompts user for third test score, sets input to be stored in var. test_three
        System.out.println("Please input your third test score.");
        test_three = in.nextInt();
        System.out.println("Your second test score is " + test_three);
        System.out.println();

        // this sets the var NUM_TESTS as a constant 3 for total # of tests.
        final int NUM_TESTS = 3;
        // sets equation to calc. test avg.
        double test_average = (test_one + test_two + test_three) / NUM_TESTS;

        System.out.println("Your average test score is " + test_average);
    }
}