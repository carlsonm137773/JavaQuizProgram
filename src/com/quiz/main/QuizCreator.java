package com.quiz.main;

import java.util.ArrayList;

public class QuizCreator {
	ArrayList<Question> questionArray;
	private String quizName; //quiz is saved as the quizName.csv
	
	QuizCreator(){
		
	}
	
	public void setQuizName(String quizName) {
		this.quizName = quizName;
	}
	
	public String getQuizName() {
		return quizName;
	}
	
	public void addQuestion(Question question) {
		questionArray.add(question);
	}
	
	public void saveToFile(String fileName) {
		// save quiz to a file
	}
	
	public void loadFromFile(String fileName) {
		
	}
	
}
