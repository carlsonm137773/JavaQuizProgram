/**
 * File: NumberQuestion.java
 * Project JavaQuizProgram
 * Created by: Matthew Carlson
 * Email: carlsonm137773@student.vvc.edu
 * Date: Jul 1, 2019
 */

package com.quiz.main;

public class NumberQuestion extends Question {

	private String answer;

	NumberQuestion(String question) {
		super(question);
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public boolean checkAnswer() {
		return false;
	}

}
