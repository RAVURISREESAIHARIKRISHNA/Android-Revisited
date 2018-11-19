package com.example.hari.quizapp;



public class Quiz {
    private int NUMBER_OF_QUESTIONS = 9; //Return Number of Indices
    private String[] questions={"Question 1 Text" , "Question 2 Text","Question 3 Text","Question 4 Text","Question 5 Text","Question 6 Text","Question 7 Text","Question 8 Text","Question 9 Text","Question 10 Text"};
    private String[] optionA ={"1a","2a","3a","4a","5a","6a","7a","8a","9a","10a"};
    private String[] optionB ={"1b","2b","3b","4b","5b","6b","7b","8b","9b","10b"};
    private String[] optionC ={"1c","2c","3c","4c","5c","6c","7c","8c","9c","10c"};
    private String[] optionD ={"1d","2d","3d","4d","5d","6d","7d","8d","9d","10d"};

    public String getQuestion(int questionIndex){
        return this.questions[questionIndex];
    }

    public String getOptionA(int optionAIndex){
        return this.optionA[optionAIndex];
    }

    public String getOptionB(int optionBIndex){
        return this.optionB[optionBIndex];
    }

    public String getOptionC(int optionCIndex){
        return this.optionC[optionCIndex];
    }

    public String getOptionD(int optionDIndex){
        return this.optionD[optionDIndex];
    }

    public int getNumberOfQuestions(){
        return NUMBER_OF_QUESTIONS;
    }

}
