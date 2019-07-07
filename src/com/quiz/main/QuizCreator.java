/**
 * File: QuizCreator.java
 * Project JavaQuizProgram
 * Created by: Matthew Carlson
 * Email: carlsonm137773@student.vvc.edu
 * Date: Jul 1, 2019
 */
package com.quiz.main;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JFrame;

public class QuizCreator extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ArrayList<Question> questionArray;
	private String quizName; // quiz is saved as the quizName.csv
//	private static final String GETINFO = "Quiz Setup", MULTIQUESTION = "Multi Question",
//			NUMBERQUESTION = "Number Question";
	
//	JPanel getInfo;
	QuestionCreator questionCreator;

	QuizCreator() {

//		getInfo = new JPanel();
		
		questionCreator = new QuestionCreator();
		
		setLayout(new BorderLayout());

//		add(questionCreator, BorderLayout.CENTER);
		
//		setLayout(new CardLayout());
//		add(getInfo, GETINFO);
//		add(questionCreator, "QCreator");
		
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
