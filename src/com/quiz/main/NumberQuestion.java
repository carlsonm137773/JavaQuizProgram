/*
 * This class holds a numeric question
 * requires the user to input a number and if the number is within x of the answer will be scored as correct
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
