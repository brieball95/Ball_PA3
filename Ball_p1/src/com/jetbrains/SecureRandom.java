package com.jetbrains;

public class SecureRandom {
        private int num_1;
        private int num_2;
        private int product;
        private String[] pResponses = {"Good Job!" , "You got it right! ", "Way to go!", "You're doing great!"};
        private String[] nResponses = {"nope", "Try again", "Please try again", "Please try again, you may want to consider tutoring."};
        String message = "Sending the message unchanged";

        public void getNewRandom(int lvl){

            switch(lvl){

                case 1:
                    int ran_1 = (int) (Math.random() * 10);
                    int ran_2 = (int) (Math.random() * 10);



                    this.num_1 = ran_1;
                    this.num_2 = ran_2;

                    this.product = num_1 * num_2;
                    break;
                case 2:

                    ran_1 = (int) (Math.random() * 100);
                    ran_2 = (int) (Math.random() * 100);



                    this.num_1 = ran_1;
                    this.num_2 = ran_2;

                    this.product = num_1 * num_2;
                    break;
                case 3:

                    ran_1 = (int) (Math.random() * 1000);
                    ran_2 = (int) (Math.random() * 1000);



                    this.num_1 = ran_1;
                    this.num_2 = ran_2;

                    this.product = num_1 * num_2;
                    break;
                case 4:
                    ran_1 = (int) (Math.random() * 10000);
                    ran_2 = (int) (Math.random() * 10000);



                    this.num_1 = ran_1;
                    this.num_2 = ran_2;

                    this.product = num_1 * num_2;
                    break;

                default:
                    break;

            }

        }

        public int getNum_1(){

            return num_1;
        }

        public int getNum_2(){

            return num_2;

        }

        public int getProduct(){

            return product;

        }

        public String getPosResponse(){
            int ran = (int) (Math.random() * 4);
            return pResponses[ran];

        }

        public String getNegResponses(){

            int ran = (int) (Math.random() * 4);
            return nResponses[ran];

        }

        public String getMessage(){

            return message;

        }

        public String setMessage( String x ){

            message = x;

            return " ";

        }
    }

