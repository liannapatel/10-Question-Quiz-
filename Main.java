//Lianna Patel 
//ICS3U 
//Array's Assignment
//November 14 2022
//This program works with arrays of strings and uses multiple arrays in the program. Combines loops and arrays to create a 10-question quiz. 

import java.util.Scanner; 
class Main {
  public static void main(String[] args) {

 Scanner kb = new Scanner(System.in); 
  System.out.println("How many questions would you like?");
    int q = kb.nextInt();
    
         String[] Questions = new String[11]; // creating an array
        int[] score = new int[11]; 
        String[] rightAnswer = new String[11];
        String[] userAnswer = new String[11];

        int scores = 0, possiblePoints = 0;
        
    System.out.println("Welcome to this mind-twisting quiz!");

      Questions[0] = "Name the biggest island in the world";//assigning different messages to the different index
      Questions[1] = "What is the most common surname in the United States?";
      Questions[2] = "What colour is a mirror?";
      Questions[3] = "What talks, has a head but never weeps, has a bed but. never sleeps?";
      Questions[4] = "Which is faster sound or light?";
      Questions[5] = "What is Mayfield's mascot's name";
      Questions[6] = "What is the first element on the periodic table?";
      Questions[7] = "What character has a nose that grows every time he lies?";
      Questions[8] = "What is Newton's second law?";
      Questions[9] = "What can’t talk but will reply when spoken to?";

        rightAnswer[0] = "Greenland";
        rightAnswer[1] = "Smith";
        rightAnswer[2] = "White";
        rightAnswer[3] = "River";
        rightAnswer[4] = "Light";
        rightAnswer[5] = "Marvin";
        rightAnswer[6] = "Hydrogen";
        rightAnswer[7] = "Pinocchio";
        rightAnswer[8] = "F=ma";
        rightAnswer[9] = "Echo";

         for (int count = 0; count < q; count++) { //assigning points for each question
            score[count] = count+1;}
            
        for (int count = 0; count < q; count++) { //asking the user for the answers for each questions
            System.out.print((count + 1) + ". " + Questions[count] + "(" + score[count] + " Points): ");
            userAnswer[count] = kb.next();
        }

        System.out.println("\nYou've reached the end! Time to see your results!!");

        for (int count = 0; count < q; count++) { // check if user answer is right or wrong answer
          System.out.print("\nQuestion " + (count + 1)+ ") " + userAnswer[count] + ": "); //will print out the question number with the correct response
     if (rightAnswer[count].equalsIgnoreCase(userAnswer[count])) { //if user input is equal to correct answer
                System.out.println("Right!");
                scores += score[count]; //final score
                possiblePoints += score[count]; //the possible score
            } else {
                System.out.println("Wrong!! The right answer is: " + rightAnswer[count]);
                possiblePoints += score[count];
            }
        }
         System.out.println("\nYour final score is: " + scores + "/" + possiblePoints);

        float marks = 100*(scores/possiblePoints);

        if (marks <= 20) { // messages for certain results
            System.out.println("C'mon do better!");}
         else if (marks> 20 && marks <= 40) {
            System.out.println("Closer...but still far off");}
        else if (marks > 40 && marks <= 60) { 
                    System.out.println("Eh, a mediocre score");}
        else if (marks > 60 && marks <= 80) {
            System.out.println("Smarty Pants!!!!");
        } else if (marks > 80 && marks <= 90) {
            System.out.println("Geunis LEVEL!!!");
        } else if (marks >= 100) {
            System.out.println("Award..goes...to most knowledgeable person ever!!!!");
        }


      

  }
}
