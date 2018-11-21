package com.example.hari.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyLog";
    private static final String CURRENT_QUESTION = "CURRENT_QUESTION";

    private Quiz quiz = null;

    private Button nextButton;
    private Button previousButton;
    private TextView question;
    private RadioButton optionA;
    private RadioButton optionB;
    private RadioButton optionC;
    private RadioButton optionD;


    private int currentQuestionId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quiz = new Quiz();

        currentQuestionId = 0;


        nextButton = (Button) findViewById(R.id.nextButton);
        previousButton = (Button) findViewById(R.id.prevButton);
        question = (TextView) findViewById(R.id.textViewQuestion);
        optionA = (RadioButton) findViewById(R.id.radioButtonA);
        optionB = (RadioButton) findViewById(R.id.radioButtonB);
        optionC = (RadioButton) findViewById(R.id.radioButtonC);
        optionD = (RadioButton) findViewById(R.id.radioButtonD);

        this.drawQuestion(currentQuestionId);

        nextButton.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        if(currentQuestionId < quiz.getNumberOfQuestions()){
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
                        if(currentQuestionId > 0){
                            drawPreviousQuestion();
                        }
                    }
                }
        );



    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
//        Should call Super Class Method First
        super.onSaveInstanceState(savedInstanceState);

        Log.i(TAG ,"Saving Instance :"+Integer.toString(currentQuestionId));
        savedInstanceState.putInt(CURRENT_QUESTION , this.currentQuestionId);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState){

//        Should call Super Class Method first
        super.onRestoreInstanceState(savedInstanceState);

        this.currentQuestionId = savedInstanceState.getInt(CURRENT_QUESTION);
        this.drawQuestion(this.currentQuestionId);
    }

    private void drawNextQuestion(){
        question.setText(quiz.getQuestion(currentQuestionId +1));
        optionA.setText(quiz.getOptionA(currentQuestionId +1));
        optionB.setText(quiz.getOptionB(currentQuestionId +1));
        optionC.setText(quiz.getOptionC(currentQuestionId +1));
        optionD.setText(quiz.getOptionD(currentQuestionId +1));
        currentQuestionId++;
    }

    private void drawQuestion(int questionIndex){
        question.setText(quiz.getQuestion(questionIndex));
        optionA.setText(quiz.getOptionA(questionIndex));
        optionB.setText(quiz.getOptionB(questionIndex));
        optionC.setText(quiz.getOptionC(questionIndex));
        optionD.setText(quiz.getOptionD(questionIndex));
//        currentQuestionId++;
    }

    private void drawPreviousQuestion(){
        question.setText(quiz.getQuestion(currentQuestionId -1));
        optionA.setText(quiz.getOptionA(currentQuestionId -1));
        optionB.setText(quiz.getOptionB(currentQuestionId -1));
        optionC.setText(quiz.getOptionC(currentQuestionId -1));
        optionD.setText(quiz.getOptionD(currentQuestionId -1));
        currentQuestionId--;
    }
}
