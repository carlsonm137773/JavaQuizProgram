package com.quiz.main;

import java.util.ArrayList;

public class Quiz {
	
	private ArrayList<Question> questionArray;
	private String quizName;
	private int correctCount;
	private ArrayList<Question> incorrectArray;
	
	Quiz(String quizName){
		this.quizName = quizName;
		correctCount = 0;
	}
	
	public String getQuizName() {
		return quizName;
	}
	
	public void takeQuiz() {
		for(Question q : questionArray) {
			if(q.askQuestion()) {
				correctCount ++;
			}
			else {
				incorrectArray.add(q);
			}
		}
	}
	
	public int getCorrectCount() {
		return correctCount;
	}
}
