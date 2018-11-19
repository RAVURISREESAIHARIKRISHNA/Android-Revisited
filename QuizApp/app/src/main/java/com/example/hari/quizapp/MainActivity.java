package com.example.hari.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Quiz quiz = null;

    private Button nextButton;
    private Button previousButton;
    private TextView question;
    private RadioButton optionA;
    private RadioButton optionB;
    private RadioButton optionC;
    private RadioButton optionD;


    private int cuurentQuestionId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quiz = new Quiz();

        cuurentQuestionId = 0;


        nextButton = (Button) findViewById(R.id.nextButton);
        previousButton = (Button) findViewById(R.id.prevButton);
        question = (TextView) findViewById(R.id.textViewQuestion);
        optionA = (RadioButton) findViewById(R.id.radioButtonA);
        optionB = (RadioButton) findViewById(R.id.radioButtonB);
        optionC = (RadioButton) findViewById(R.id.radioButtonC);
        optionD = (RadioButton) findViewById(R.id.radioButtonD);

        this.drawQuestion(cuurentQuestionId);

        nextButton.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        if(cuurentQuestionId < quiz.getNumberOfQuestions()){
                            drawNextQuestion();
                        }
                    }
                }
        );
//TODO: Radio Button Selection Issue should be Fixed
        previousButton.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View v){
                        if(cuurentQuestionId > 0){
                            drawPreviousQuestion();
                        }
                    }
                }
        );



    }

    private void drawNextQuestion(){
        question.setText(quiz.getQuestion(cuurentQuestionId +1));
        optionA.setText(quiz.getOptionA(cuurentQuestionId +1));
        optionB.setText(quiz.getOptionB(cuurentQuestionId +1));
        optionC.setText(quiz.getOptionC(cuurentQuestionId +1));
        optionD.setText(quiz.getOptionD(cuurentQuestionId +1));
        cuurentQuestionId++;
    }

    private void drawQuestion(int questionIndex){
        question.setText(quiz.getQuestion(questionIndex));
        optionA.setText(quiz.getOptionA(questionIndex));
        optionB.setText(quiz.getOptionB(questionIndex));
        optionC.setText(quiz.getOptionC(questionIndex));
        optionD.setText(quiz.getOptionD(questionIndex));
//        cuurentQuestionId++;
    }

    private void drawPreviousQuestion(){
        question.setText(quiz.getQuestion(cuurentQuestionId -1));
        optionA.setText(quiz.getOptionA(cuurentQuestionId -1));
        optionB.setText(quiz.getOptionB(cuurentQuestionId -1));
        optionC.setText(quiz.getOptionC(cuurentQuestionId -1));
        optionD.setText(quiz.getOptionD(cuurentQuestionId -1));
        cuurentQuestionId--;
    }
}
