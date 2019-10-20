package com.jetbrains;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //This is the program to help kids with math or something that has to do with multiplication and the product
        int typed_num, numCorrect;
        boolean reset = true;
        char quit = 'y';
        Scanner sc  = new Scanner(System.in);
        SecureRandom rng = new SecureRandom();


        //System.out.println(rng.getMessage());

        //rng.setMessage("This is the message changed");

        // System.out.println(rng.getMessage());

        //rng.setMessage(" () (0-0) ()");

        //System.out.println(rng.getMessage());


        System.out.println("This is the Math problem");
        //loop for math problem quit
        do{
            int i = 0,lvl = 0;
            numCorrect = 0;
            System.out.println("Please enter the level you want using 1, 2, 3, or 4");
            lvl = sc.nextInt();
            while( i < 10){
                System.out.println("Please answer the following question correctly");
                rng.getNewRandom(lvl);

                System.out.println("What is " + rng.getNum_1() + " times " + rng.getNum_2() + " ? ");
                typed_num = sc.nextInt();

                if(typed_num == rng.getProduct()){
                    System.out.println(rng.getPosResponse());
                    numCorrect++;
                }

                else{

                    System.out.println( rng.getNegResponses());
                }

                i++;
                //System.out.println("would you like to continue y/n?");
                //quit = sc.next().charAt(0);
            }


            if((numCorrect  > 7.5)){
                System.out.println(" You got greater than a 7.5. with a " + (numCorrect * 10) + "%. You are ready to move on to the next level" );
            }

            else{
                System.out.println(" You got less than a 7.5. with a " + (numCorrect * 10) + "%. please see a teacher for help" );

            }
        } while(reset);

    }
    }

