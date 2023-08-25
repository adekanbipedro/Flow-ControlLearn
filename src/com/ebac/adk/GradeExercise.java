package com.ebac.adk;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GradeExercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the Grade Report");
        System.out.println("To start press '1'!");
        int start = s.nextInt();

        s.nextLine();

        System.out.println("Insert Student Name");
        String nameStu = s.nextLine();
        String degree = "";
        if (nameStu.length() > 0){
            System.out.println("Put the Degree");
            degree = s.nextLine();
        }else{
            System.out.println("Please, put the Student Name");
            nameStu = s.nextLine();

    }
        System.out.println("Put the Test 1 of " + nameStu + " in the " + degree + " Degree." );
        int grade1 = s.nextInt();
        System.out.println("Put the Test 2 of " + nameStu + " in the " + degree + " Degree." );
        int grade2 = s.nextInt();
        System.out.println("Put the Activities of " + nameStu + " in the " + degree + " Degree." );
        int grade3 = s.nextInt();

        System.out.println("Processing...");

        System.out.println("\n\n\nGrades Submited!");

        System.out.println("\n\n\nIf want to see the final results press '1' to end press '2'.");
        int finaloption = s.nextInt();
        if (finaloption == 1){
            System.out.println("Final Result");
            System.out.println("************************");
            System.out.println("Student Name: " + nameStu + "\n\nDegree: " + degree);
            System.out.println("Test 1: " + grade1 + "\n\nTest 2: " + grade2 + "\n\nActivities: " + grade3);
            int avg = (grade1+grade2+grade3)/3;
            System.out.println("Average: " + (avg));

                if (avg >= 7){
                    System.out.println("Final Result: Aproved");
                } else if (avg < 7 && 5 >= avg){
                    System.out.println("Final Result: Retake Test");
            }else if (avg < 5){
                    System.out.println("Final Result: Failed");
                }
        } else if (finaloption == 2) {
            System.out.println("Thanks for your time!");

        }

    }

    }