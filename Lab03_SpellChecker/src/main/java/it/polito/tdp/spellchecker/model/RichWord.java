package it.polito.tdp.spellchecker.model;

public class RichWord {

	private String word;
	private boolean correct;
	
	
	/**
	 * @param word
	 * @param correct
	 */
	public RichWord(String word, boolean correct) {
		super();
		this.word = word;
		this.correct = correct;
	}
	
	public RichWord(RichWord w) {
		this.word = w.word;
		this.correct = w.correct;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public boolean isCorrect() {
		return correct;
	}

	public void setCorrect(boolean correct) {
		this.correct = correct;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
}
