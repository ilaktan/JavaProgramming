package Replit_questions;

import java.util.Scanner;

public class SwichChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter command:");
        char response = scan.next().charAt(0);

/*
Write a switch statement that tests the value of the char variable response and performs the following actions:

if response is y, the message Your request is being processed is printed
if response is n, the message Thank you anyway for your consideration is printed
if response is h, the message Sorry, no help is currently available is printed
for any other value of response, the message "Invalid entry, please try again!" is printed
Example:

Display prompt: Enter command:
input: y
Display prompt: Your request is being processed
 */





//WRITE YOUR CODE HERE
        String result= "";

        switch(response){
            case 'y':
                result= "Your request is being processed is printed";
                break;

            case 'n':
                result= "Thank you anyway for your consideration is printed";
                break;
            case 'h':
                result="Sorry, no help is currently available is printed";
                break;

            default:
                result="Invalid entry, please try again!";
                break;
        }
        System.out.println(result);
    }
}
