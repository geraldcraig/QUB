package uk.ac.qub.week14.solutions;

public class TextMatchQuestion extends Question {

	/**
	 * default constructor, not actually helpful maybe shouldnt exist...
	 */
	public TextMatchQuestion() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param questionText
	 * @param correctAnswer
	 * @param score
	 */
	public TextMatchQuestion(String questionText, String correctAnswer, int score) {
		super(questionText, correctAnswer, score);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Text match question so just compare given answer to expected
	 * return true/false - not case sensitive
	 * and print a result for context
	 * @param answer
	 */
	@Override
	public boolean checkAnswer(String answer) {
		System.out.println("Your answer was: "+answer);
		if (this.getCorrectAnswer().equalsIgnoreCase(answer.trim())){
			System.out.println("Correct!");
			return true;
		}else {
			System.out.println("Sorry this was incorrect!");
			System.out.println("The correct answer was: "+this.getCorrectAnswer());
			return false;
		}
	}
	
	/**
	 * Print text match Question as prompt
	 */
	@Override
	public void askQuestion() {
		System.out.println(this.getQuestionText());
		System.out.println("<Text match, not case sensitive>: ");
	}

}
