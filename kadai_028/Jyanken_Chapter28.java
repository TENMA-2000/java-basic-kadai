package kadai_028;

import java.util.Scanner;

public class Jyanken_Chapter28 {

	public String getMychoice() {

		System.out.println("自分のじゃんけんの手を入力してください(r、s、p)");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine().trim().toLowerCase();

		switch (input) {
			case "r":
			case "s":
			case "p":
				return input;
		default:
			System.out.println("無効な入力です。");
			return getMychoice(); //再度入力を促す
		}

	}

	public String getRandom() {
		
		String[] choices = {"r", "s", "p"};
		int randomIndex = (int) Math.floor(Math.random() * choices.length);
		String randomChoice = choices[randomIndex];
		System.out.println("相手の手は:" + randomChoice);
		return randomChoice;

	}

	public void playGame() {
		
		String myChoice = getMychoice();
		String opponentChoice = getRandom();
		
		System.out.println("あなたの手は:" + myChoice);
		
		if(myChoice.equals(opponentChoice)) {
			System.out.println("あいこです");
		}else if((myChoice.equals("r") && opponentChoice.equals("s")) ||
				(myChoice.equals("s") && opponentChoice.equals("p")) ||
				(myChoice.equals("p") && opponentChoice.equals("r"))) {
			System.out.println("あなたの勝ちです");
		}else {
			System.out.println("あなたの負けです");
		}
	}
}
