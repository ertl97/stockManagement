package stockManagement.UI;

import java.util.Scanner;

import stockManagement.stockManagement.App;

/**
 *
 *
 * @author Daniel
 *
 */

public class Swap {

	private static Scanner scan = new Scanner(System.in);
	private int input = 0;

	public void swapArticle(){

		System.out.println("Geben Sie den Namen des auszulagernden Artikels an:");
		input = scan.nextInt();
		App.getStorage().swapArticle(input);
	}

}
