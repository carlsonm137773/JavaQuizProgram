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

public class MainFrame extends JFrame {

	public static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9;
	public static final String TITLE = "Quiz Program";

	private QuizCreator quizCreator;

	private static final long serialVersionUID = 1L;

	MainFrame() {
		super(TITLE);
		quizCreator = new QuizCreator();

		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new BorderLayout());

		add(quizCreator, BorderLayout.CENTER);

	}

}
