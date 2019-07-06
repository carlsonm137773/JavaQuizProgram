/**
 * File: Quiz.java
 * Project JavaQuizProgram
 * Created by: Matthew Carlson
 * Email: carlsonm137773@student.vvc.edu
 * Date: Jul 1, 2019
 */
package com.quiz.main;

import java.util.ArrayList;

import javax.swing.JPanel;

public class Quiz {

	JPanel panel;

	private ArrayList<Question> questionArray;
	private String quizName;
	private int correctCount;
	private ArrayList<Question> incorrectArray;

	Quiz(String quizName) {
		this.quizName = quizName;
		correctCount = 0;

		loadQuizFromFile();

		panel = new JPanel();
	}

	public String getQuizName() {
		return quizName;
	}

	public void takeQuiz() {

	}

	public int getCorrectCount() {
		return correctCount;
	}

	private void loadQuizFromFile() {
		// file in for the quiz file name = quizName.csv
	}
}
