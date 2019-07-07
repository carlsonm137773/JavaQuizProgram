/**
 * File: MainFrame.java
 * Project JavaQuizProgram
 * Created by: Matthew Carlson
 * Email: carlsonm137773@student.vvc.edu
 * Date: Jul 1, 2019
 */
package com.quiz.main;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame {

	public static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9;
	public static final String TITLE = "Quiz Program";

	private QuizCreator quizCreator;


	MainFrame() {
		JFrame frame = new JFrame(TITLE);
		
		
		quizCreator = new QuizCreator();

		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		frame.setLayout(new BorderLayout());

		frame.add(quizCreator, BorderLayout.CENTER);

	}

}
