package uk.ac.qub.week14.solutions;

public abstract class Question {
	
	private String questionText;
	private String correctAnswer;
	private int score;
	
	/**
	 * default constructor
	 */
	public Question() {
		
	}
	
	/**
	 * @param questionText
	 * @param correctAnswer
	 * @param score
	 */
	public Question(String questionText, String correctAnswer, int score) {
		this.questionText = questionText;
		this.correctAnswer = correctAnswer;
		this.score = score;
	}

	/**
	 * @return the questionText
	 */
	public String getQuestionText() {
		return questionText;
	}

	//auto generated getters and setters
	/**
	 * @param questionText the questionText to set
	 */
	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	/**
	 * @return the correctAnswer
	 */
	public String getCorrectAnswer() {
		return correctAnswer;
	}

	/**
	 * @param correctAnswer the correctAnswer to set
	 */
	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}
	
	/**
	 * All Questions which extend this class must provide an implementation of 
	 * a method which checks the provided answer against the expected one
	 * @param answer
	 * @return
	 */
	public abstract boolean checkAnswer(String answer);
	
	/**
	 * Present appropriately formatted question text to console
	 */
	public abstract void askQuestion();
	
}
