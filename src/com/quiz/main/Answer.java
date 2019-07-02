package com.quiz.main;

public class Answer {
	private String answer;
	private ID id;
	
	
	/*
	 * Creates an Answer with a string and an id
	 * if the id == Correct it is the correct answer for the question
	 */
	Answer(String answer, ID id){
		this.answer = answer;
		this.id = id;
	}
	
	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id = id;
	}
}
