
public class Trivia {

	private String question;
	private String answer;
	private int difficulty;
	

	public Trivia() {
		this.setAnswer("");
		this.setDifficulty(1);
		this.setQuestion("");
	}
	public Trivia(String question, String answer, int difficulty) {
		this.question = question;
		this.answer = answer;
		this.difficulty = difficulty;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public int getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	
	
	
	
	
}
