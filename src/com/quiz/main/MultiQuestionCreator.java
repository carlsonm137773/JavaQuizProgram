/**
 * File: MultiQuestionCreator.java
 * Project: JavaQuizProgram
 * Created by: Matthew Carlson
 * Email: carlsonm137773@student.vvc.edu
 * Date: Jul 7, 2019
 */
package com.quiz.main;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MultiQuestionCreator extends JPanel {
	

	private static final long serialVersionUID = 1L;
	
	MultiQuestionCreator() {
		setLayout(new GridBagLayout());
		
		GridBagConstraints c = new GridBagConstraints();
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		add(new JLabel("Question: "), c);
		
		c .gridy = 1;
		add(new JTextField(), c);
		
		
	}
	
	

}
