package com.quiz.main;

public abstract class Question {
	private String question;
	
	Question(String question){
		this.question = question;
	}
	
	public abstract boolean checkAnswer(); 
	
	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	
}
