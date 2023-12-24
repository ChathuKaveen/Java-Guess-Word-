import java.util.Random;

public class randomWords {
	private String[] words= {"apple", "banana", "orange", "grape", "kiwi",
            "dog", "cat", "bird", "fish", "rabbit",
            "java", "python", "javascript", "html", "css"};
	private String selectedword;
	private Random random = new Random();
	private char[] letters;
	
	public randomWords() {
		 selectedword=words[random.nextInt(words.length)];
		 letters=new char[selectedword.length()];
	}

	public String toString() {
		StringBuilder text = new StringBuilder();
		
		for(char letter:letters) {
			text.append(letter=='\u0000' ? '_': letter);
			
			text.append(' ');
		}
		return text.toString();
	}
	
	public void guess(char letter) {
		for(int i=0;i<selectedword.length();i++) {
			if(letter==selectedword.charAt(i)) {
				letters[i]=letter;
			}
		}
	}
	
	public boolean isGuessedRight() {
		for(char letter:letters) {
			if(letter =='\u0000') {
				return false;
			}
		}return true;
	}
}

