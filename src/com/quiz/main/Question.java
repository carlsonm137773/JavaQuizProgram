package com.quiz.main;

import java.util.LinkedList;

public abstract class Question {
	private String question;
	LinkedList<Answer> answerList;
	
	Question(String question){
		answerList = new LinkedList<Answer>();
		this.question = question;
	}
	
	//Somehow asks the user the question and returns true if answer is correct
	public boolean askQuestion() {
		return true;
	}
	
	public void addQuestion(Answer answer){
		answerList.add(answer);
	}
	
	public void removeAnswer(Answer answer) {
		answerList.remove(answer);
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	
}
