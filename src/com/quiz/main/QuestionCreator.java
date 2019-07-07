/**
 * File: QuestionCreator.java
 * Project JavaQuizProgram
 * Created by: Matthew Carlson
 * Email: carlsonm137773@student.vvc.edu
 * Date: Jul 6, 2019
 */
package com.quiz.main;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

public class QuestionCreator extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JPanel multiQuestion, numberQuestion;
	
	QuestionCreator() {
		multiQuestion = new JPanel();
//		numberQuestion = new JPanel();
		
//		setLayout(new CardLayout());
		setLayout(new BorderLayout());
	
		add(multiQuestion, BorderLayout.CENTER);
		
		multiQuestion.setLayout(new GridBagLayout());
		
		
//		add(multiQuestion, "multi question");
//		add(numberQuestion, "number question");
	}

}
