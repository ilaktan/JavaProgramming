package ReplitQuestions;

import java.util.Scanner;

public class WordsEqualOrNot {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
       String word1= scan.next();
       String word2=scan.next();
/*

In this assignment you are given two string variables word1 and word2.

Check if they are equal

Comparison should be case sensitive. "java" and "JaVa" are not equal.

if they are equal output "word1 equals word2"

otherwise output "word1 does not equal word2"

Input:
java
java

output:
word1 equals word2

Copied!
Input:
foo
bar

output:
word1 does not equal word2
 */
if(word1.equals(word2)){
    System.out.println("word1 equals word2");
}else {
    System.out.println("word1 does not equal word2");
}




    }
}
