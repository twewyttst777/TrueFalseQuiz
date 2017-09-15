package com.japari_library.okitsu.truefalsequiz;

import java.util.List;

/**
 * Created by per6 on 9/15/17.
 */

public class Question {

    private String questionText;
    private boolean answer;

    public Question(String questionText, boolean answer) {
        this.questionText = questionText;
        this.answer = answer;
    }


    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }

    /**
     * @param answer what the user picked
     * @return if it matches the correct answer
     */
    public boolean checkAnswer(boolean answer) {
        return this.answer == answer;
    }
}
