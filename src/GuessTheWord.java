import java.util.Scanner;

public class GuessTheWord {
	private boolean play=true;
	private randomWords randomword= new randomWords();
	private Scanner scanner =new Scanner(System.in);
	public void start() {
		do {
			showWord();
			getInput();
			checkInput();
		}while(play);
		
		}
	void showWord() {
		System.out.println(randomword);
	}
	void getInput() {
		System.out.println("Guess The Letter");
		String userguess=scanner.nextLine();
		
		randomword.guess(userguess.charAt(0));
	}
	void checkInput() {
		if(randomword.isGuessedRight()) {
			System.out.println("Congratulation, word is "+ randomword);
			play=false;
		}
	}
	public void end() {
		scanner.close();
	}
}
