/**
 * File: MultiQuestion.java
 * Project JavaQuizProgram
 * Created by: Matthew Carlson
 * Email: carlsonm137773@student.vvc.edu
 * Date: Jul 1, 2019
 */
package com.quiz.main;

import java.util.LinkedList;

public class MultiQuestion extends Question {

	LinkedList<Answer> answerList;

	MultiQuestion(String question) {
		super(question);
		answerList = new LinkedList<Answer>();
	}

	public void addAnswer(Answer answer) {
		answerList.add(answer);
	}

	public void removeAnswer(Answer answer) {
		answerList.remove(answer);
	}

	@Override
	public boolean checkAnswer() {
		// TODO Auto-generated method stub
		return false;
	}

}
