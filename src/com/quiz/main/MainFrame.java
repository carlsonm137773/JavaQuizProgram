package com.quiz.main;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	public static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9;
	public static final String TITLE = "Quiz Program";
	
	private QuizCreator quizCreator;
	
	private static final long serialVersionUID = 1L;
	
	MainFrame(){
		super(TITLE);
		quizCreator = new QuizCreator();
		
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new BorderLayout());
		
		add(quizCreator, BorderLayout.CENTER);
		
		
		
	}

}
