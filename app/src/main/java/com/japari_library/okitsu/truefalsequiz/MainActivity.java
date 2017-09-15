package com.japari_library.okitsu.truefalsequiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button trueButton, falseButton, nextButton;
    private TextView questionText;
    private List<Question> questionBank;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        makeBank();
        wireWidgets();
        questionText.setText(questionBank.get(0).getQuestionText());
    }

    private void makeBank() {
        questionBank = new ArrayList<>();
        questionBank.add(new Question(getString(R.string.question1), true)); //haHAA
        questionBank.add(new Question(getString(R.string.question2), false)); //rawr xd owo what's this
        questionBank.add(new Question(getString(R.string.question3), true));
        questionBank.add(new Question(getString(R.string.question4), false));
        questionBank.add(new Question(getString(R.string.question5), true)); //MYAMYAMYAMYA TANOSHII
        questionBank.add(new Question(getString(R.string.question6), true));
    }

    private void wireWidgets() {
        trueButton = (Button) findViewById(R.id.button_true);
        falseButton = (Button) findViewById(R.id.button_false);
        nextButton = (Button) findViewById(R.id.button_next);
        questionText = (TextView) findViewById(R.id.text_question);
    }

    @Override
    public void onClick(View view) {

    }
}