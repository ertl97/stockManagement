package stockManagement.UI;

import java.util.Scanner;

import stockManagement.stockManagement.App;

public class Position {
	private static Scanner scan = new Scanner(System.in);
	private String input = "";

	public void articlePosition(){
		System.out.println("Geben Sie den Namen des gewünschten Artikels an:");
		input = scan.nextLine();

		App.getStorage().articlePosition(input);

	}
}
